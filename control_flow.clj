(ns com.clojure.examples
  (:gen-class))

(if true
  (println "This is always printed")
  (println "This is never printed"))
;;-----------------------------------------------------------------

(if true
  (do
    (println "one")
    (println "two")))
;;-----------------------------------------------------------------

(defn positive-number-seq [numbers]
  (if-let [pos-nums (seq (filter pos? numbers))]
    pos-nums
    "no positive numbers"))

(positive-number-seq [-1 -2 1 2 3 4 5 6])
(positive-number-seq [-1 -2])
;;-----------------------------------------------------------------


(when true
  (println "one")
  (println "two"))
;;-----------------------------------------------------------------

(when-let [pos-nums (filter pos? [ -1 -2 1 2 ])]
  pos-nums
  (println "one")
  (println "two"))
;;-----------------------------------------------------------------

(defn case-test-1 [n]
  (case n
    1 "n is 1"
    2 "n is 2"
    "n is other"))

(println predicate(case-test-1 333))
;;-----------------------------------------------------------------

(defn cond-test [n]
  (cond
    (= n 1) "n is 1"
    (and (> n 3) (< n 10)) "n is over 3 and under 10"
    :else "n is other"))

(println (cond-test 1))
(println (cond-test 5))
(println (cond-test 15))
;;-----------------------------------------------------------------

(defn condp-test-2 [n]
  (condp contains? n
    [1 2 3] "n is either 1 or 2 or 3"
    "n is not 1 or 2 or 3"))

(println (condp-test-2 5))
