# QUOMQD39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Printing Based on Presence

In this example, we demonstrate how to declare a string variable, check for the presence of a substring using the `contains()` method, and print the result in Java. The `contains()` method returns a boolean value (`true or false`) based on whether the substring is found within the string.

 **When executed, the code will show:** 

```
Contains 'sky': true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:25:31.581Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define and initialize a string variable
        String sentence = "The sky is blue."; 
        
        // Using the contains() method to check if the word "sky" is present in the sentence
        // The result (true/false) is directly printed to the console
        System.out.println("Contains 'sky': " + sentence.contains("sky"));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD39)