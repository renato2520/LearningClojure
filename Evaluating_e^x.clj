(ns com.clojure.examples
  (:use '[clojure.string :only (split triml)]))

(let [n_t (read-line) n (Integer/parseInt n_t)]
  (loop [a0 n]
    (when (> a0 0)
      (let [x_t (read-line) x (Float/parseFloat x_t)]
        (println (format "%.4f" (e-x x 10))))
      (recur (- a0 1)))))

(defn e-x [x n]
  (loop [acc 0 n n]
    (if (< n 1)
      acc
      (recur (+ acc (/ (pow x (- n 1)) (factorial (- n 1)))) (dec n)))))

(defn pow [x n]
  (loop [acc 1 n n]
    (if (zero? n)
      acc
      (recur (* x acc) (dec n)))))

(defn factorial [n]
  (loop [cnt n acc 1]
    (if (zero? cnt)
      acc
      (recur (dec cnt) (* acc cnt)))))

(comment "
(println (format \"%.4f\"
                 ((fn [x n]
                    (loop [acc 0 n n]
                      (Iif (I< n 1)
                        acc
                        (recur (+ acc (/ ((fn [x n]
                                            (loop [acc 1 n n]
                                              (if (zero? n)
                                                acc
                                                (recur (* x acc) (dec n))))) x (- n 1))
                                         ((fn factorial [n]
                                            (loop [cnt n acc 1]
                                              (if (zero? cnt)
                                                acc
                                                (recur (dec cnt) (* acc cnt))))) (- n 1)))) (dec n))))) 20.0 10)))
")
