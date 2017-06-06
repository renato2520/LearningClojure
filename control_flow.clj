(ns com.clojure.examples
  (:gen-class))

(if true
  (println "This is always printed")
  (println "This is never printed"))

(if true
  (do
    (println "one")
    (println "two")))

(defn positive-number-seq [numbers]
  (if-let [pos-nums (seq (filter pos? numbers))]
    pos-nums
    "no positive numbers"))

(positive-number-seq [-1 -2 1 2 3 4 5 6])

(positive-number-seq [-1 -2])
