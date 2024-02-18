## When to apply binary search?

1. If the array in the given problem is sorted, try binary search first. Most of the cases, it will work.
2. Other problems statements may include that you need to find something in that array, and you follow a sequence of steps to reach the solution.
3. In a ceiling problem, you'll return the `start` value instead of -1 when the target is not found.
4. In a floor problem, you'll return the `end` value instead of -1 when the target is not found.

- Mountain Array means the array will be sorted in ascending order first and then in descending order.
- Rotated sorted array means the array will be sorted in ascending order first and then rotated.
- There are two ways to solve rotated sorted array problems:
  1. First way:
     1. Binary search in the left part of the pivot element. (0 -> pivot)
     2. If not found, binary search in the right part of the pivot element. (pivot + 1 -> end)
     3. Finding the pivot:
        - Applying binary search to find the pivot element.
        - Ans will be available when `nums[mid] > nums[mid + 1]`.
        - Also, if `nums[mid] < nums[mid - 1]`, then `mid - 1` is the pivot element.
        - If `nums[start] >= nums[mid]`, then the pivot element is in the left part of the array. And therefore, `end = mid - 1`.
        - If `nums[start] < nums[mid]`, then the pivot element is in the right part of the array. And therefore, `start = mid + 1`. 
  2. Second way:
     1. Can be done using Recursion.
   
<br>

- This current method for finding the pivot element is not applicable for duplicate elements.
- If start == mid == end, then we can't find the pivot element using existing method.
- In that case, we can do:
- `if nums[start] == nums[mid] == nums[end]`, then `start++` and `end--`.


### Binary search template

```java
int binarySearch(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
            start = mid + 1;
        else
            end = mid - 1;
    }
    return -1;
}
```

### Binary Search for 2D Array

- Usually, 2D arrays can be solved using linear search.
- But if the 2D array is sorted, then we can use binary search.
- Consider a 2D array, where the rows and columns are sorted.
- Case 1: if element == target, ans found
- Case 2: if element < target
- Case 3: if element > target
- Lower bound = 0th row, 0th column
- Upper bound = 0th row, last column
- Compare the target with the upper bound element.
- If upperbound element > target, then move the upper bound to the left. i.e. `col--`
- Similarly, if upperbound element < target, then move the lower bound to one step down. i.e. `row++`


### Sorted Matrix

         
  Example:

  {
    <br>
   {1,2,3,4},
    <br>
   {5,6,7,8},
    <br>
   {9,10,11,12},
    <br>
   {13,14,15,16}
    <br>
  }

   
  1. Find the middle row

  2. Apply binary search on that row
   - Conditions
       - element == target => Ans found
       - element < target => Ignore above rows
       - element > target => Ignore below rows

   - Lower Bound: First row - rstart
   - Upper Bound: Last row - rend

  3. In the end, two rows are remaining
   {
       {1,2,3,4},
       {5,6,7,8}    
   }

  Let's say we are searching for 3.

  4. Search the middle column if target is present. If not, consider 4 parts

  Consider the 4 Parts: {1}, {5}, {3,4}, {7,8}

  5. Do simple binary search on these four parts to find out the ans.

  Time Complexity: O( log(n) + log(m) )

