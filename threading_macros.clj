(ns com.clojure.examples
  (:gen-class))

(conj (conj (conj [] 1) 2) 3)

(-> []
    (conj 1)
    (conj 2)
    (conj 3))

(->> ["Japan" "China" "Korea"]
     (map clojure.string/upper-case)
     (map #(str "Hello " %)))
