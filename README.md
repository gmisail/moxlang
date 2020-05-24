# Mox Programming Language

Mox is a programming language which focuses on combining simplicity with power. It achieves this by leveraging
a simple syntax which compiles directly into C (which in turn compiles into machine code.) Since it compiles into C,
it is painless to interface with native C code (and for C to interface with Mox code.) There is manual memory management, however all pointer manipulation is done under the hood (the compiler manages pointers for you for ease-of-use and safety.) 
 
Mox's syntax is similar to that of Lua with hints of Java and Haxe. It uses ANTLR4 for generating its lexer and parser, however this dependency may be removed if it is decided to make the compiler self-hosted. Until then, ANTLR4 works just fine.

**Mox in its current state is very much an experiment, and is in no state ready to be used in production.**

### Code Examples

#### Declaring Variables & Functions

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

#### Defining Objects

The following example demonstrates how classes (or rather objects) are
defined in Mox.

```lua
class Pair

    var x : int
    var y : int

    function init()
        self.x = 0
        self.y = 0
    end

    function getProduct() -> int
        return self.x * self.y
    end

end

function main() -> int
    var pair : Pair = new Pair()
    pair.x = 4
    pair.y = 10

    printf("(%i, %i)\n", pair.x, pair.y)

    var temp : int = pair.x
    pair.x = pair.y
    pair.y = temp

    printf("(%i, %i)\n", pair.x, pair.y)

    delete pair
end
```

This code compiles into the following:

```c++
#include <stdio.h>
#include <stdlib.h>
typedef struct {
int x;
int y;
} Pair;
void Pair_init(Pair* self)
{
self->x = 0;
self->y = 0;
}
int Pair_getProduct(Pair* self)
{
return self->x * self->y;
}
Pair* Pair_alloc() {
Pair* self = malloc(sizeof(Pair));
Pair_init(self);
return self;
}
int main()
{
Pair* pair = Pair_alloc();
pair->x = 4;
pair->y = 10;
printf("(%i, %i)\n", pair->x, pair->y);
int temp = pair->x;
pair->x = pair->y;
pair->y = temp;
printf("(%i, %i)\n", pair->x, pair->y);
free(pair);
}
```

