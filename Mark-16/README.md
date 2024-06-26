# Recursion - Array based questions

### 1. Find if the array is sorted or not

Eg: [1, 2, 4, 8, 9, 12]

- Traditionally you may use a pointer to check elements one by one until the last element.
- When the pointer reaches the last element, you can say that the array is sorted.
- You can break it down to use recursion as well.
- Refer code...

### 2. Linear Search

- Given an array and a target element, find the index of the target element in the array.
- Start from 0th index and get to last index
- If you cannot find the element, return -1
- If you find the element, return the index
- Also do for finding multiple occurences of the element
- A lot of variations can be done with this problem and have been done in the code. Make sure to check them out.

<!-- Continue from 1:04:15 -->

### 3. Rotated Binary Search

E.g: [5, 6, 7, 8, 9, 1, 2, 3]

- You check middle element and compare with target to move left side or right side
- Here, we can't simply check if middle element is greater or lesser than target as the array is rotated.
- Case 1:
  - if arr[start] <= arr[mid]
    - if key >= arr[start] && key <= arr[mid] // let's say you are searching for 7
      - Remove right half => end = mid - 1
    - else:
      - Remove left half => start = mid + 1

[5, 6, 1, 2, 3, 4]

- Case 2:
  - if key >= arr[mid] && key <= arr[end]
    - start = mid + 1
- Case 3, if you're searching for 6:
  - else
    - end = mid - 1