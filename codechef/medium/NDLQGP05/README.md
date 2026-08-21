# NDLQGP05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Test what you have studied

You are given  **two strings**  in the IDE. Your task is to:

- Convert both strings to uppercase.
- Concatenate the two strings with a single space between them.
- Print the length of the final concatenated string.
- Print the final concatenated string.

 **Expected Output** 

```
11
HELLO WORLD

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:43:41.962Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String s1="Hello";
        String s2="World";
        
        // Converting both strings to uppercase
        s1.toUpperCase();
        s2.toUpperCase();


        // Concatenating with a space in between
        String s3 = s1.concat(" ").concat(s2);

        // Printing the length of the final string
        System.out.println(s3.length());

        // Printing the final string
        System.out.println(s3);
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP05)