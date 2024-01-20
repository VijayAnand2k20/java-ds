****# Sorting Algorithms

#### What is Sorting?

Sorting is the process of arranging a list of elements in a particular order. The most common order types are numerical order and lexicographical order.

## 1. Bubble Sort

### What is bubble sort?

- In every step, you are comparing adjacent elements.
- If the first element is greater than the second element, you swap them.
- Now compare the second and the third elements and swap them if they are not in order.
- Similarly, do for all elements in the list and you will get the largest element at the end of the list during the first pass.
- Do the same process again for the remaining passes.
- As every pass ends, you will get one large element from the list at the end.
- So, for the next pass you can ignore the sorted part of the list.

Note: Bubble sort is also known as sinking sort and exchange sort.

Space Complexity: `O(1)` - In-place algorithm [No extra space required]

Time Complexity: 
- Best Case: `O(n)` - When the list is already sorted.
- Worst Case: `O(n^2)` - When the list is reverse sorted.
  - Here, `n` is the number of comparisons.
  - As the array size increases, the number of comparisons also increases.

- Bubble sort is a stable algorithm. It means that the order of the elements with the same value will be maintained in the sorted list.
  
## 2. Selection Sort

- Selection sort literally means you select an element from the array and place it in its appropriate position.
- Can be done in two ways.
  - First, select the largest element and put it in its correct index.
  - Then select the second largest by excluding already sorted part of the array and so on.
  - Likewise, you can do for minimum element as well.

**Complexity Analysis**
  - In order to find maximum element in the first try, you can use searching algorithms.
  - It would take n-1 comparisons.
  - Then, it would take n-2 comparisons
  - Likewise it will go on until it makes 1 comparisons
  - Total Number of comparisons = 0+1+2+...+(n-1)
  - (n-1)(n-1 + 1) / 2
  - => (n^2 - n) / 2
  - Less dominating term is removed, so n is neglected
  - Constants are also removed.
  - Worst case complexity: O(n<sup>2</sup>)
  - Best case complexity: O(n<sup>2</sup>)
  - Stability: Nope!
  - Use Cases:
    - Performs well on smaller lists/arrays.

## 3. Insertion Sort

-  Sorting the array partially.
-  First sort the initial part i.e., first element.
-  Then, sort the first two elements.
-  Then, sort the first three elements and so on.
-  For every index:
   - Put that index element in a correct index of LHS
   - After first pass, i=0: First two elements are sorted.
   - After second pass, i=1: First three elements are sorted.

**Algorithm:**

Consider: { 5, 3, 4, 1, 2 }

1. When i=0,  start j=i+1 [i=0 means first pass]
2. Sort array till index 1 in first pass
3. Sort array till index 2 in second pass
4. Sort array till index 3 in third pass
5. Sort array till index n-1 in n-1th pass

**Working:**

- When i=0, j=1
- Compare 5 and 3, 3 is less than 5, so swap them. ( arr[j] < arr[j-1] )
- { 3, 5, 4, 1, 2 }
- Since, you can't check before 0th index, j must always be greater than 0.
- Now, i=1, j=2
- Compare 5 and 4, 4 is less than 5, so swap them.
- { 3, 4, 5, 1, 2 }
- Compare 3 and 4, 4 is not smaller than 3, so break the loop.
- Because, left hand side array is sorted, so no need to check further.
- Right now, till index 1, the array is sorted.
- Now, i=2, j=3
- Compare 5 and 1, 1 is less than 5, so swap them.
- { 3, 4, 1, 5, 2 }
- Decrease j by 1, j=2
- Compare 4 and 1, 1 is less than 4, so swap them.
- { 3, 1, 4, 5, 2 }
- Decrease j by 1, j=1
- Compare 3 and 1, 1 is less than 3, so swap them.
- { 1, 3, 4, 5, 2 }
- Since, j cannot be less than 0, so break the loop.
- Now, till index 2, the array is sorted.
- `i` must be less than n-2
- Now, i=3, j=4
- Compare 5 and 2, 2 is less than 5, so swap them.
- { 1, 3, 4, 2, 5 }
- Decrease j by 1, j=3
- Compare 4 and 2, 2 is less than 4, so swap them.
- { 1, 3, 2, 4, 5 }
- Decrease j by 1, j=2
- Compare 3 and 2, 2 is less than 3, so swap them.
- { 1, 2, 3, 4, 5 }
- Decrease j by 1, j=1
- Compare 1 and 2, 2 is not less than 1, so break the loop.

**Complexity Analysis**

- Worst case complexity: O(n<sup>2</sup>) - When the list is reverse sorted.
  - Here, `n` is the number of comparisons.
  - It takes 1 comparison for the first pass, 2 for the second, 3 for the third and so on.
  - So, total number of comparisons = 1+2+3+...+(n-1)
  - (n-1)(n-1 + 1) / 2
  - => (n^2 - n) / 2
  - Less dominating term is removed, so n is neglected
  - Constants are also removed.
  - Worst case complexity: O(n<sup>2</sup>)

- Best case complexity: O(n) - When the list is already sorted.

- Stability: Yes!

**Why Insertion Sort?**
  - It is adaptive as steps are saved when the list is already sorted.
  - No. of swaps are less than bubble sort.

Use Cases:
  - Performs well on smaller lists/arrays.
  - When good when the list/array is almost sorted.
  - It takes part in hybrid sorting algorithms.

## 4. Cycle Sort

- When given numbers are in the range of 1 to n, use cycle sort.
- After sorting, the elements are placed in their correct positions.
- The index will be equal to (value-1). [As index starts from 0]
- Key expression: `index = value - 1`

Let's see an example:

Consider: { 3, 5, 2, 1, 4 }

- Looking at 0th index, value is 3, check if 3 is in its correct position.
- 3 is not in its correct position, so swap 3 with the element at index 2.
- Now, 3 is in its correct position.
- { 2, 5, 3, 1, 4 }
- Again, we check the same index's element as we do not know if we swapped the correct element to the current index.
- So, we check if 2 is in its correct position.
- 2 is not in its correct position, so swap 2 with the element at index 1.
- Now, 2 is in its correct position.
- { 5, 2, 3, 1, 4 }
- Again, we check the same index's element as we do not know if we swapped the correct element to the current index.
- So, we check if 5 is in its correct position.
- 5 is not in its correct position, so swap 5 with the element at index 4.
- Now, 5 is in its correct position.
- { 4, 2, 3, 1, 5 }
- Again, we check the same index's element as we do not know if we swapped the correct element to the current index.
- So, we check if 4 is in its correct position.
- 4 is not in its correct position, so swap 4 with the element at index 3.
- Now, 4 is in its correct position.
- { 1, 2, 3, 4, 5 }
- Again, we check the same index's element as we do not know if we swapped the correct element to the current index.
- So, we check if 1 is in its correct position.
- 1 is already in its correct position.
- { 1, 2, 3, 4, 5 }
<br>
<br>
- If we want to check in range [0,n], then value will be at the index itself.

**Complexity Analysis**

- Worst case scenario:
  - The above example is a worst case scenario.
  - We made 4 swaps for 5 elements.
  - Plus, we made 5 comparisons.
  - Total number of operations = 4+5 = 9
  - So, total number of operations = n-1 + n = 2n-1
  - We ignore the less dominating term and constants.
  - So, worst case complexity: O(n)