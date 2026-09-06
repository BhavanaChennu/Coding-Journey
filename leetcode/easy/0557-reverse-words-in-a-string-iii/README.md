# Reverse Words in a String III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

 **Example 1:** 

```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

```

 **Example 2:** 

```
Input: s = "Mr Ding"
Output: "rM gniD"

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- s contains printable ASCII characters.
- s does not contain any leading or trailing spaces.
- There is at least one word in s.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 34.14%)  
**Memory:** 47 MB (beats 37.10%)  
**Submitted:** 2026-09-06T16:10:26.276Z  

```java
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i = 0 ; i < str.length;i++){
            char[] word = str[i].toCharArray();
            int left = 0 , right = word.length-1;
            while( left <= right){
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++; right--;
            }
            str[i] = new String(word);
        }
        return String.join(" ", str);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)