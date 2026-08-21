# QUOMQD30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding the First Appearance of a Word

Complete the program by filling in the missing part to find the first occurrence of a specific word in a sentence using the `indexOf()` method. This method helps locate the position of a word within a larger string.

Find the index of the first occurrence of `'Java'`.

 **Expected Output:** 

```
The first occurrence of 'Java' is at index: 9

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:15:33.254Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a string
        String sentence = "Learning Java is fun. Java is powerful.";

        // Find the first occurrence of the word "Java" using indexOf()
        int firstIndexOfJava = sentence.indexOf("Java");// Your code here

        // Print the result
        System.out.println("The first occurrence of 'Java' is at index: " + firstIndexOfJava);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD30)