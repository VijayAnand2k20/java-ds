# Quick Sort

Consider: [5, 4, 3, 2, 1]

### Pivot:
- Any element in the array can be chosen as the pivot.
- After first pass, all the elements less than pivot will be on left side of pivot and all the elements greater than pivot will be on right side of pivot.

### What is happening?

- Randomly, I take 4 as pivot
- After first pass: [1, 3, 2, 4, 5]
- Here, all the elements less than 4 are on left side and all the elements greater than 4 are on right side of the pivot element.
- In bubble sort, you'll put thee largest element at the correct position and selection sort also does the same thing.
- In merge sort, you'll divide the array into two parts, sort them and then merge them.
- In quick sort, we put the pivot element at the correct position and then we recursively sort the left and right side of the pivot element.

### How are we putting the pivot element at the correct position?

- You start with two pointers, one at the start and one at the end.
- Move both the pointers towards each other.
- Whenever there is a violation, swap the current elements pointed by the two pointers.
- Finding the violation:
  ```java
  while(n[s] < pivot){
    s++;
  }
    while(n[e] > pivot){
        e--;
    }
    
  ```
- At the end of this loop, s will be pointing to the element which is greater than pivot.

### How to pick the pivot element?
- Random element
- Corner element
- Middle element

### Time Complexity:

- Best Case: O(nlogn)
- Worst Case: O(n^2)

## Important Points:

- Quick sort is not stable.
- In-place sorting algorithm and merge sort takes O(n) extra space.
- Merge sort is preferred over quick sort for linked lists.

## Hybrid Sorts:

- Timsort: Merge sort + insertion sort