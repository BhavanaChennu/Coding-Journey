# QUOMQD46

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Greeting Validation for Messages

Write a program to check if a message does NOT start with a specific word. Define a string variable containing a message and verify whether it does not start with the word `"Hello"`. Use the `startsWith()` method along with the NOT operator (`!`) to determine this and print the result.

```
String message = "Welcome to the club!";

```

 **Expected Output:** 

```
Does not start with 'Hello': true  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:34:34.705Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Initialize a string variable to store the message
        String message = "Welcome to the club!";

        // Use the startsWith() method combined with the NOT operator (!)
        // to check if the message does NOT start with the word "Hello"
        boolean startsWithHelllo = message.startsWith("Hello");

        // Output the result of the check
        System.out.println("Does not start with 'Hello': "+ !startsWithHelllo);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD46)