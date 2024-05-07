# Math for DSA

## Bit Manipulation

1. Bitwise AND:
    - `&` operator is used to perform bitwise AND operation.
    - **AND any number with 1 will return the number itself.**
    - `a & b` will return 1 if both `a` and `b` are 1, otherwise 0.
    - Example: `5 & 3 = 1`

2. Bitwise OR:
    - `|` operator is used to perform bitwise OR operation.
    - `a | b` will return 1 if either `a` or `b` is 1, otherwise 0.
    - Example: `5 | 3 = 7`

3. Bitwise XOR:
    - `^` operator is used to perform bitwise XOR operation.
    - Only one of the two bits is 1, then it will return 1.
    - More than one numbers, odd number of 1s will return 1.
    - `a ^ b` will return 1 if `a` and `b` are different, otherwise 0.
    - Example: `5 ^ 3 = 6`
    - **XOR any number with 1, gives its complement**
    - **XOR any number with 0, gives the number itself.**
    - **XOR of a number with itself is 0.**

4. Complement:
    - `~` operator is used to perform bitwise NOT operation.
    - `~a` will return the complement of `a`.
    - Example: `~5 = -6`

## Number Systems

1. Decimal -> 0-9 (Base 10)
2. Binary -> 0, 1 (Base 2)
3. Octal -> 0-7 (Base 8)
4. Hexadecimal -> 0-9, A-F (Base 16)

## Conversion

1. Decimal to any base b:
    - Keep dividing the number by base, take remainders and write in opposite.
2. Any base b to Decimal:
    - Multiply and Add the power of base with digits in reverse order.
    - Example: `1011` in binary to decimal: `1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 = 11`

## More Bitwise Operations

1. Left Shift:
    - `<<` operator is used to perform left shift operation.
    - `a << b` will shift `a` left by `b` bits.
    - Example: `5 << 1 = 10`
    - **a << 1 == a*2**
    - **a << b == a*2^b**

2. Right Shift:
    - `>>` operator is used to perform right shift operation.
    - `a >> b` will shift `a` right by `b` bits.
    - Example: `5 >> 1 = 2`
    - **a >> 1 == a/2**
    - **a >> b == a/2^b**

## Negative Numbers in binary

1 byte = 8 bits

10 => 00001010

LSB tells if the number is odd or even.
0 => Even, 1 => Odd
MSB tells if the number is positive or negative.
0 => Positive, 1 => Negative

### Steps to calculate negative number in binary
Ex: -10

2's complement:

1. Take the complement of the number.
2. Add 1 to the complemented number.
   
10 => 00001010
1. Complement => 11110101
2. Add 1 => 11110110

-10 => 11110110

## Why this works?

Ex: -10
Subtract 10 from 0 to get -10.

0 - 10 = -10

0 => 00000000
10 => 00001010

Consider 0 as 100000000,
10 as 00001010.

100000000 can be written as 11111111 + 1.
Like, 10000 => 1111 + 1

So, 0 - 10 = 11111111 + 1 - 00001010

Rearranging, 11111111 - 00001010 + 1

This is nothing but 2's complement


## Range of numbers

1 byte = 8 bits

In 1 byte, I can represent 2^8 = 256 numbers.

Actual num is stored in n-1 bits where n is the number of bits.

For 1 byte, 2^7 = 128 numbers.

So, the range is -128 to 127.

Do remember, total numbers include 0 as well.

Thats why it is not -128 to 128 but -128 to 127.

**Range Formula: -2^(n-1) to 2^(n-1) - 1**

## Qn:
Consider, arr = [2, 2, 3, 2, 7, 7, 8, 7, 8, 8]. How do you find the number that is appearing only once?

Thought Process:

- If a number is appearing three times, its set bit will also be appearing three times.
- So, we can count the number of set bits at each position and take modulo by 3.
- The remaining bits will be the number that is appearing only once.


