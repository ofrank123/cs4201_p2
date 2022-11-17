main = myRec 10;

myRec n = if n == 0 then 0 else n + myRec (n - 1);