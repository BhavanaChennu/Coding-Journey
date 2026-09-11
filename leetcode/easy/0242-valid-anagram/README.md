# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 44.20%)  
**Memory:** 44.3 MB (beats 74.27%)  
**Submitted:** 2026-09-11T16:03:10.402Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] str = new int[26];
        if(s.length() != t.length()) return false;
        else{
        for(int i = 0 ; i < s.length() ; i++){
             char ch = s.charAt(i); 
             str[ch - 'a']++;
             str[t.charAt(i) -'a']--;
        }
        }
        for(int i = 0 ; i < str.length; i++)
        {
            if(str[i] != 0)  return false;
        }  
        return true; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)