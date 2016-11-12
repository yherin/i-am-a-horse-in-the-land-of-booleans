(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  [x]
  (if x true false) )

(defn
  abs
  [n]
 ( if (< n 0)
    (- n)
    n
  )
  )



(defn
  divides?
  [divisor n]
  (if (== 0 (mod n divisor))
  true
  false
  ))


(defn
  fizzbuzz
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    )
  )

(defn
  teen?
  [age]
  (<= 13 age 19)

  )

(defn
  not-teen?
  [age]
  (not (teen? age)
  )
  )



(defn
  generic-doublificate
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
    )
  )

(defn
  leap-year?
  [year]
  (cond
    (and (divides? 4 year) (not ( divides? 100 year))) true
    (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
    :else false
    )
  )




; '_______'
