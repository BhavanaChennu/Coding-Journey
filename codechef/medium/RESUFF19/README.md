# RESUFF19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple Password Strength Checker
- A system evaluates password strength based on its length. The system checks whether the password meets the minimum length requirement using the ternary operator. Complete the program by filling in the missing parts to ensure it functions correctly.
- If the password length is less than 8 characters, print: "Password strength: Weak" Otherwise, print: "Password strength: Strong"

 **Expected Output:** 

```
Password strength: Strong

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T15:13:06.589Z  

```java
class Codechef {
    public static void main(String[] args) {
        String password = "mypass123";
        
        // Use a ternary operator to check the password strength
        String strength = (password.length() >= 8 )? "Strong" : "Weak";// Your code here
        
        System.out.println("Password strength: " + strength);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF19)