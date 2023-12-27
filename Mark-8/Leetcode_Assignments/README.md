## When to apply binary search?

1. If the array in the given problem is sorted, try binary search first. Most of the cases, it will work.
2. Other problems statements may include that you need to find something in that array, and you follow a sequence of steps to reach the solution.
3. In a ceiling problem, you'll return the `start` value instead of -1 when the target is not found.
4. In a floor problem, you'll return the `end` value instead of -1 when the target is not found.