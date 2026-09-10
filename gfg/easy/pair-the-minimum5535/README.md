# Minimize Max Pair Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size  **2 × n**, where n is a positive integer, partition the elements into  **n pairs**  such that every element belongs to exactly one pair.

Among all possible pairings, minimize the maximum pair sum, where the sum of a pair is the sum of its two elements.

Return the minimum possible value of the maximum pair sum.

 **Examples:** 

```
Input : arr[] = [5, 8, 3, 9] 
Output : 13
Explanation: Possible pairs:
Case 1: (8, 9), (3, 5) -> max sum: 17
Case 2: (5, 9), (3, 8) -> max sum: 14
Case 3: (3, 9), (5, 8) -> max sum: 13
The minimum of these maximum sums is 13. Hence, the answer is 13.
```

```
Input : arr[] = [1, 6, 5, 9]
Output : 11
Explanation: Possible pairs:
Case 1: (6, 9), (1, 5) -> max sum: 15
Case 2: (5, 9), (1, 6) -> max sum: 14
Case 3: (1, 9), (5, 6) -> max sum: 11
The minimum of these maximum sums is 11. Hence, the answer is 11.
```

 **Constraints:** 
1 ≤ arr.size()≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T12:53:26.960Z  

```java
class Solution {
    public int pairMinimum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int left = 0 , right = arr.length-1;
        int sum = 0, max = 0;
        while(left < right){
            sum = arr[left]+arr[right];
            max = Math.max(max,sum);
            left++ ; right--;
        }
        return max;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-the-minimum5535/1)