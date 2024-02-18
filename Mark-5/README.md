## Functions / Methods in Java

- Functions are a block of code that can be called to perform a specific task.
- Functions are also known as methods in Java.
- Functions are used to break a large program into smaller modules.
- Functions are used to avoid repetition of code.
- Functions make the code reusable.

### Syntax of a function in Java

```java
access_modifier return_type function_name (parameter_list) {
    // body of the function
}
```

- **access_modifier**: It defines the scope of the function. It can be public, private, protected or default. If we do not specify any access modifier, then it is considered as default.

- **return_type**: It defines the data type of the value returned by the function. If the function does not return any value, then the return type is void.

- **function_name**: It is the name of the function. It should be unique within the scope of the class.

- **parameter_list**: It is the list of parameters passed to the function. It is optional. If the function does not take any parameter, then the parameter list is empty.

- **body of the function**: It is the block of code that performs the task of the function.

- You have to specify `static` keyword before the return type of the function if you want to call the function without creating an object of the class.

### Example of a function in Java

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("Sum = " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
```

### Passing parameters to a function in Java

- Parameters are the variables that are declared in the function definition.
- Arguments are the values that are passed to the function when it is called.
- Parameters are initialized with the values of the arguments when the function is called.

### Pass by value

- In Java, arguments are passed by value.
- It means that the value of the arguments is copied into the formal parameters of the function.
- Any changes made to the formal parameters of the function do not affect the values of the arguments.
- The formal parameters of the function are destroyed when the function returns.


### Example of passing parameters to a function in Java

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("Sum = " + sum);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int add(int a, int b) {
        a = 50;
        b = 100;
        return a + b;
    }
}
```

### Pass by reference

- In Java, objects are passed by reference.
- It means that the reference to the object is passed to the function.
- Any changes made to the object inside the function are reflected outside the function.
- The object is not destroyed when the function returns.
- The object is destroyed when there are no references to it.
- The object is destroyed by the garbage collector.
- The garbage collector is a program that runs in the background and destroys the objects that are no longer referenced.

### Example of passing objects(eg:array) to a function in Java

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

### Shadowing

- Shadowing is the process of using the same name for a local variable as well as for a global variable.
- The local variable shadows the global variable.
- Made using the `static` keyword.

### Example of shadowing in Java

```java
public class Main {
    static int a = 10;

    public static void main(String[] args) {
        int a = 20;
        System.out.println("Local variable a = " + a);
        System.out.println("Global variable a = " + Main.a);
    }
}
```

### Variable length arguments

- Variable length arguments are the arguments that can take variable number of values.
- Variable length arguments are declared using three dots `...` after the data type of the argument.
- Variable length arguments are also known as varargs.
- Variable length arguments are stored in an array.
- Variable length arguments must be the last argument in the parameter list.
- A function can have only one variable length argument.
- Variable length arguments are useful when we do not know the number of arguments in advance.

### Example of variable length arguments in Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum = " + sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

### Method overloading

- Method overloading is the process of using the same name for two or more methods.
- The methods must have different number of parameters or different types of parameters.

### Example of method overloading in Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(1, 2));
        System.out.println("Sum = " + sum(1, 2, 3));
        System.out.println("Sum = " + sum(1, 2, 3, 4));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
```