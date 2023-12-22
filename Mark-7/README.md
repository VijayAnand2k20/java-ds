## Linear Search

### Problem Statement
Given an array of integers, find the index of a given element in the array. If element is not present in the array, return -1.

### Process:

1. Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
2. If x matches with an element, return the index.
3. If x doesn’t match with any of elements, return -1.
4. Time Complexity: O(n) for worst case and O(1) for best case.


#### Note:
- To get the number of digits in a number, use `int(math.log10(n))+1`

- Copying arrays can be simpler like:
  ```java
    int[] arr = {1,2,3,4,5};
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    // Syntax: System.arraycopy(source, sourceIndex, destination, destinationIndex, length);
  ```