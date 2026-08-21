# NDLQGP34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Flight Ticket Formatter using join() Method

In this example, we demonstrate how an airline ticketing system can use the `join()` method to format and display flight details in a structured way.

 **When executed, the code will show:** 

```
Flight Details: From: New York | To: London | Timings: 00:13 am

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:37:07.428Z  

```java
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