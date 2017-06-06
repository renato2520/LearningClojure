(ns com.clojure.examples
  (:gen-class))

(str "Good " "morning")

(let [first "Kim"
      last "Nico"]
  (str "My name is " first " Jong " last))

(format "My name is %s %s %s" "Kim" "Jong" "Nico")

(format "My favorite fruit is %s" "apple")

(format "I ate %d apples" 2)

(format "Pi: %.3f" 3.14159265)

(format "Pi: %.5f" 3.15149265)

(format "Boolean represatation of 1: %b" 1)

(format "Boolean represatation of 1: %b" nil)

