(ns defdebug.core)

(defmacro defnDEBUG
  [name & args]
  (let [fdecl (if (string? (first args)) (next args) args)
        fdecl (if (map? (first fdecl)) (rest fdecl) fdecl)
        fdecl (first args)
        body (rest args)
        body (into body (map (fn [sym] `(def ~sym ~sym)) fdecl))]
    `(defn ~name ~fdecl ~@body)))
