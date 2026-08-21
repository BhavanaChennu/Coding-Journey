# NDLQGP09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Converting Product Names to Lowercase for Storage

A retail system stores product names in a database, but users enter them in various cases. To maintain consistency, the system converts all product names to  **lowercase**  before storage.

 **Expected Output:** 

```
Formatted Product Name: samsung galaxy phone

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:46:11.237Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Define a variable productName and its value 
        String productName = "Samsung GALAXY Phone";
        
        // Use toLowerCase() method to print the product name in lowercase for storage
        String formatted = productName.toLowerCase();
        
        // Print the desired results
        System.out.println("Formatted Product Name: "+ formatted);
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP09)