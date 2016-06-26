(ns chapter03
  (:require [clojure.math.numeric-tower :refer [expt]]))

;;;; 3.2

(defn square [n]
  (* n n))

(identical? 'foo 'FoOo)
(identical? :foo :FoOo)

(+ 1 1.0)

(expt 53 53)

(/ 4 6)

(/ 4.0 6)

(println "Tutti Frutti")

(println "He yelled \"Stop that thief!\" from the busy street.")

;;;; 3.3

(expt 2 3)

(expt 2 (+ 3 4))

'(expt 2 3)

;;;; 3.4

(expt 2 3)

(cons 'chicken nil)

(cons 'chicken ())

(cons 'pork '(beef chicken))

(cons 'beef (cons 'chicken ()))

(cons 'pork (cons 'beef (cons 'chicken ())))

(first '(pork beef chicken))

(rest '(pork beef chicken))

(first '(beef chicken))

(first (rest '(pork beef chicken)))
(->> '(pork beef chicken)
     rest
     first)

(list 'pork 'beef 'chicken)

'(cat (duck bat) ant)

(first '((peas carrots tomatoes) (pork beef chicken)))

(rest '(peas carrots tomatoes))

(rest (first '((peas carrots tomatoes) (pork beef chicken))))
(->> '((peas carrots tomatoes) (pork beef chicken))
     first
     rest)

(cons (cons 'peas (cons 'carrots (cons 'tomatoes ())))
      (cons (cons 'pork (cons 'beef (cons 'chicken ()))) ()))

(->> '((peas carrots tomatoes) (pork beef chicken) duck)
     rest
     rest)
(->> '((peas carrots tomatoes) (pork beef chicken) duck)
     rest
     rest
     first)
(->> '((peas carrots tomatoes) (pork beef chicken) duck)
     first
     rest
     rest)
(->> '((peas carrots tomatoes) (pork beef chicken) duck)
     rest
     first
     rest
     first)
