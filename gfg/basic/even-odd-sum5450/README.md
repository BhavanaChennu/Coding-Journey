# Even Odd Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array arr[] of integers, find the sum of values of even and odd positions where a position is index + 1.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: [6, 9]
Explanation: Sum of elements at even places i.e. at 2nd and 4th places is (2 + 4 = 6). Sum of elements at odd places i.e at 1st,3rd and 5th places is (1 + 3 + 5 = 9). 
```

```
Input: arr[] = [1, 1, 1, 1, 1] 
Output: [2, 3]
Explanation: Sum of elements at even places is (1+1=2). Sum of elements at odd places is (1+1+1=3).
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:53:35.906Z  

```java
class Solution {
    public int[] evenOddSum(int[] arr) {
        // code here
        int evenSum = 0, oddSum = 0;
        for(int i = 0; i < arr.length; i++){
            if( i % 2 == 0)  oddSum += arr[i];
            else evenSum += arr[i];
        }
        return new int[]{evenSum , oddSum};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-odd-sum5450/1)