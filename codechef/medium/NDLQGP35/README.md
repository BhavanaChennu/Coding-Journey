# NDLQGP35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Formatting and Merging Customer Reviews

In an e-commerce platform, customer reviews are saved as one long string where each sentence is separated by a special symbol: `","`. Your task is to:

- Split the review into individual sentences using the split() method.
- Join the sentences back together into one clean paragraph using the join() method, adding a space between them.

 **Expected Output:** 

```
Formatted Review 1: This product is amazing. Fast delivery. Highly recommended!
Formatted Review 2: Not satisfied with the packaging. The product was okay. Expected better quality.
Formatted Review 3: Great value for money. Works as expected. Will buy again.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:45:13.022Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String rawReview1 = "This product is amazing.,Fast delivery.,Highly recommended!";
        String rawReview2 = "Not satisfied with the packaging.,The product was okay.,Expected better quality.";
        String rawReview3 = "Great value for money.,Works as expected.,Will buy again.";
        
        // Write your code here
        String[] parts1 = rawReview1.split(",");
        String formatted1 = String.join(" ", parts1);

        String[] parts2 = rawReview2.split(",");
        String formatted2 = String.join(" ", parts2);

        String[] parts3 = rawReview3.split(",");
        String formatted3 = String.join(" ", parts3);


        // Print the formatted reviews
        System.out.println("Formatted Review 1: " + formatted1);
        System.out.println("Formatted Review 2: " + formatted2);
        System.out.println("Formatted Review 3: " + formatted3);
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP35)