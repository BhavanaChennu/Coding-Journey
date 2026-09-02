# Largest Prime from Consecutive Prime Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`.

Return the  **largest prime number**  less than or equal to `n` that can be expressed as the  **sum**  of one or more  **consecutive prime numbers**  starting from 2. If no such number exists, return 0.

 

 **Example 1:** 

 **Input:**  n = 20

 **Output:**  17

 **Explanation:** 

The prime numbers less than or equal to `n = 20` which are consecutive prime sums are:

- 2 = 2
- 5 = 2 + 3
- 17 = 2 + 3 + 5 + 7

The largest is 17, so it is the answer.

 **Example 2:** 

 **Input:**  n = 2

 **Output:**  2

 **Explanation:** 

The only consecutive prime sum less than or equal to 2 is 2 itself.

 

 **Constraints:** 

- 1 <= n <= 5 * 105

## Solution

**Language:** Java  
**Runtime:** 185 ms (beats 48.92%)  
**Memory:** 46.7 MB (beats 27.34%)  
**Submitted:** 2026-09-02T15:00:30.422Z  

```java
import java.util.Arrays;

class Solution {
    public int largestPrime(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        long sum = 0;
        int maxPrimeSum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
                if (sum > n) break; 
                
                if (isPrime[(int) sum]) {
                    maxPrimeSum = (int) sum;
                }
            }
        }

        return maxPrimeSum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-prime-from-consecutive-prime-sum/)