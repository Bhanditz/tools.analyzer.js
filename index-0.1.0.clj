{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url "http://clojure.github.com/tools.analyzer.js/js-api.html",
   :name "clojure.tools.analyzer.js",
   :doc
   "Analyzer for clojurescript code, extends tools.analyzer with JS specific passes/forms"}
  {:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/fe540b1ed077e8afb2991da98ea08be1fd9dfa5d/src/main/clojure/clojure/tools/analyzer/passes/js/analyze_host_expr.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js/passes.js.analyze-host-expr-api.html",
   :name "clojure.tools.analyzer.passes.js.analyze-host-expr",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/annotate_tag.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js/passes.js.annotate-tag-api.html",
   :name "clojure.tools.analyzer.passes.js.annotate-tag",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/collect_keywords.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js/passes.js.collect-keywords-api.html",
   :name "clojure.tools.analyzer.passes.js.collect-keywords",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/2372c069772168d7c6c46a53c7fce8bcb795cd1e/src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js/passes.js.emit-form-api.html",
   :name "clojure.tools.analyzer.passes.js.emit-form",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/infer_tag.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js/passes.js.infer-tag-api.html",
   :name "clojure.tools.analyzer.passes.js.infer-tag",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.analyzer.js/blob/fe540b1ed077e8afb2991da98ea08be1fd9dfa5d/src/main/clojure/clojure/tools/analyzer/passes/js/validate.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js/passes.js.validate-api.html",
   :name "clojure.tools.analyzer.passes.js.validate",
   :doc nil}),
 :vars
 ({:arglists ([form] [form env] [form env opts]),
   :name "analyze",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L455",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/analyze",
   :doc
   "Returns an AST for the form.\n\nBinds tools.analyzer/{macroexpand-1,create-var,parse} to\ntools.analyzer.js/{macroexpand-1,create-var,parse} and analyzes the form.\n\nIf provided, opts should be a map of options to analyze, currently the only valid\noptions are :bindings and :passes-opts.\nIf provided, :bindings should be a map of Var->value pairs that will be merged into the\ndefault bindings for tools.analyzer, useful to provide custom extension points.\nIf provided, :passes-opts should be a map of pass-name-kw->pass-config-map pairs that\ncan be used to configure the behaviour of each pass.\n\nE.g.\n(analyze form env {:bindings  {#'ana/macroexpand-1 my-mexpand-1}})\n\nCalls `run-passes` on the AST.",
   :var-type "function",
   :line 455,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:arglists ([ns]),
   :name "analyze-ns",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L490",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/analyze-ns",
   :doc
   "Analyzes a whole namespace, returns a vector of the ASTs for all the\ntop-level ASTs of that namespace.",
   :var-type "function",
   :line 490,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:arglists ([]),
   :name "backup-env",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L522",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/backup-env",
   :doc
   "Caches the current namespaces state in a resource file, can be restored with\n(restore-env)",
   :var-type "function",
   :line 522,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:arglists ([]),
   :name "cljs-env->env",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L554",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/cljs-env->env",
   :doc
   "Converts the namespace map of the current cljs environment in a tools.analyzer.js\nnamespace map and returns it.",
   :var-type "function",
   :line 554,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:arglists ([sym {:keys [ns]}]),
   :name "create-var",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L190",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/create-var",
   :doc "Creates a var map for sym and returns it.",
   :var-type "function",
   :line 190,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:file "src/main/clojure/clojure/tools/analyzer/js.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L432",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/default-passes",
   :namespace "clojure.tools.analyzer.js",
   :line 432,
   :var-type "var",
   :doc
   "Set of passes that will be run by default on the AST by #'run-passes",
   :name "default-passes"}
  {:arglists ([]),
   :name "empty-env",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L71",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/empty-env",
   :doc "Returns an empty env map",
   :var-type "function",
   :line 71,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:file "src/main/clojure/clojure/tools/analyzer/js.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L52",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/parse",
   :namespace "clojure.tools.analyzer.js",
   :line 52,
   :var-type "multimethod",
   :doc "Extension to tools.analyzer/-parse for CLJS special forms",
   :name "parse"}
  {:arglists ([]),
   :name "restore-env",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L537",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/restore-env",
   :doc "Uses a cached env to populate the default namespace map",
   :var-type "function",
   :line 537,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:arglists ([ast]),
   :name "run-passes",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L449",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/run-passes",
   :doc
   "Function that will be invoked on the AST tree immediately after it has been constructed,\nby default set-ups and runs the default passes declared in #'default-passes",
   :var-type "function",
   :line 449,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:arglists ([]),
   :name "setup-rt!",
   :namespace "clojure.tools.analyzer.js",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L543",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/setup-rt!",
   :doc
   "Setups the basic runtime, loading cljs.core and initializing cljs.user",
   :var-type "function",
   :line 543,
   :file "src/main/clojure/clojure/tools/analyzer/js.clj"}
  {:file "src/main/clojure/clojure/tools/analyzer/js.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/a1cd6e87d46e238db65feb9b3797c897f47e1d10/src/main/clojure/clojure/tools/analyzer/js.clj#L48",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//js-api.html#clojure.tools.analyzer.js/specials",
   :namespace "clojure.tools.analyzer.js",
   :line 48,
   :var-type "var",
   :doc "Set of the special forms for clojurescript",
   :name "specials"}
  {:file
   "src/main/clojure/clojure/tools/analyzer/passes/js/analyze_host_expr.clj",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/fe540b1ed077e8afb2991da98ea08be1fd9dfa5d/src/main/clojure/clojure/tools/analyzer/passes/js/analyze_host_expr.clj",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/fe540b1ed077e8afb2991da98ea08be1fd9dfa5d/src/main/clojure/clojure/tools/analyzer/passes/js/analyze_host_expr.clj#L13",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.analyze-host-expr-api.html#clojure.tools.analyzer.passes.js.analyze-host-expr/analyze-host-expr",
   :namespace "clojure.tools.analyzer.passes.js.analyze-host-expr",
   :line 13,
   :var-type "multimethod",
   :doc
   "Transform :host-interop nodes into :host-call, transform\n:maybe-class or :maybe-host-form nodes resolvable to js vars\ninto :js-var nodes",
   :name "analyze-host-expr"}
  {:arglists ([ast]),
   :name "annotate-tag",
   :namespace "clojure.tools.analyzer.passes.js.annotate-tag",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/annotate_tag.clj#L80",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/annotate_tag.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.annotate-tag-api.html#clojure.tools.analyzer.passes.js.annotate-tag/annotate-tag",
   :doc
   "If the AST node type is a constant object or contains :tag metadata,\nattach the appropriate :tag to the node.",
   :var-type "function",
   :line 80,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/js/annotate_tag.clj"}
  {:arglists ([ast]),
   :name "collect-keywords",
   :namespace "clojure.tools.analyzer.passes.js.collect-keywords",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/collect_keywords.clj#L13",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/collect_keywords.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.collect-keywords-api.html#clojure.tools.analyzer.passes.js.collect-keywords/collect-keywords",
   :doc
   "Assoc compilation-unit shared id to each :const node with :type :keyword,\nThe keyword to id map is available in the global env under ::keywords",
   :var-type "function",
   :line 13,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/js/collect_keywords.clj"}
  {:arglists ([ast] [ast opts]),
   :name "emit-form",
   :namespace "clojure.tools.analyzer.passes.js.emit-form",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/2372c069772168d7c6c46a53c7fce8bcb795cd1e/src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj#L28",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/2372c069772168d7c6c46a53c7fce8bcb795cd1e/src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.emit-form-api.html#clojure.tools.analyzer.passes.js.emit-form/emit-form",
   :doc
   "Return the form represented by the given AST\nOpts is a set of options, valid options are:\n * :hygienic\n * :qualified-symbols",
   :var-type "function",
   :line 28,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj"}
  {:arglists ([ast]),
   :name "emit-hygienic-form",
   :namespace "clojure.tools.analyzer.passes.js.emit-form",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/2372c069772168d7c6c46a53c7fce8bcb795cd1e/src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj#L39",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/2372c069772168d7c6c46a53c7fce8bcb795cd1e/src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.emit-form-api.html#clojure.tools.analyzer.passes.js.emit-form/emit-hygienic-form",
   :doc "Return an hygienic form represented by the given AST",
   :var-type "function",
   :line 39,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/js/emit_form.clj"}
  {:arglists ([{:keys [tag], :as ast}]),
   :name "infer-tag",
   :namespace "clojure.tools.analyzer.passes.js.infer-tag",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/infer_tag.clj#L183",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/f675b7b1084ce5ad4fc8241d12138fe26b025c80/src/main/clojure/clojure/tools/analyzer/passes/js/infer_tag.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.infer-tag-api.html#clojure.tools.analyzer.passes.js.infer-tag/infer-tag",
   :doc
   "Performs local type inference on the AST adds, when possible,\none or more of the following keys to the AST:\n* :tag        represents the type the expression represented by the node\n* :return-tag implies that the node will return a function whose\n              invocation will result in a object of this type\n* :arglists   implies that the node will return a function with\n              this arglists\n* :ignore-tag true when the node is untyped, does not imply that\n              all untyped node will have this",
   :var-type "function",
   :line 183,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/js/infer_tag.clj"}
  {:arglists ([ast]),
   :name "validate",
   :namespace "clojure.tools.analyzer.passes.js.validate",
   :source-url
   "https://github.com/clojure/tools.analyzer.js/blob/fe540b1ed077e8afb2991da98ea08be1fd9dfa5d/src/main/clojure/clojure/tools/analyzer/passes/js/validate.clj#L58",
   :raw-source-url
   "https://github.com/clojure/tools.analyzer.js/raw/fe540b1ed077e8afb2991da98ea08be1fd9dfa5d/src/main/clojure/clojure/tools/analyzer/passes/js/validate.clj",
   :wiki-url
   "http://clojure.github.com/tools.analyzer.js//passes.js.validate-api.html#clojure.tools.analyzer.passes.js.validate/validate",
   :doc
   "Validate tags and symbols.\nThrows exceptions when invalid forms are encountered",
   :var-type "function",
   :line 58,
   :file
   "src/main/clojure/clojure/tools/analyzer/passes/js/validate.clj"})}