(ns com.clojure.examples
  (:gen-class)
  (:require [clojure.set :as set]))

#{1 2 3 4 5 6 7}

(sort (conj #{1 2 3} 4))


(conj (conj #{1 2 3} 4) 4)

(disj #{1 2 3} 1)

(disj #{1 3 2} 4)

(set/select odd? #{1 2 3})

(contains? #{1 2 3} 1)

(set/subset? #{1 2} #{1 2 3 4})

(set/superset? #{1 2 3} #{1 2})
