## Introduction to Recursion

**Pre requisites:**
- Basic understanding of functions
- Basic understanding of memory management

### How function calls work in languages:

1. While the function is not finished executing, it will remain in stack.
2. In Java, main function is the first function to be called and put >into stack and it will be the last function to be finished and to get out of stack.
3. When a function finishes executing, it will be removed from the stack, and the flow of control will return to the function that called it.

### What is Recursion?

- A function that calls itself.
- Base case is the condition that stops the recursion.
- Recurrance relation is the formula of the recursion.
- **Example:**
```java
public void countDown(int n) {
    if (n == 0) {
        System.out.println("Done!");
    } else {
        System.out.println(n);
        countDown(n - 1);
    }
}
```


### Why Recursion?

- It helps us in solving bigger complex problems in a simpler way.
- You can convert recursion solutions into iterative solutions and vice versa.
- Space complexity is not constant because of recursive calls: **O(N)**
- It helps us in breaking down biggger problems into smaller problems

### Visualizing Recursion:

- **Example:**
```java
public int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

- In order to visualize recursion, we can use a recursion tree.

main() -> factorial(3) -> factorial(2) -> factorial(1) -> factorial(0)


### Tail Recursion:

- When the recursive call is the last thing that happens in the function.
- **Example:**
```java
public int factorial(int n, int result) {
    if (n == 0) {
        return result;
    } else {
        return factorial(n - 1, n * result);
    }
}
```

- In the case of fibonacci, tail recursion is not possible because we need to add the results of the two recursive calls.
- The last thing that happens in the function is the addition of the two recursive calls.
- That's why, fibonacci is not tail recursive.
- Whereas, in above example, the last thing that happens is the recursive call.

### How to understand and approach a problem?

1. Identify if you can breakdown the problem into smaller problems.
2. Write the recurrance relation if needed.
3. Draw the recursive tree.
4. About the tree:
   1. See the flow of functions, how they are getting in stack.
   2. Identify and focus on left tree calls and right tree calls
   3. Draw the tree and pointers again and again using pen and paper
   4. Use a debugger to see the flow.
5. See how the values & what type of values are returned at each step. See where the function call will come out. End, you'll come out of main function


### Variables in recursion:

Types of variables:
   - Parameters
   - Return type
   - Body of function


### Binary Search with recursion:

- We are given with an array of size N

1. Comparing -> O(1)
2. Dividing into 2 half
   
`F(N) = O(1) + F(N/2)`

- When you search the array of size N, you compare that takes O(1) and then you search half of the array of size N/2.
- This is the recurrence relation of binary search.


### Types of recurrence relations:

1. Linear: Fibonacci
2. Divide and Conquer: Binary Search (Search space is divided by a factor)


### TIP: DO NOT OVERTHINK BEFORE YOU SOLVE THE PROBLEM.

- Only pass the variables in parameters that are needed to for consecutive calls.