# Flipping Bits
You will be given a list of 32 bit unsigned integers. Flip all the bits **(1 -> 0 and 0 -> 1)** and print the result as an unsigned integer.

For example, your decimal input **n = 9 (base 10) = 1001 (base 2)**. We're working with 32 bits, so:
```
00000000000000000000000000001001 (base 2) = 9 (base 10)

11111111111111111111111111110110 (base 2) = 4294967286 (base 10)
```
## Function Description
Complete the flippingBits function in the editor below. It should return the unsigned decimal integer result.

flippingBits has the following parameter(s):
- n: an integer
## Input Format
The first line of the input contains **_q_**, the number of queries. 

Each of the next **_q_** lines contain an integer, **_n_**, to process.
## Constraints
 **1 <= q <= 100**

 **0 <= n <= 2^32**

## Output Format
Output one line per element from the list with the decimal value of the resulting unsigned integer.
### Sample Input
```
3
2147483647
1
0
```
### Sample Output
```
2147483648
4294967294
4294967295
```
### Explanation
```
-> 011111111111111111111111111111111 (base 2) = 2147483647 (base 10)
   100000000000000000000000000000000 (base 2) = 2147483648 (base 10)
-> 000000000000000000000000000000001 (base 2) = 1 (base 10)
   111111111111111111111111111111110 (base 2) = 4294967294 (base 10)
-> 000000000000000000000000000000000 (base 2) = 0 (base 10)
   111111111111111111111111111111111 (base 2) = 4294967295 (base 10)
```