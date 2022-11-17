main = first 4 (sieve (from 2));

first n l = if n == 0 then nil else (hd l)::(first (n-1) (tl l));

from n = n :: (from (n+1));

filter f l = if null l
             then nil
             else
                if ((hd l) - (f * ((hd l) / f))) == 0
                then (filter f (tl l))
                else (hd l) :: (filter f (tl l)) ;

sieve l = if null l then nil
          else (hd l) :: (sieve(filter (hd l) (tl l)));
