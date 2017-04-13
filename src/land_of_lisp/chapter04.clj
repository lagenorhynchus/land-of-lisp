(ns land-of-lisp.chapter04)

;;;; 4.1

(if '()
  'i-am-true
  'i-am-false)
(if (seq '())
  'i-am-true
  'i-am-false)
(if nil
  'i-am-true
  'i-am-false)

(if '(1)
  'i-am-true
  'i-am-false)
(if (seq '(1))
  'i-am-true
  'i-am-false)

(defn my-length [list]
  (if (seq list)
    (inc (my-length (rest list)))
    0))

(my-length '(list with four symbols))

(identical? '() nil)
(identical? (seq '()) nil)
(identical? '() ())
(identical? '() 'nil)
(identical? (seq '()) 'nil)

;;;; 4.2

(if (= (+ 1 2) 3)
  'yup
  'nope)

(if (= (+ 1 2) 4)
  'yup
  'nope)

(if (seq '(1))
  'the-list-has-stuff-in-it
  'the-list-is-empty)

(if (seq '())
  'the-list-has-stuff-in-it
  'the-list-is-empty)

(if (odd? 5)
  'odd-number
  'even-number)

(if (odd? 5)
  'odd-number
  (/ 1 0))

(def number-was-odd (atom false))

(if (odd? 5)
  (do (reset! number-was-odd true)
      'odd-number)
  'even-number)

(def number-is-odd (atom false))

(when (odd? 5)
  (reset! number-is-odd true)
  'odd-number)

(when-not (odd? 4)
  (reset! number-is-odd false)
  'even-number)

(def arch-enemy (atom nil))

(defn pudding-eater [person]
  (cond (= person :henry) (do (reset! arch-enemy 'stupid-lisp-alien)
                              '(curse you lisp alien - you ate my pudding))
        (= person :johnny) (do (reset! arch-enemy 'useless-old-johnny)
                               '(i hope you choked on my pudding johnny))
        :else '(why you eat my pudding stranger ?)))

(pudding-eater :johnny)

@arch-enemy

(pudding-eater 'george-clooney)

(defn pudding-eater' [person]
  (case person
    :henry (do (reset! arch-enemy 'stupid-lisp-alien)
               '(curse you lisp alien - you ate my pudding))
    :johnny (do (reset! arch-enemy 'useless-old-johnny)
                '(i hope you choked on my pudding johnny))
    '(why you eat my pudding stranger ?)))
