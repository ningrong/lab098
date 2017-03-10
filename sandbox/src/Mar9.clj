(defn factorial
  [n]
  (if (= n 1)
    n
    (* n (factorial1 (dec n)))
    )
  )

