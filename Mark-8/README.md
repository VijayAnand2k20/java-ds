## Binary Search

### Algorithm:

1. Find middle element of the array.
2. Compare the target with the middle element.
3. If target is greater than middle element, then search in the right half of the array.
4. If target is smaller than middle element, then search in the left half of the array.
5. If target is equal to middle element, then return the index of the middle element.
6. To search in the left half, set the right pointer to middle - 1.
7. To search in the right half, set the left pointer to middle + 1.
8. Repeat steps 1 to 7 until left is less than or equal to right.
9. If left is greater than right, then return -1 which indicates that the target is not found.

### Why Binary Search?

Q. Find the maximum number of comparisons in worst case for a binary search algorithm.

- At each step, the array is divided into two halves.
- So, the number of comparisons is equal to the number of times the array is divided into two halves to reach the target element.
- Let the length of the array be `N`.
- At each step, the length of the array is reduced to half.
- The length of the array after `k` steps will be `1` when `N` / `2`<sup>`k`</sup> = `1`.
  
  
- This can be written as `N` = `2`<sup>`k`</sup>.
- Taking log on both sides, we get `log N` = `k log2`.
- `k` = `log N` / `log2`.
- `k = log`<sub>2</sub>`N`.
- `k` is the maximum number of comparisons in worst case for a binary search algorithm.

- Time complexity of binary search is `O(log N)`.

- To understand, comparing with linear search, let's take an example.

Let's say we have an array of size 1 million elements.

- In linear search, the maximum number of comparisons in worst case is 1 million.
- In binary search, the maximum number of comparisons in worst case is `log`<sub>2</sub>`(1 million)` = `log`<sub>2</sub>`(10`<sup>`6`</sup>`)` = `log`<sub>2</sub>`(2`<sup>`20`</sup>`)` = `20` `log`<sub>2</sub>`2` = `20` comparisons.

### Order agnostic binary search

- In this type of binary search, we don't know whether the array is sorted in ascending order or descending order.
- To find the order, we can compare the first and the last element of the array.
- You cannot compare the first two elements as there are chances they are equal.




### Points to note:

1.
```java
int mid = (start + stop) / 2;
```
- While doing this, in some scenarios, it is possible that the expression `(start + stop)` may overflow the range of int in java.
- To avoid this, we can use the following expression:
```java
int mid = start + (stop - start) / 2;
```