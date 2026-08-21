# QUOMQD44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validating Country Code of a Phone Number

In this example, we demonstrate how to declare a String variable, check if it starts with a specific prefix using the `startsWith()` method, and print the result in Java.
The `startsWith()` method allows us to efficiently verify the beginning of a string.

 **When executed, the code will show:** 

```
true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:31:14.708Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare and initialize a string variable to store the phone number
        String phoneNumber = "+91-9876543210";

        // Use the startsWith() method to check if the phone number begins with the country code "+91"
        // The method returns true if it starts with "+91", otherwise it returns false
        System.out.println(phoneNumber.startsWith("+91")); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD44)