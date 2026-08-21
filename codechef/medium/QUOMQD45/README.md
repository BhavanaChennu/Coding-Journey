# QUOMQD45

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### URL Protocol Checker

Complete the program by filling in the missing parts to check if a URL starts with specific protocols (`http://, https://, ftp://`) using the `startsWith()` method.
This will help understand how to identify different types of URLs efficiently.

 **Expected Output:** 

```
URL starts with 'http://': false  
URL starts with 'https://': true  
URL starts with 'ftp://': false  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:32:42.240Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a string variable to store the URL to be checked
        String url = "https://www.example.com";
        
        // Check if the URL starts with "http://"
        boolean isHttp = url.startsWith("http://");
        
        // Check if the URL starts with "https://"
        boolean isHttps = url.startsWith("https://");

        
        // Check if the URL starts with "ftp://"
        boolean isFtp = url.startsWith("ftp://");

        
        // Print the results for each protocol check
        System.out.println("URL starts with 'http://': " + isHttp);  // Output: false
        System.out.println("URL starts with 'https://': " + isHttps); // Output: true
        System.out.println("URL starts with 'ftp://': " + isFtp);    // Output: false
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD45)