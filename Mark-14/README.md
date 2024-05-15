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


# Part 2

## Prime Numbers

A number is prime if it is only divisible by 1 and itself.

If any other number divides the number, then it is not prime.

Traditional algorithm:

```
for(i=2 ; i < N ; i++) {
    if(N%i == 0) {
        Not Prime;
    }
}
Prime
```

Optimized algorithm:

Check till square root of N.

```
for(i=2 ; i*i < N ; i++) {
    if(N%i == 0) {
        Not Prime;
    }
}
Prime
```

## Qn:
Given N; Find all prime numbers less than N.

### Sieve of Eratosthenes

If a number is prime, then all its multiples are not prime.

1. Create a boolean array of size N, by default all are false.
2. Start from 2.
3. If the number is prime, mark all its multiples as not prime(true).
4. The remaining numbers are prime.

### Time complexity:

Marking all multiples of a number n is O(N/n).

For the first number, it is O(N/2).

For the second number, it is O(N/3).

Till a last prime number p in the range, it is O(N/p).

$$(\frac{N}{2} + \frac{N}{3} + \frac{N}{5} + ...)$$

Taking N common, we get:

$$N(\frac{1}{2} + \frac{1}{3} + \frac{1}{5} + ...)$$

This is nothing but the harmonic progression for primes.

which is $log(log N) $

Therefore, the time complexity is $O(Nlog(log N))$.

##### Harmonic Progression:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ...

In words, the harmonic progression is the sum of reciprocals of the sequence.

Formula: $H_n = 1 + 1/2 + 1/3 + ... + 1/n$

## Finding Sqrt of a num:

Consider a perfect square.

Ex: 36

- The sqrt must be less than 36
- 1 * 1 = 1 != 36
- 2 * 2 = 4 != 36
- 3 * 3 = 9 != 36
- 4 * 4 = 16 != 36
- 5 * 5 = 25 != 36
- 6 * 6 = 36 == 36

Therefore, the sqrt of 36 is 6.

- Here, we are going through a sorted sequence.
- We can use binary search to find the sqrt of a number.

### For precision,

Ex: 40

sqrt(40) = 6.324

- The integer part can be optained from above way.

Initially,

- root = 6
- Increment root's decimal part by 0.1
- root = 6.1
- 6.1 * 6.1 = 36.21 < 40
- Increment root's decimal part by 0.1
- root = 6.2
- 6.2 * 6.2 = 38.44 < 40
- Increment root's decimal part by 0.1
- root = 6.3
- 6.3 * 6.3 = 39.69 < 40
- Increment root's decimal part by 0.1
- root = 6.4
- 6.4 * 6.4 = 40.96 > 40
- Decrement root's decimal part by 0.1
- root = 6.3 is the answer

If you want till 2 decimal places, increment by 0.01.

Time complexity: O(log N) as the precision calculation part is least dominating factor.


## Newton Raphson method

It says,

root = (X + N/X) / 2

$$root = \frac{X + (\frac{N}{X})}{2}$$

- where X is the square root that you have assumed
- `root` is the actual square root

### Why this works?

The formula is written as,

$$\sqrt{N} = \frac{X + (\frac{N}{X})}{2}$$

- X is the assumed square root.

Let's say, your assumption is correct.

Substitute X with $\sqrt{N}$.

$$\sqrt{N} = \frac{\sqrt{N} + (\frac{N}{\sqrt{N}})}{2}$$

$$\sqrt{N} = \frac{\sqrt{N} + \sqrt{N}}{2}$$

$$\sqrt{N} = \sqrt{N}$$

- We are trying to minimize the error as minimum as possible.

Error = $\sqrt{N} - X$

1. Start by assigning X as N.
2. You will find your answer when error < 1.
3. Update X with the formula.

### Time complexity:

O((log N) F(N))

F(N) = cost of calculating F(X)/F'(X) with some n-digit precision


## Factors of a number:

- Traditional way is to check from 1 to N.
- We loop from 1 to N and check if N%i == 0.
- If it is, then i is a factor of N.

- Optimized way is to loop from 1 to sqrt(N).
- If i is a factor, then N/i is also a factor.
- So, we can loop from 1 to sqrt(N) and check if N%i == 0.
- If it is, then i and N/i are factors of N.
- If i == N/i, then i is the only factor.

