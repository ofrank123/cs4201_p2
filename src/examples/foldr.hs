main = foldr add 10 (1 :: 12 :: 7 :: 5 :: 9 :: nil);

add x y = x + y;

foldr f z l = if null l
              then z
              else f (hd l) (foldr f z (tl l));