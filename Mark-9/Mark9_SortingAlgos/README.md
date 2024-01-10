# Sorting Algorithms

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