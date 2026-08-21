# NDLQGP39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Processing Product Pricing

In this example, we demonstrate how to convert a String price input to a numeric value, apply a discount, and convert it back to a String for display.

 **When executed, the code will show:** 

```
Original Price: $120.50  
Discounted Price: $108.45  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:48:43.990Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare a product price as a String
        String priceStr = "120.50";

        // Convert the String price to a double for calculations
        double price = Double.parseDouble(priceStr);

        // Apply a 10% discount
        double discountedPrice = price * 0.90;

        // Convert the final price back to String
        String finalPriceStr = String.valueOf(discountedPrice);

        // Print the original and discounted prices
        System.out.println("Original Price: $" + priceStr);
        System.out.println("Discounted Price: $" + finalPriceStr);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP39)