true = \a -> \b -> a;
false = \a -> \b -> b;
and = \p -> \q -> p q false;
or = \p -> \q -> p true q;
not = \p -> \a -> \b -> p b a;
ifl = \p -> \a -> \b -> p a b;

Y = \f -> (\x -> f (x x)) (\x -> f (x x));

cons = \h -> \t -> \f -> f h t;
nil = \f -> true;

null = \l -> l (\h -> \t -> false);

hd = \l -> l (\h -> \t -> h);
tl = \l -> l (\h -> \t -> t);