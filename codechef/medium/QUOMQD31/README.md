# QUOMQD31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Verify Prefix

Write a program to check if a word starts with a given prefix. Define a string variable containing a word, and check whether it starts with the prefix `"un"`. Use the `indexOf()` method to determine the position of the prefix and print the result accordingly.

```
String word = "unhappy";

```

 **Expected Output:** 

```
Does the word start with 'un'? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:18:38.397Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a string
        String word = "unhappy";

        // Check if the word starts with the prefix "un"
        int prefixIndex = word.indexOf("un");
        boolean startsWithUn = (prefixIndex == (word.indexOf("un")));

        // Print the result
        System.out.println("Does the word start with 'un'? "+startsWithUn);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD31)