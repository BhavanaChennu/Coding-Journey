# Reverse Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase English alphabets, reverse only the vowels present in it and print the resulting string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: "geeksforgeeks"
Explanation: The vowels are: e, e, o, e, e. Reverse of these is also e, e, o, e, e.

```

```
Input: s = "practice"
Output: "prectica"
Explanation: The vowels are a, i, e. Reverse of these is e, i, a.

```

```
Input: s = "bcdfg"
Output: "bcdfg"
Explanation: There are no vowels in s.
```

 **Constraints:** 
1<=|s|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T06:38:47.121Z  

```java
class Solution {
    public String modify(String s) {
        // code here
        Set<Character> vowels = new HashSet<>(Arrays.asList('A' , 'E' ,'I' , 'O','U','a','e','i','o','u'));
        char[] ch = s.toCharArray();
        int left = 0 , right = s.length()-1;
        while( left < right){
            if(!vowels.contains(ch[left])) left++;
            else if(!vowels.contains(ch[right])) right--;
            else{
                if(vowels.contains(ch[left]) && vowels.contains(ch[right])){
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left ++;
                    right--;
                }
            }
        }
        return String.valueOf(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1)