main = fact 5;

fact n = if n == 0 then 1 else n * fact (n - 1);