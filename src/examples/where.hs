main = 10 + z + myFun 2 3
where {
    z = 10 + a where {
        a = 5;
    };
    x = 20;
};

myFun x y = x * z 10
where {
    z a = (x + y) * a;
};
