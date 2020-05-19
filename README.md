# Mox Programming Language

Mox is a programming language which focuses on combining simplicity with power. It achieves this by leveraging
a simple syntax which compiles directly into C (which in turn compiles into machine code.) Since it compiles into C,
it is painless to interface with native C code (and for C to interface with Mox code.)

Mox in its current state is very much an experiment, and is in no state ready to be used in production.

### Code Example

```
function add(x : int, y : int) -> int
    return x + y
end

function sub(x : int, y : int) -> int
    return x - y
end

function main() -> int
    var test : int = 100
    var another : int = test + test

    var foo : int = add(test, another)
    var bar : int = sub(foo, 10)

    var fizz : int = foo + bar

    if(fizz == bar and fizz != foo)
        while(fizz == bar or fizz != foo)
            fizz = fizz + 1
        end
    end

    return 0
end
```

This trivial code example compiles into the following C code, which can be compiled by your favorite C compiler.

```
#include <stdio.h>
#include <stdlib.h>
int add(int x, int y)
{
return x + y;
}
int sub(int x, int y)
{
return x - y;
}
int main()
{
int test = 100;
int another = test + test;
int foo = add(test, another);
int bar = sub(foo, 10);
int fizz = foo + bar;
if (fizz == bar && fizz != foo){
while(fizz == bar || fizz != foo){
fizz = fizz + 1;
}
}
return 0;
}
```
