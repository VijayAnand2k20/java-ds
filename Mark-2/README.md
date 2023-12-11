# Day 3 - Basics of Java

## Inputs

- There are methods to get input also
- It is the `scanner` class that can be used to get input from the user.
- It is a class that is present in the `java.util` package, so we import it using the `import` keyword.

To get input from user, first we must create an object of `Scanner` class and then we can use the methods of the class to get input.

To do so, here is the syntax:

```java
Scanner input = new Scanner(System.in);
``` 

- `new` keyword is used to create an object of the class.
- Here, `input` is the object of `Scanner` class and `System.in` is the standard input stream.
- This stream is attached to keyboard of the computer. If you want to attach the stream to a file, you can replace `System.in` with a `File` object.

### Methods of Scanner class

- `next()` method reads a string till the space.
- `nextLine()` method reads a string including space between the words entered by the user.


## Primitive Data Types

- Primitive data types are the most basic data types available within the Java language.
- Primitive data types in java are:
  - `int` - 4 bytes
  - `char` - 2 bytes
  - `float` - 4 bytes
    - The reason for `f` is that by default, Java takes the floating point numbers as `double` data type.
    - So, if we want to assign a floating point number to `float` data type, we must append the letter `f` to the end of the number.
  - `double` - 8 bytes
  - `boolean` - 1 byte
  - `byte` - 1 byte
  - `long` - 8 bytes
    - The reason for `l` is that by default, Java takes the integer numbers as `int` data type.
    - So, if we want to assign an integer number to `long` data type, we must append the letter `l` to the end of the number.

- `int` or whatever we did above are not classes as you can see that their first letter is not capital.
- If we want to use them as classes, we can use `Integer`, `Float`, `Double`, `Boolean`, `Long`, etc.
- These are called wrapper classes.
- For example, `Integer` class has the following methods:
  - `parseInt()` - converts a string to an integer
  - `toString()` - converts an integer to a string
  - `toBinaryString()` - converts an integer to a binary string
  - `toHexString()` - converts an integer to a hexadecimal string
  - `toOctalString()` - converts an integer to an octal string
  - `valueOf()` - returns an Integer object holding the value of the specified primitive

## Literals

- Literals are the data that we assign to variables.
- For example, `int a = 10;` - Here, `10` is the literal.
- To write long numbers, we can use `_` to separate the digits.

## Type Casting

- Type casting is when you assign a value of one primitive data type to another type.
- Conditions for type casting:
  - The two types should be compatible.
  - The resulting type should be compatible with the assigned variable.
  - Destination type should be larger than source type.

## Automatic Type Promotion in Expressions

- When two types are used in an expression, the smaller one is promoted to the larger one.
- Rules for automatic type promotion:
  - All byte, short, char values are promoted to int.
  - If one operand is a long, the whole expression is promoted to long.
  - If one operand is a float, the entire expression is promoted to float.
  - If any of the operands is double, the result is double.