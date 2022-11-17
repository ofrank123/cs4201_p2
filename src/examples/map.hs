main = map myFun (1 :: 5 :: 7 :: 10 :: nil);

myFun x = x * 2;

map f l = if null l
          then nil
          else f (hd l) :: map f (tl l);