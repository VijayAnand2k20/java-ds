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