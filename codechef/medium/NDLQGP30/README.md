# NDLQGP30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Parsing Customer Reviews in an E-Commerce Platform

An e-commerce platform collects customer reviews for various products in the following format:

```
"ProductID:ReviewText:Rating"

```

Each review is stored as a single string, where:

- ProductID is a unique identifier for the product (e.g., "P1234")
- ReviewText is the feedback from the customer (e.g., "Great quality and fast delivery")
- Rating is a number between 1 and 5 (as a string)

 **Task:** 
Write a Java program that processes a pre-populated array of such review strings and performs the following actions:

- Use the split() method to extract the ProductID, ReviewText, and Rating from each review.
- Print each part in a clear format to match the expected output given below.

 **Expected Output:** 

```
Product ID: P1234
Review: Great quality and fast delivery
Rating: 5

Product ID: P5678
Review: Poor packaging but good product
Rating: 4

Product ID: P4321
Review: Did not receive the item
Rating: 1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:35:12.894Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Pre-populated array of review strings
        String[] reviews = {
            "P1234:Great quality and fast delivery:5",
            "P5678:Poor packaging but good product:4",
            "P4321:Did not receive the item:1"
        };
        
       // Parsing and printing each review individually without using a loop

       // Review 1
        String[] parts1 = reviews[0].split(":");
        System.out.println("Product ID: " + parts1[0]);
        System.out.println("Review: " + parts1[1]);
        System.out.println("Rating: " + parts1[2]);
        System.out.println();

        // Review 2
        String[] parts2 = reviews[1].split(":");
        System.out.println("Product ID: " + parts2[0]);
        System.out.println("Review: " + parts2[1]);
        System.out.println("Rating: " + parts2[2]);
        System.out.println();

        // Review 3
        String[] parts3 = reviews[2].split(":");
        System.out.println("Product ID: " + parts3[0]);
        System.out.println("Review: " + parts3[1]);
        System.out.println("Rating: " + parts3[2]);
        System.out.println();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP30)