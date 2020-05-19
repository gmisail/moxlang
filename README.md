# Mox Programming Language

Mox is a programming language which focuses on combining simplicity with power. It achieves this by leveraging
a simple syntax which compiles directly into C (which in turn compiles into machine code.) Since it compiles into C,
it is painless to interface with native C code (and for C to interface with Mox code.)

### Example

```shell script
moxc main.mox -o main
./main
```

### Code Example

```
class Vector
    
    var x : int = 0
    var y : int = 0

    function new()
        
    end

    function dot(v : Vector) -> int
        return (x * v.x) + (y * v.y)
    end
end

function main() -> int
    var v : Vector
    
    return 0
end
```

### Modules

Modules are essentially namespaces. They help encapsulate and organize your code by grouping together like variables and functions.

```
moduleNode Math
	function sin(x : float) -> float
		return 0.0
	end
end

print(Math.sin(45.0))
```
