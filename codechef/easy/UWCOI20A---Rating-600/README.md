# UWCOI20A - Rating 600

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T18:14:20.589Z  

```java
public static String solve(int N, int X, int[] A) {
        String found = "NO";
        for(int i = 0 ; i < N; i++){
            if(A[i] == X){
              found = "YES";   
            }
        }
        return found;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/UWCOI20A)