## Qn: (Amazon)
Find the nth magic number.
Magic Number:
1 --> 0 0 1 --> 0*(5^3) + 0*(5^2) + 1*(5^1) = 5
2 --> 0 1 0 --> 0*(5^3) + 1*(5^2) + 0*(5^1) = 25
3 --> 0 1 1 --> 0*(5^3) + 1*(5^2) + 1*(5^1) = 30
4 --> 1 0 0 --> 1*(5^3) + 0*(5^2) + 0*(5^1) = 125
5 --> 1 0 1 --> 1*(5^3) + 0*(5^2) + 1*(5^1) = 130

Thought Process:

- We have to convert to binary
- we check last digit by n&1
- If it is 1, we add 5^i to the result
- We right shift n by 1 to get the next digit
- We increment i by 1

## Qn:
Find number of digits in base b

(6)10 --> 1
(6)2 --> 110 -->3

Thought Process:

- One way is to do right shift and keep a counter to count the number of digits.
- Formula way:
  - If $log_ba=x$, then $a=b^x$
  - For example, $log_26=x$, then $6=2^x$
  - $x$ represents the number of digits in base.
  - Consider, 10.
  - $log_{2}10=3.32$, which can be written as $10=2^{3.32}$
  - This basically means, how many times 2 should be multiplied to get 10. Here, take the integer part of it and add 1 to it.
  - So, the number of digits in base 2 for 10 is 4.
  - **Formula** : Number of digits in base b of number $n$ = $int(log_b(n)) + 1$
  - $$\log_b{a} = \frac{log_xa}{log_xb}$$
  - This is the mathematical formula to calculate log base b of a number.

## Qn:
Pascal's Triange

1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

1 5 10 10 5 1

**Find the sum of nth row.**

Thought Process:

- Sum of each row = $^nC_0 + ^nC_1 + ^nC_2 + ... + ^nC_n = 2^n$
- For nth row, for n = n - 1 as we start from 0
- So, the sum of nth row = $2^{n-1}$
- Ans = `1 << (n-1)`

## Qn:

**You are given with a number. Find if it is a power of 2 or not.**

Thought Process:
- Only one bit should be set in the number.
- We can take a counter and keep right shifting the number.
- If the number is power of 2, the counter will be 1 at the end of loop.

Simpler method:
- Consider, 10000000 = 11111111 + 1
- So, get the number and do bitwise AND with 1. This is nothing but n-1.
- Therefore, if n is power of 2, `n & (n-1)` will be 0.

256 in binary: 100000000

## Qn:

Find $a^b$.

Thought Process:
- We can do a loop and keep multiplying a with itself b times.
- But, this is not efficient.
- $3^6 = 3^{4+2}$
- 6 in binary: 110
- Take base = 3
- $$3^{110} = (3*1)^4 * (3*1)^2 * (3*1)^0$$

## Qn:
Given a number n, find the number of set bits in the number.

Thought Process:

- We can do right shift and check the last bit.
- If it is 1, increment the counter.
- Keep doing this until the number becomes 0.
- You can do n -= n&-n to get the last set bit.
- This is because, n&-n gives the last set bit.
- Subtracting it from n will give the number without the last set bit.
- Keep doing this until n becomes 0.
- Alternatively, you can do n &= n-1 to get the number without the last set bit.

## Qn:
Given a number n, find XOR of numbers 0 to a.

Thought Process:

a | XOR from 0 to a

0 | 0

1 | 1

2 | 0 ^ 1 ^ 2 = 3

3 | 0 ^ 1 ^ 2 ^ 3 = 0

4 | 0 ^ 1 ^ 2 ^ 3 ^ 4 = 4

5 | 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 = 1

6 | 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 = 7

7 | 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 = 0

8 | 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 = 8

9 | 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9 = 1

From observation, If a is multiple of 4, then XOR will be a.

If a % 4 == 0, then XOR will be a.

If a % 4 == 1, then XOR will be 1.

If a % 4 == 2, then XOR will be a+1.

If a % 4 == 3, then XOR will be 0.

## Qn:
Another Qn can be XOR of all numbers between a and b.

a = 3 & b = 9

0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9

The extra numbers are 0 ^ 1 ^ 2

To get rid of it, we can XOR the numbers from 0 to a-1 and XOR the numbers from 0 to b.

f(x) -> XOR of 0-->x

Ans: f(b) ^ f(a-1)