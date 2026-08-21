# NDLQGP15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Document Processing System

A document processing system receives text with unwanted spaces. Complete the missing part of the code to remove unnecessary spaces before processing the content.

```
class Codechef {
    public static void main(String[] args) {
        String documentTitle = "   Java Guide   ";
        String cleanedTitle = __; // Trim spaces

        System.out.println("Processed Title: [" + cleanedTitle + "]");
    }
}

```

 **Expected Output** 

```
Processed Title: [Java Guide]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:51:20.146Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/NDLQGP15)