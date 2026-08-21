# NDLQGP40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple Interest Calculator

You are building a  **Simple Interest Calculator**  in Java.
The values for principal, rate, and time are given as  **strings**, like input collected from a user form.

### Tasks:
- Convert: principalStr to int using Integer.parseInt() rateStr to double using Double.parseDouble() timeStr to int using Integer.parseInt()
- Calculate Simple Interest using the formula: SI = (Principal × Rate × Time) / 100
- Convert customerId and accountType to Strings using: String.valueOf() for int Character.toString() for char
- Print all values and the final interest.
### Example Output:

```
Principal amount is: 5000
Interest rate is: 5.5%
Time period is: 2 years
Customer ID as string: 202
Account type as string: S
Calculated Simple Interest is: 550.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:59:30.615Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String principalStr = "5000";     // principal amount in rupees
        String rateStr = "5.5";           // annual interest rate in percent
        String timeStr = "2";             // time period in years
        int customerId = 202;             // customer ID (int)
        char accountType = 'S';           // account type: S = Savings, C = Current


        // Convert string inputs to appropriate data types
        int principal = Integer.parseInt(principalStr);
        double rate = Double.parseDouble(rateStr);
        int time = Integer.parseInt(timeStr);



        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Convert other values to strings for display
        String customerIdStr = String.valueOf(customerId);
        String accountTypeStr = Character.toString(accountType);


        // Print the results
        System.out.println("Principal amount is: " + principal);
        System.out.println("Interest rate is: " + rate + "%");
        System.out.println("Time period is: " + time + " years");
        System.out.println("Customer ID as string: " + customerIdStr);
        System.out.println("Account type as string: " + accountTypeStr);
        System.out.println("Calculated Simple Interest is: " + simpleInterest);
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP40)