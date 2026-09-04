# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a string  **`s`**, and your task is to reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

 **Constraints:** 
1 <= s.size() <= 106
s contains only alphabetic characters (both uppercase and lowercase).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:59:54.500Z  

```java
class Solution {
    public static String reverseString(String s) {
        // code here
        int left = 0, right = s.length()-1;
		char[] ch = s.toCharArray();
		while( left < right){
		      char temp = ch[left];
		      ch[left] = ch[right];
		      ch[right] = temp;
		      left++;
		      right--;
		}
        return String.valueOf(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)