# QUOMQD41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:30:35.210Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define the article or text content to analyze
        String article = "This article discusses Java programming.";
        
        // Use the contains() method with the logical AND operator (&&)
        // to check if the article contains both the keywords 'Java' and 'programming'
       boolean containsJava = article.contains("Java");
       boolean containsProg = article.contains("programming");
       boolean containsBoth = containsJava && containsProg;
        
        // Print the result, which will be true if both keywords are present, otherwise false
       System.out.println("Contains both keywords: "+ containsBoth);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD41)