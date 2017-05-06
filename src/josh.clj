(ns josh
  (:require [koan-engine.core :as koan]))

(defmacro meditations [& tests]
  (let [ new-tests
         (map-indexed
           (fn [i element]
             (if (even? i)
               element
               ; (clojure.string/join "" ["\033[35m" element "\033[39m"])
               element))
           tests)
       ]
      `(koan-engine.core/meditations ~@new-tests)))
