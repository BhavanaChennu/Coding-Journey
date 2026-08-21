# QUOMQD49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking Domain in URLs

In this example, we demonstrate how to check if a URL ends with a specific domain using the `endsWith()` method in Java.

 **When executed, the code will show:** 

```
Ends with '.com': true  
Ends with '.org': false 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:35:00.943Z  

```java
class Codechef {
    public static void main(String[] args) {

        String url = "www.example.com";

        // Use the endsWith() method to check if the URL ends with ".com"
        // This will return true if the URL ends with ".com", otherwise false
        System.out.println("Ends with '.com': " + url.endsWith(".com"));

        // Use the endsWith() method to check if the URL ends with ".org"
        // This will return true if the URL ends with ".org", otherwise false
        System.out.println("Ends with '.org': " + url.endsWith(".org"));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD49)