;;   Copyright (c) Nicola Mometto, Rich Hickey & contributors.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file epl-v10.html at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.

(ns clojure.tools.analyzer.passes.js.validate
  (:require [clojure.tools.analyzer.ast :refer [prewalk]]
            [clojure.tools.analyzer.passes.cleanup :refer [cleanup]]
            [clojure.tools.analyzer.utils :refer [source-info resolve-var resolve-ns]]))

(defmulti -validate :op)
(defmethod -validate :default [ast] ast)

(defmethod -validate :maybe-class [{:keys [class env] :as ast}]
  (throw (ex-info (str "Cannot resolve: " class)
                  (merge {:sym class
                          :ast prewalk ast cleanup}
                         (source-info env)))) )

(defn validate-tag [t {:keys [env] :as ast}]
  (let [tag (ast t)]
    (if (symbol? tag)
      (if-let [var (resolve-var tag env)]
        (if (or (= :type (:op var))
                (:protocol (meta var)))
          (symbol (:ns var) (:name var))
          (throw (ex-info (str "Not type/protocol var used as a tag: " t)
                          (merge {:var var
                                  :ast (prewalk ast cleanup)}
                                 (source-info env)))))
        (if (or ('#{boolean string number clj-nil any function object array} tag)
                (and (namespace tag)
                     (not (resolve-ns (symbol (namespace tag))))))
          tag
          (throw (ex-info (str "Cannot resolve: " tag)
                          (merge {:sym tag
                                  :ast (prewalk ast cleanup)}
                                 (source-info env))))))
      (throw (ex-info (str "Invalid tag: " tag)
                      (merge {:tag tag
                              :ast (prewalk ast cleanup)}
                             (source-info env)))))))

(defn validate [ast]
  (merge (-validate ast)
         (when (:tag ast)
           {:tag (validate-tag :tag ast)})
         (when (:return-tag ast)
           {:return-tag (validate-tag :return-tag ast)})))