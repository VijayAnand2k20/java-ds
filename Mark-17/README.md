## Patterns using recursion

### 1. Do this pattern:

```
* * * * *
* * * *
* * *
* *
*
```

- Func(r,c)
- You'll print star if r > c and when it's not, you'll print a new line
- Consider top row is 4 and the first column as 0
- If r > c, print star
- When r == c, print new line and call Func(r-1,0)
- When r reaches 0, return.

## 2. Bubble Sort

- The first pattern simply functions like bubble sort as we go through each pass, the largest element will come at the end.
- Next time, we'll go until the second last element and so on.

Let's say you have an array {4, 3, 2, 1}

- {3, 4, 2, 1}
- {3, 2, 4, 1}
- {3, 2, 1, 4}
- End of First pass
- {2, 3, 1, 4}
- {2, 1, 3, 4}
- End of Second pass
- {1, 2, 3, 4}
- End of Third pass

## 3. Selection Sort

- Take the largest element in the array and put it at the end.
- Next time, take the second largest element and put it at the second last position and so on.

E.G: {4, 3, 2, 8, 1}

- Largest element is 8, put it at the end
- {4, 3, 2, 1, 8}
- Second largest element is 4, put it at the second last position
- {4, 3, 2, 1, 8}
- Third largest element is 3, put it at the third last position
- {1, 3, 2, 4, 8}
- Fourth largest element is 2, put it at the fourth last position
- {1, 2, 3, 4, 8}
- End of the pass

Answer: {1, 2, 3, 4, 8}