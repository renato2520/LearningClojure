(ns com.clojure.examples
  (:gen-class))

(+ 2 3)

(/ 4 3)

(mod 3 2)

(max 1 2 5 3 -1)

(min 5 3 1 2 4)

(defn power [x n]
  (reduce * (repeat n x)))
(power 2 10)

(+ (bigint Long/MAX_VALUE) 10)

(+ 9223372036854775807N 10N)
