# Java Operators — Quick Theory

Operators: are special symbols that perform operations on variables/values (called operands).

## 1) Arithmetic Operators
Perform basic math operations.
`+` (add), `-` (subtract), `*` (multiply), `/` (divide), `%` (modulo/remainder)

## 2) Assignment Operators
Assign a value to a variable, optionally combined with an arithmetic operation.
`=`, `+=`, `-=`, `*=`, `/=`, `%=`

## 3) Relational (Comparison) Operators
Compare two values and always return a **boolean** (`true`/`false`).
`==` (equal to), `!=` (not equal to), `>`, `<`, `>=`, `<=`

## 4) Unary Operators
Act on a **single** operand.
- `+` → positive value
- `-` → negative value
- `!` → logical NOT (reverses a boolean)
- `++` → increment by 1 (pre/post)
- `--` → decrement by 1 (pre/post)

**Pre vs Post:**
- Pre (`++a`) → value changes **first**, then used
- Post (`a++`) → value used **first**, then changes

## 5) Logical Operators
Combine multiple boolean conditions. Used heavily in `if` conditions and loops.
- `&&` (AND) → true only if **both** conditions are true
- `||` (OR) → true if **at least one** condition is true
- `!` (NOT) → reverses the result

## 6) Ternary Operator
A shorthand for `if-else` in a single line.
`condition ? valueIfTrue : valueIfFalse`

## 7) Bitwise Operators (worth adding to your notes too)
Operate directly on bits of integer types.
`&` (AND), `|` (OR), `^` (XOR), `~` (complement), `<<` (left shift), `>>` (right shift)
