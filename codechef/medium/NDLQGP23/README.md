# NDLQGP23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Standardizing Email Domains

In this example, we demonstrate how to use the replace(CharSequence, CharSequence) method to standardize email domains in a user database.

 **When executed, the code will show:** 

```
Original Email: user123@oldmail.com  
Standardized Email: user123@newmail.com  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:58:55.466Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Declare an email address with an old domain
        String email = "user123@oldmail.com";

        // Replace the old domain with the new domain using replace(CharSequence, CharSequence)
        String standardizedEmail = email.replace("oldmail.com", "newmail.com");

        // Print the original and standardized email
        System.out.println("Original Email: " + email);
        System.out.println("Standardized Email: " + standardizedEmail);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP23)