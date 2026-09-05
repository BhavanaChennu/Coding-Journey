# Reverse Only Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the string according to the following rules:

- All the characters that are not English letters remain in the same position.
- All the English letters (lowercase or uppercase) should be reversed.

Return `s` *after reversing it*.

 

 **Example 1:** 

```
Input: s = "ab-cd"
Output: "dc-ba"

```

 **Example 2:** 

```
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

```

 **Example 3:** 

```
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of characters with ASCII values in the range [33, 122].
- s does not contain '\"' or '\\'.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 46.28%)  
**Submitted:** 2026-09-05T09:45:10.134Z  

```java
class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0 , right = s.length()-1;
        char[] ch =s.toCharArray();
        while( left < right){
            if( !Character.isLetter(ch[left])) left++;
            else if( !Character.isLetter(ch[right])) right--;
            else{
                if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        return String.valueOf(ch);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-only-letters/)