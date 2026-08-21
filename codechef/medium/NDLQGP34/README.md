# NDLQGP34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generating a Unique Order Reference Code

An e-commerce system assigns a unique order reference code for each transaction. Complete the missing part of the code using the join() method in Java to generate the correct order reference.

```
class Codechef {
    public static void main(String[] args) {
        String customerID = "C12345";
        String orderNumber = "ORD6789";
        String productCategory = "Electronics";
        String orderDate = "2025-03-12";
        
        String orderReference = ____________ ; // Join elements with "hyphen (-)"

        System.out.println("Order Reference: " + orderReference);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:38:10.949Z  

```cpp
class Codechef{
    public static void main(String[] args) {

        // Step 1: Declare string variables for flight details.
        String departureCity = "New York";
        String destinationCity = "London";
        String timings = "00:13 am";

        // Step 2: Use the join() method to format the flight details into a single structured output.
        // The delimiter " | " is used to separate the details.
        String flightDetails = String.join(" | ", 
                "From: " + departureCity, 
                "To: " + destinationCity, 
                "Timings: " + timings);

        // Step 3: Display the structured flight details.
        System.out.println("Flight Details: " + flightDetails);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP34)