- Time complexity: O(sqrt(N))
  
## Modulo properties:

- (a+b)%m = ((a%m) + (b%m))%m
- (a-b)%m = ((a%m) - (b%m) + m)%m
- (a*b)%m = ((a%m) * (b%m))%m
- (a/b)%m = ((a%m) * ((b^-1)%m))%m

(b^-1) is the Multiplicative modulo inverse.

(b^-1) % m means b and m are co-primes.

- (a%m) % m = a % m
- (m^x)%m = 0 for x > 0 (+ve integer)

- If p is prime number which is not a factor of b, then

  ab^(p-1) % p = a%p

due to fermet's little theorem.

## Die-Hard example:

In the movie Die Hard 3, Bruce Willis and Samuel L. Jackson have to solve a problem to prevent a bomb from exploding. The problem is:

You have a 5 gallon jug and a 3 gallon jug, and you need to measure out exactly 4 gallons of water. How do you do it?

assume (a,b) where a is the 3 gallon jug and b is the 5 gallon jug.

1st --> (0, 0) --> (3, 0) --> (0, 3)

2nd --> (0, 3) --> (3, 3) --> (1, 5)

Empty 5 gallon jug

Pass the 1 gallon from 3 gallon jug to 5 gallon jug

3rd --> (0, 1) --> (3, 1) --> (0, 4)

Jug a is filled s1 times and jug b is emptied s2 times.

Remainder in b jug:

$a*s1 - b*(s2) = 4$

or

$a*s1 + b*(-s2) = 4$

To solve this problem, we need a linear equation.

ax + by = r

where r is the remainder.

3x + 5y = 4

- put x and y as integers, what is the minimum value you can have of the equation.
- put x = -3 and y = 2
- $3 * -3 + 5 * 2 = -9 + 10 = 1$
- 1 is the minimum +ve value you can have.
- **This is called the HCF. HCF of a&b is the minimum +ve value of the equation ax+by where x and y are integers**
- HCF(3,9) = 3
- This is same as min(3x+9y) = 3

How this relates to our problem?

- Let's say you are given with two jugs of capacity a and b.
- ax + by = L
- L is the amount of water you want to measure.
- 2x + 4y = 5
- Note: Whatever you get as HCF, will come out as common factor in the equation.
- 2(x+2y) = 5
- x+2y = 2.5
- This is wrong, you can't use half of the jug.
- Therefore, if you are given with 2l and 4l jugs, you can't measure 5l of water.

## Euclid's algorithm:

- GCD of two numbers a and b = GCD(rem(b,a), a)

GCD(105, 224) = GCD(224%105, 105) = GCD(14, 105)

Why this works?

- The above in equation format is min(105x + 224y)
- This got converted to min(14x + 105y)
  
Why subtract and why it is not changing the final answer?

Because, the gcd of (105, 224) also divides a linear combination of 105 and 224.

Ex: 224 - 2*105 = 14 (This is the remainder)

## LCM:

- LCM is Least Common Multiple.
- lcm(a,b) = minimum number that is divisible by both a and b.
- lcm(2,4) = 4
- lcm(3, 7) = 21

Note:

Say, we have a and b

d = gcd(a,b)

$f= \frac{a}{d}$ and $g= \frac{b}{d}$

$a = f*d$ and $b = g*d$

Let's say, lcm(a,b) = c

as lcm must be divisible by both a and b

$lcm(a, b) = lcm(f*d, g*d)$

lcm of a and b should also divide $f*d\  and\  g*d$

We know for a and b, d is the highest common factor.

f & g will have no other common factors

let's say 9 and 18:

a = 9
b = 18

d(HCF) = 9

In this case, 

f = 9/9 = 1

g = 18/9 = 2

If hcf=3,

f = 9/3 = 3

g = 18/3 = 6

This has common factor. Its wrong. Take 3 common and multiply with hcf.

now, hcf = 9


- a = f * d
- b = g * d
- If c is the lcm and is divisible by both a and b, then it must have a*b as a factor.
- Therefore, lcm(a,b) = f * d * g * d = f * g * d * hcf(a,b)
- lcm(a,b) = 
$$ 
    LCM(a,b) = \frac{a * b}{HCF(a, b)}
$$