# Match  Pattern with One to One Mapping

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a dictionary of strings  **d[]**  and a string  **pat**, find all strings in d[] that follow the same character pattern as pat. A string matches pat if there exists a  **one-to-one**  mapping between the characters of pat and the characters of the string. Return all matching strings.

 **Examples :** 

```
Input: d[] = ["abb", "abc", "xyz", "xyy"], pat  = "foo"
Output: ["abb", "xyy"]
Explanation: "abb" and "xyy" match the pattern because the second and third characters are the same, just like in "foo"
```

```
Input: d[] = ["aab", "mno", "xyx", "aba", "ccc"], pat = "xyx"
Output: ["xyx", "aba"]
Explanation: "xyx" and "aba" match the pattern because the first and third characters are the same, while the second character is different. The mapping is consistent and one-to-one.
```

 **Constraints:** 
1 ≤ d.size() ≤ 103
1 ≤ k, |d[i]| ≤ 100, where k is length of pattern.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T08:23:35.820Z  

```java
import java.util.ArrayList;
class Solution {
    public ArrayList<String> matchingStrings(ArrayList<String> d, String pat) {
        ArrayList<String> result = new ArrayList<>();
        for (int k = 0; k < d.size(); k++) {
            String str = d.get(k);
            if (isMatch(str, pat)) {
                result.add(str);
            }
        }
        return result;
    }
    public static boolean isMatch(String str, String pat) {
        if (str.length() != pat.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (pat.charAt(i) != pat.charAt(j)) {
                        return false;
                    }
                } else {
                    if (pat.charAt(i) == pat.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/match-specific-pattern/1)