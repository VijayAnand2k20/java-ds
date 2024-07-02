# Merge Sort

- It basically works on the principle of divide and conquer. 
- We are going to use recursion to do merge sort.

## How it works?

Assume an array: {8, 3, 4, 12, 5, 6}

1. Divide this array into two halves: {8, 3, 4} and {12, 5, 6}
2. Hey recursion, sort the first half: {8, 3, 4}, and then sort the second half: {12, 5, 6} and then I'll merge them both
3. Recursion result after sorting the first half: {3, 4, 8}
4. Recursion result after sorting the second half: {5, 6, 12}
5. Merge both the results: {3, 4, 5, 6, 8, 12}
6. Done!

## Detailed Steps:

1. Divide array into two parts.
2. Get both parts sorted via recursion.
3. Merge the sorted parts.

### Explaining merging:

arr1 = {3, 5, 9} and arr2 = {4, 6, 8}

- You start with two pointers, one for each array.
- Create a new array of size arr1 + arr2.
- Compare the elements at the pointers of both arrays.
- The smaller element goes into the new array.
- Move the pointer of the array from which the element was picked.
- Repeat the process until you reach the end of both arrays.
- If any array is left, add all its elements to the new array.
- Done!

### Explaining recursion:

Consider: {8, 3, 4, 12, 5, 6}

- Divide the array into two halves: {8, 3, 4} and {12, 5, 6}
- Recursion: Sort the first half: {8, 3, 4}
  - Recursion: divide the array into two halves: {8, 3} and {4}
    - Recursion: Sort the first half: {8, 3}
      - Recursion: divide the array into two halves: {8} and {3}
        - Recursion: Sort the first half: {8}
        - Recursion: Sort the second half: {3}
        - Merge both: {3, 8}
      - Merge both: {3, 8}
      - Done!
    - Recursion: Sort the second half: {4}
    - Merge both: {3, 4, 8}
    - Done!
- Recursion: Sort the second half: {12, 5, 6}
  - Recursion: divide the array into two halves: {12, 5} and {6}
  - Recursion: Sort the first half: {12, 5}
    - Recursion: divide the array into two halves: {12} and {5}
    - Recursion: Sort the first half: {12}
    - Recursion: Sort the second half: {5}
    - Merge both: {5, 12}
    - Done!
  - Recursion: Sort the second half: {6}
  - Merge both: {5, 6, 12}
  - Done!
- Merge both: {3, 4, 5, 6, 8, 12}
- Done!

## Time Complexity

- We can find this by looking at the recursion tree.

- At first level, we have n elements
- At second level, we have n/2 + n/2 elements
- At third level, we have n/4 + n/4 + n/4 + n/4 elements

- This goes on until we reach the base case, which is when we have only one element.

- We can see that the number of elements at each level is n.

- Total number of levels: n, n/2, n/4, n/8, ... 1*n

Mathematically, this can be represented as:

$$\frac{n}{2^0} , \frac{n}{2^1}, \frac{n}{2^2} ... \frac{n}{2^k}$$

- We need to find the value of k when the number of elements becomes 1.
- This is the same as finding the value of k when $\frac{n}{2^k} = 1$
- $n = 2^k$
- $log(n)=k(log(2))$
- $log_2(n) = k$ 

- So totally, there are $log(n)$ levels are there and at each level, we have n comparisons.
- Therefore, the time complexity is $O(nlog(n))$

## Space Complexity

- At each level, we are creating a new array to store the sorted elements.
- Therefore, the space complexity is $O(n)$

## Solving time complexity using Akra-Bazzi Formula

$$T(n) = T(\frac{n}{2}) + T(\frac{n}{2}) + (n-1)$$

Explanation:

- The first term is the time taken to sort the first half.
- The second term is the time taken to sort the second half.
- The third term is the time taken to merge both the halves.
- The third term is $(n-1)$ because we need to compare n elements and we don't need to compare the last element.
- The reason third term is $(n-1)$ and not $T(n-1)$ is because we are not calling the function recursively. We are just comparing the elements.

- Equation can be simplified as:
- $T(n) = 2T(\frac{n}{2}) + (n-1)$

- Akra-Bazzi Form:
   $$T(N) = a_1T(b_1x+{\sum}_1(x)) + a_2T(b_2x+{\sum}_2(x)) + ... + a_kT(b_kx+{\sum}_k(x)) + g(x)$$
   where, $x >= x_0$ (some constant).

- We can solve our recurrence relation using the above formula.

- In our case, $a=2, b=\frac{1}{2}, g(x) = (n-1)$

### Akra-Bazzi Formula

$$T(x) = \theta(x^p+x^p\int_{1}^{x} \frac{g(u)}{u^{p+1}} du)$$

What is p?

$$a_1b_1^p + a_2b_2^p + ... + a_kb_k^p = 1$$

- In our case, $a=2, b=\frac{1}{2}$

$$a_1 * b_1^p = 1$$

$$2 * (\frac{1}{2})^p = 1$$

$$2 * 2^{-p} = 1$$

$$2^{1-p} = 1$$

$$1-p = 0$$

$$p = 1$$

- Therefore, $p=1$

- Now, we can substitute the values of p and g(u) in the Akra-Bazzi formula and solve it.

$$T(x) = \theta(x^1+x^1\int_{1}^{x} \frac{(u-1)}{u^{1+1}} du)$$

$$T(x) = \theta(x+x\int_{1}^{x} \frac{(u-1)}{u^{2}} du)$$

$$T(x) = \theta(x+x\int_{1}^{x} \frac{u-1}{u^{2}} du)$$

$$T(x) = \theta(x+x\int_{}^{} \frac{1}{u} - \frac{1}{u^2} du)$$

$$T(x) = \theta(x+x\int_{}^{} \frac{du}{u} - \int_{}^{}\frac{1}{u^2} du)$$

$$T(x) = \theta(x+x(log u) - \int_{}^{}u^{-2} du)$$

$$T(x) = \theta(x+x[(log u) + u^{-1})]^x_1$$


$$T(x) = \theta(x+x[(log x) + x^{-1}) - x[(log 1) + 1^{-1}])$$

$$logx + \frac{1}{x} - 1$$

In formula,

$$T(x) = \theta(x+x[(log x) + \frac{1}{x} - 1])$$

$$T(x) = \theta(x+x(log x) + 1 - x)$$

Simplifying,

$$T(x) = \theta(xlogx+1)$$

We can ignore the constant term.

Therefore, the time complexity is $O(xlogx)$

## In-Place Merge Sort

- The above implementation uses extra space to store the sorted elements.
- We can do this in-place without using extra space.
- We can do this by using the same array and not creating a new array.
- The intuition is to not create a new array but pass the indices of the array to the function.