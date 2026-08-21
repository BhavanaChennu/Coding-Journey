# NDLQGP21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Encrypting a Secret Message

A secure messaging application encrypts user messages by replacing specific characters with predefined codes. This ensures that sensitive information remains hidden while transmitting messages over a network.

```
String secretMessage = "Access Denied. Try Again!";

```

 **Steps to Complete:** 

- Replace certain characters with secret codes to create a basic encryption method: Replace 'A' with "@" Replace 'a' with "6". Replace 'e' with "3". Replace 'i' with "!".
- Print the original message and encrypted message.

 **Expected Output:** 

```
Original Message: [Access Denied. Try Again!]  
Encrypted Message: [@cc3ss D3n!3d. Try @g6!n!]  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:58:17.744Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a secret message
        String secretMessage = "Access Denied. Try Again!";

        // Encrypt the message by replacing characters with codes
        String encryptedMessage = secretMessage.replace('A' , '@').replace('a','6').
        replace('e','3').replace('i','!');
        



       
        // Print the original message
        System.out.println("Original Message: [" + secretMessage + "]");
        
        // Print the encrypted message
        System.out.println("Encrypted Message: [" + encryptedMessage + "]");

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP21)