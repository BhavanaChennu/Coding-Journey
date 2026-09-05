# Special array reversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **S**, containing special characters and all the alphabets, reverse the string without
affecting the positions of the special characters.

 **Example 1:** 

```
Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".

```

 **Example 2:** 

```
Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.
```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **reverse()**  which takes the string as inputs and returns required reverse string.

 **Expected Time Complexity:**  O(|S|)
 **Expected Auxiliary Space:**  O(|S|)

 **Constraints:** 
1 ≤ |S| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T09:52:25.456Z  

```java
class Solution {
    public String reverse(String str) {
        // complete the function here
        char[] ch = str.toCharArray();
        int left = 0 , right = str.length()-1;
        while(left < right){
            if(!Character.isLetter(ch[left])) left++;
            else if(!Character.isLetter(ch[right])) right--;
            else{
                if( Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left++ ;
                    right--;
                }
            }
        }
        return String.valueOf(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/special-array-reversal2328/1)