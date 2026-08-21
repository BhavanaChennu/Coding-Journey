# NDLQGP29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - CSV Parser

In this example, we demonstrate how to declare a string variable, assign a value, and split it into individual words using Java's split() method. This method provides a simple way to break a sentence into meaningful parts and display each word separately.

 **When executed, the code will show:** 

```
The first word in the sentence is: Java
The second word in the sentence is: makes
The third word in the sentence is: programming
The fourth word in the sentence is: easier

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:27:29.221Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Step 1: Declare a string variable and assign a sentence to it.
        // This sentence contains multiple words separated by spaces.
        String sentence = "Java makes programming easier";

        // Step 2: Use the split() method to break the string into separate words and directly access them.
        String firstWord = sentence.split(" ")[0];  // First word
        String secondWord = sentence.split(" ")[1]; // Second word
        String thirdWord = sentence.split(" ")[2];  // Third word
        String fourthWord = sentence.split(" ")[3]; // Fourth word

        // Step 3: Display each word separately.
        System.out.println("The first word in the sentence is: " + firstWord);
        System.out.println("The second word in the sentence is: " + secondWord);
        System.out.println("The third word in the sentence is: " + thirdWord);
        System.out.println("The fourth word in the sentence is: " + fourthWord);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP29)