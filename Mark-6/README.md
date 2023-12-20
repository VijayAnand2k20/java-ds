## Arrays in Java

### Why do we need arrays?
- Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

### What is an array?
- Arrays are the collection of similar data types. It can store the primitive data types as well as objects of a class depending on the definition of the array.
- Syntax: `datatype[] arrayName = new datatype[size];` or `datatype arrayName[] = new datatype[size];`

- Breaking down the declaration:
  - `int[] arr;` - This declares an array named `arr` of type `int` and it doesn't allocate any memory for the array.
  - `arr = new int[5];` - This allocates memory for 5 integers and assigns the reference of the memory to `arr` as the object of the array is created on the heap memory.
  - The memory allocation that we did in the above step is happening at runtime, so it is known as a **dynamic memory allocation**.
  - `new` keyword is used to create an object.

### Points to know about arrays:

- In C/C++, the array is a collection of similar data types that are stored in contiguous memory locations.
- Whereas in Java, we don't have the concept of pointers.

Here's what we know:

1. We know that array objects are created on the heap memory and the reference of the array is allocated to the variable in the stack memory.
2. It is mentioned in JLS(Java Language Specification) that heap memory is not contiguous.
3. Dynamic memory allocation.
   
Hence, we can conclude that the array objects are not stored in contiguous memory locations in Java. And it depends on the JVM to decide where to store the array objects.

- For an integer array, the default value is 0.

- Primitives are stored in the stack memory and objects are stored in the heap memory.

### null in Java

- `null` is a special literal in Java that is used to represent a null reference in Java, i.e. it refers to nothing.
- You can assign `null` to any variable (provided it is of reference type).
- You can't create a `null` object.
- You cannot assign `null` to variables of primitive data types.
- It is the default value of a reference variable.

### Internal working of arrays in Java

Lets take an example of an array of 5 integers.

- `int[] arr = new int[5];`
- `arr` resides in the stack memory.
- `{0, 0, 0, 0, 0}` resides in the heap memory.
- Each element is also an object and they are stored in different memory locations.
- In case of strings, each element is a reference variable that points to null by default.
- So basically, the array is a collection of references to the objects.


### Enhanced for loop

- It is used to traverse the array or collection in Java.
- It is also known as the `for-each` loop.

Syntax:

```java
for (datatype variable : array_name) {
    // code to be executed
}
```

Example:

```java
int[] arr = {1, 2, 3, 4, 5};

for (int i : arr) {
    System.out.println(i);
}
```

### Multidimensional arrays

- A multidimensional array is an array of arrays.
- It can be related to a table with rows and columns.
- Syntax: `datatype[][] arrayName = new datatype[rowSize][columnSize];`
- Example: `int[][] arr = new int[2][3];`
- Here, `columnSize` is optional.

Internal working:

- `arr` is a reference variable that points to an array object.
- The array object is stored in the heap memory.
- The array object contains two elements which are also reference variables.
- Each reference variable points to an array object.
- Each array object contains three elements which are primitive data types.

### ArrayList

- It is a part of the `java.util` package.
- It provides us with dynamic arrays in Java.

Syntax:

```java
ArrayList<datatype> listName = new ArrayList<datatype>(<initial_value>);
```

- Here, `datatype` cannot be a primitive data type.
- You must use the wrapper class of the primitive data type.

#### How no size is required for this?
- Size is actually fixed(internally).
- When ArrayList is filled by a some amount, it creates a new array of double size(maybe) and copies all the elements from the old array to the new array.
- Old one is deleted.