main = filter (\x -> x > 5) (6 :: 3 :: 4 :: 10 :: 2 :: 7 :: 15 :: 4 :: nil);

filter p l = if null l
             then nil
             else (
                if p (hd l)
                then hd l :: filter p (tl l)
                else filter p (tl l)
             );