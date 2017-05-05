(ns josh
  (:require [koan-engine.core :as koan :refer [__ ___]]
            [clojure.string :as string]))

(defmacro meditations [& tests]
  (let [ new-tests
         (map-indexed
           (fn [i element]
             (if (even? i)
               (clojure.string/join "" ["\033[35m" element "\033[39m"])
               element))
           tests)
       ]
      `(koan-engine.core/meditations ~@new-tests)))
