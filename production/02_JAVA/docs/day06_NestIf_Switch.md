#Java Switch Statement
The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement. The switch statement works with byte, short, int, long, enum types, String and some wrapper types like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.

In other words, the switch statement tests the equality of a variable against multiple values.

###Points to Remember
There can be one or N number of case values for a switch expression.
The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
The case values must be unique. In case of duplicate value, it renders compile-time error.
The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
The case value can have a default label which is optional.

###Java Switch Statement is fall-through
The Java switch statement is fall-through. It means it executes all statements after the first match if a break statement is not present.

###Java Switch Statement with String
Java allows us to use strings in switch expression since Java SE 7. The case statement should be string literal.

###Java Nested Switch Statement
We can use switch statement inside other switch statement in Java. It is known as nested switch statement.

###Java Enum in Switch Statement
Java allows us to use enum in switch statement. Java enum is a class that represent the group of constants. (immutable such as final variables). We use the keyword enum and put the constants in curly braces separated by comma.

###Java Wrapper in Switch Statement
Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement.

