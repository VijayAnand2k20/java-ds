# Strings and String Builders in Java

For example, 
`String name = "Vijay Anand"`

- Here, `String` is a class in Java which will be a datatype.
- `name` is a reference variable which will be pointing to the object of the class `String`.
- `Vijay Anand` is the object of the class `String`.
- The object of the class is created in the heap memory.
- The reference variable is created in the stack memory.

If I create another reference variable `name2` and assign the same object to it, let's see what happens

`String name2 = "Vijay Anand"`

To understand if this will create seperate objects or not, we will see a few concepts:  
    1. String Pool  
    2. Immutability

## String Pool

- String Pool is a seperate memory structure in the heap memory.
- Everytime, you create a string literal, it will be stored in the string pool which is a part of the heap memory.
- The Reason for its existence: All the similar values of String will not be repeated. Instead, they will be pointing to the same object in the string pool.
- This makes our program memory optimized.


Stack memory:

| Address | Value |
|---------|-------|
| 1000    | name  |
| 1004    | name2 |

Heap memory:

| Address | Value       |
|---------|-------------|
| 2000    | Vijay Anand |

- But, if the second reference variable is changed, will it affect the first reference variable?
- Let's see
- It will not affect the first reference variable.
- This is because, the object is immutable.
- The object cannot be changed.

## Immutability

- String is immutable.
- Once the object is created, it cannot be changed.
- If you try to change the object, a new object will be created in the string pool.
- The reference variable will be pointing to the new object.
- The old object will be garbage collected.
- This is the reason why the first reference variable is not affected by the change in the second reference variable.
- Why is String immutable?
- String is immutable because of the security reasons.
- For example, if 5 people are using the same name, and if one person changes the name, it will affect the other 4 people.
- To avoid this, String is immutable.

## Comparison of Strings

- We can compare the strings using the `==` operator.
- `==` operator compares the reference variables.
- If the reference variables are pointing to the same object, then the result will be `true`.
- If the reference variables are pointing to different objects, then the result will be `false`.

## How to create different objects of same value?

- We can create different objects of same value using the `new` keyword.
- The `new` keyword will create a new object in the heap memory outside the string pool.

### When you want to check the equality of the values of the objects, use the `.equals()` method.

- Interally, the `String` object functions like an array

#### !!! Reminder: Primitives are stored in the stack memory and Objects are stored in the heap memory.

- `+` operator can only be used with the primitive datatypes.
- If you want to use the `+` operator with the objects, atleast one of the operands should be a string.

## Performance

Consider this program,
```java

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}
```

- In this program, we are trying to print the alphabets from a to z.
- New objects are created in the string pool for each iteration.

## String Builder

- String Builder is a class in Java which is used to create mutable objects.
- It is present in the `java.lang` package.

```java
public class Performance {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series.append(ch);
        }
        System.out.println(series);
    }
}
```

- In this program, we are using the `StringBuilder` class to create the object.
- The `append()` method is used to append the characters to the object.
- The `StringBuilder` class is mutable.
- The `StringBuilder` class is not thread safe.
- If you want to make the `StringBuilder` class thread safe, you can use the `StringBuffer` class.
- Performance of `StringBuilder` is better than the `String` class.
- Because, the `StringBuilder` does not create new objects in the string pool for each iteration.