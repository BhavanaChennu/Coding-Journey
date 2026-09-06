# DI String Match

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A permutation `perm` of `n + 1` integers of all the integers in the range `[0, n]` can be represented as a string `s` of length `n` where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string `s`, reconstruct the permutation `perm` and return it. If there are multiple valid permutations perm, return  **any of them**.

 

 **Example 1:** 

```
Input: s = "IDID"
Output: [0,4,1,3,2]

```

 **Example 2:** 

```
Input: s = "III"
Output: [0,1,2,3]

```

 **Example 3:** 

```
Input: s = "DDI"
Output: [3,2,0,1]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is either 'I' or 'D'.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 11.72%)  
**Memory:** 47.3 MB (beats 26.32%)  
**Submitted:** 2026-09-06T06:33:39.830Z  

```java
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] nums = new int[n+1];
        int left = 0 , right = s.length();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                nums[i] = left;
                left++;
            }
            else if(s.charAt(i) == 'D'){
                nums[i] = right;
                right--;
            }
        }
        nums[n] = left;
        return nums;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/di-string-match/)