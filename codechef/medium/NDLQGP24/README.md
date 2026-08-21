# NDLQGP24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Document Editor

A document editor replaces certain phrases to make the text more formal. Complete the missing part of the code.

- Replace "u" with "you"

```
class Codechef {
    public static void main(String[] args) {
        String message = "How are u doing?";
        String formalMessage = __; // Replace "u" with "you"

        System.out.println("Revised Message: " + formalMessage);
    }
}

```

 **Expected Output** 

```
How are you doing?

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:59:22.125Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/NDLQGP24)