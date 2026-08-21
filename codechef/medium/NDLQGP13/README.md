# NDLQGP13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Formatting a Receipt Header

In this example, we demonstrate how to format a receipt header in a billing system using the `trim()` method in Java.

 **When executed, the code will show:** 

```
Original Header: [    BILLING RECEIPT    ]  
Formatted Header: [BILLING RECEIPT]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:50:55.968Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Declare receipt header with extra spaces
        String receiptHeader = "    BILLING RECEIPT    ";

        // Trim spaces to format the header properly using trim() method
        String formattedHeader = receiptHeader.trim();

        // Print the original and formatted header
        System.out.println("Original Header: [" + receiptHeader + "]");
        System.out.println("Formatted Header: [" + formattedHeader + "]");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP13)