(ns com.clojure.examples
  (:gen-class))

(defn fibo-recur [iteration]
  (let [fibo (fn [one two n]
               (if (= iteration n)
                 one
                 (recur two (+ one two) (inc n))))]
    (fibo 0N 1N 0)))

(fibo-recur 6)

(defn count-down [result n]
  (if (= n 0)
    result
    (recur (conj result n) (dec n))))

(count-down [] 5)

(defn count-up [max]
  (loop [count 0]
    (if (= count max)
      (println "Done!")
      (do
        (println (str "Counting " count))
        (recur (inc count))))))

(count-up 5)
