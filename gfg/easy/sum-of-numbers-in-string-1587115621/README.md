# Sum Numbers in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** containing alphanumeric characters. You have to calculate the sum of all the numbers present in the string.

 **Examples:** 

```
Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.

```

```
Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.
```

 **Constraints:** 
1 ≤ |s|≤ 105
The sum of Numbers ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T17:06:51.666Z  

```java
class Solution {
    public static int findSum(String s) {
        // code here
        int sum = 0, currentNumber = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                currentNumber = currentNumber * 10 + Character.getNumericValue(ch);
            }else{
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        sum += currentNumber;
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1)