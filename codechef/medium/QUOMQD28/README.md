# QUOMQD28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Verifying the Position of a Substring in a URL

In this example, we demonstrate how to find the position of a substring within a string using the `indexOf()` method. This method is useful when you need to locate specific parts of a string.

 **When executed, the code will show:** 

```
The index of 'www' is: 8

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:14:49.834Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // This is the string where we will search for the substring "www"
        String url = "https://www.example.com";

        // The indexOf() method searches for the first occurrence of the substring "www"
        // It returns the starting index of the substring in the string
        // If "www" is not found, it will return -1
        int indexOfWWW = url.indexOf("www");

        // Display the index of the substring "www" or -1 if it is not found
        System.out.println("The index of 'www' is: " + indexOfWWW);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD28)