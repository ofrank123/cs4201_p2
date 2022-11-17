main = list1 :: (hd list2) :: (tl list3) :: nil;

list1 = cons 5 nil;
list2 = 5 :: (cons 5 10) :: nil;
list3 = hd (tl (5 :: 10 :: 15 :: 20 :: nil)) :: nil;