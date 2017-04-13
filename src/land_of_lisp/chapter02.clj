(ns land-of-lisp.chapter02)

;;;; 2.2

(def small (atom 1))
(def big (atom 100))

;;;; 2.4

(defn guess-my-number []
  (quot (+ @small @big) 2))

(defn smaller []
  (reset! big (dec (guess-my-number)))
  (guess-my-number))

(defn bigger []
  (reset! small (inc (guess-my-number)))
  (guess-my-number))

(defn start-over []
  (reset! small 1)
  (reset! big 100)
  (guess-my-number))

;;;; 2.5

(let [a 5
      b 6]
  (+ a b))

;;;; 2.6

(letfn [(f [n]
          (+ n 10))]
  (f 5))

(letfn [(f [n]
          (+ n 10))
        (g [n]
          (- n 3))]
  (g (f 5)))

(letfn [(a [n]
          (+ n 5))
        (b [n]
          (+ (a n) 6))]
  (b 10))
