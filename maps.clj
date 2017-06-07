(ns com.clojure.examples
  (:gen-class))

{"Apple" "Mac" "Microsoft" "Windows"}

(get {"Apple" "Mac" "Microsoft" "Windows"} "Apple")

(get {"Apple" "Mac" "Microsoft" "Windows"} "Linux")

(:Apple {:Apple "Mac" :Microsoft "Windows"})

(assoc {"Apple", "Mac" "Microsoft" "Windows"} "Commodore" "Amiga")

(assoc {"Apple" "Mac" "Microsoft" "Windows"} "Apple" "iOS")

(merge {"Apple", "Mac" "Microsoft" "Windows"} {1 2})

(keys {"Apple", "Mac" "Microsoft" "Windows"})

(vals {"Apple" "Mac" "Microsoft" "Windows"})





