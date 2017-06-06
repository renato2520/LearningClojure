(ns com.clojure.examples
  (:gen-class))

(println (type 'teste))

(let [l "light"] (println (str "Dog said let there be " l)))

(let [a "aaa"]
  (let [a "AAA"]
    (println a))
  (println a))

(let [a "a"]
  (let []
    (println a)))

(def object "light")
(println (str "Dog said let there be " object))

