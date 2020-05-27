# Mox Programming Language

Mox is a programming language which focuses on combining simplicity with power. It achieves this by leveraging
a simple syntax which compiles directly into C (which in turn compiles into machine code.) Since it compiles into C,
it is painless to interface with native C code (and for C to interface with Mox code.) There is manual memory management, however all pointer manipulation is done under the hood (the compiler manages pointers for you for ease-of-use and safety.) 
 
Mox's syntax is similar to that of Lua with hints of Java and Haxe. It uses ANTLR4 for generating its lexer and parser, however this dependency may be removed if it is decided to make the compiler self-hosted. Until then, ANTLR4 works just fine.

**Mox in its current state is very much an experiment, and is in no state ready to be used in production.**

### Code Examples

#### Declaring Variables & Functions

```lua
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

#### Defining Objects

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

### Vector implementation

```lua
class Vector

    var data : Pointer<int> = NULL
    var size : int = 0
    var count : int = 0

    function init()

    end

    function destroy()
        free(self.data)
    end

    function count() -> int
        return self.count
    end

    function push(value : int)
        if(self.size == 0)
            self.size = 4
            self.data = calloc(self.size, sizeof(int))

            for(i from 0 to self.size)
                self.data[i] = 0
            end
        end

        if(self.size == self.count)
            self.size = self.size * 2
            self.data = realloc(self.data, sizeof(int) * self.size)
        end

        self.data[self.count] = value
        self.count = self.count + 1
    end

    function set(index : int, value : int)
        if(index < self.count and index >= 0)
            self.data[index] = value
        end
    end

    function get(index : int) -> int
        if(index < self.count and index >= 0)
            return self.data[index]
        end

        return 0
    end

    function pop() -> int
        var val : int = self.get(self.count - 1)
        self.set(self.count - 1, 0)
        self.count = self.count - 1

        return val
    end

    function print()
        printf("[")
        for(i from 0 to self.count)
            if(i > 0)
                printf(", ")
            end

            printf("%i", self.get(i))
        end
        printf("]\n")
    end

end

#
#   Simple example which allocates a vector, pushes 15 values and then pops all 15 values.
#
function main() -> int
    var vector : Vector = new Vector()

    for(i from 0 to 15)
        vector.push(i)
        vector.print()
    end

    for(i from 0 to 15)
        vector.pop()
        vector.print()
    end

    delete vector
end
```

