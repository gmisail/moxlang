# Mox Programming Language

Mox is a general purpose programming language designed with the goal of simplicity without sacrificing flexibility. It is implemented using the
Go programming language.

## Example
```
module Math
  function dot(a: int, b: int, c: int, d: int) -> int
    return (a * c) + (b * d)
  end
end

function main() -> int
  print(Math.dot(1, 2, 3, 4))
end
```
