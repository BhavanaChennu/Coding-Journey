# NDLQGP18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Formatting a Phone Number

In this example, we demonstrate how to use the replace() method to format a phone number by replacing hyphens with spaces.

 **When executed, the code will show:** 

```
Original Phone Number: 987-654-3210  
Formatted Phone Number: 987 654 3210

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:55:02.414Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Declare a phone number with hyphens
        String phoneNumber = "987-654-3210";

        // Replace hyphens with spaces using replace() method
        String formattedNumber = phoneNumber.replace('-', ' ');

        // Print the original and formatted phone number
        System.out.println("Original Phone Number: " + phoneNumber);
        System.out.println("Formatted Phone Number: " + formattedNumber);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP18)