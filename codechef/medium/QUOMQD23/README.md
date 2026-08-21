# QUOMQD23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding the First Vowel in a Word

In this example, we demonstrate how to find the position of a specific character within a string using the `indexOf()` method. This method helps locate the first occurrence of a given character in a string efficiently.

 **When executed, the code will show:** 

```
The index of 'o' is: 2

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:06:25.387Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a string
        String word = "programming";

        // Find the index of the first occurrence of the vowel 'o'
        int indexOfO = word.indexOf('o');

        // Print the result
        System.out.println("The index of 'o' is: " + indexOfO);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD23)