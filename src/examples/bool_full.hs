main = att ||
       atf ||
       aft ||
       aff ||
       ott ||
       otf ||
       oft ||
       off ||
       nt ||
       nf ||
       ltt ||
       ltf ||
       gtt ||
       gtf ||
       ltet ||
       ltef ||
       gtet ||
       gtef ||
       eqt ||
       eqf ||
       neqt ||
       neqf;

att = true && true;
atf = true && false;
aft = false && true;
aff = false && false;

ott = true || true;
otf = true || false;
oft = false || true;
off = false || false;

nt = not true;
nf = not false;

ltt = 9 < 10;
ltf = 10 < 9;

gtt = 10 > 9;
gtf = 9 > 10;

ltet = 9 <= 10;
ltef = 10 <= 9;

gtet = 10 >= 9;
gtef = 9 >= 10;

eqt = 10 == 10;
eqf = 10 == 9;

neqt = 10 <> 9;
neqf = 10 <> 10;
