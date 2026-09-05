# Reverse Vowels of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

 

 **Example 1:** 

 **Input:**  s = "IceCreAm"

 **Output:**  "AceCreIm"

 **Explanation:** 

The vowels in `s` are `['I', 'e', 'e', 'A']`. On reversing the vowels, s becomes `"AceCreIm"`.

 **Example 2:** 

 **Input:**  s = "leetcode"

 **Output:**  "leotcede"

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consist of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 14.24%)  
**Memory:** 46.9 MB (beats 15.30%)  
**Submitted:** 2026-09-05T06:50:16.090Z  

```java
class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        char[] ch = s.toCharArray();
        int left = 0 , right = s.length()-1;
        while(left < right){
          if(!vowels.contains(ch[left])) left++;
          else if(!vowels.contains(ch[right])) right--;
          else{
            if(vowels.contains(ch[left]) && vowels.contains(ch[right])){
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

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)