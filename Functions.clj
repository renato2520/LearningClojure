(ns com.clojure.examples
  (:gen-class))

(defn say-hello "you can also add documentation" [name]
  (println (str "Hello, " name)))

(say-hello "Satan")


(fn [] (println "Hello world"))

(def hello-world-func (fn [] (println "Hello World")))

(hello-world-func)

(let [plus-numbers #(+ %1 %2 %3)]
  (plus-numbers 10 20 30))


(def say-hello (fn [name] (println (str "Hello, " name))))

(def say-bye (fn [name] (println (str "Good bye, " name))))

(def greeting (fn [greeting-func name] (greeting-func name)))

(greeting say-hello "Kim Jong Nico")

(greeting say-bye "Kim Jong Nico")

(defn inner [from-outer]
  (fn [] (println from-outer)))

(def outer1 (inner "this is from outer"))

(def outer2 (inner "this is yet another from outer"))

(outer1)

(outer2)
