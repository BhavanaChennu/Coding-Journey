# NDLQGP39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple BMI Calculator

You are building a  **Basic BMI Calculator**  in Java for an e-commerce health platform.
All data is  **predefined as Strings**, as if it was received from an online form.

### Task:
- Converts values to appropriate types: weightStr → int using Integer.parseInt() heightStr → double using Double.parseDouble() showSummaryStr → boolean using Boolean.parseBoolean()
- Calculates BMI: BMI = weight / (height * height)
- Displays the result using conversions: int → String with String.valueOf() char → String with Character.toString()

 **Expected Output:** 

```
The integer value is: 70
The value of height is: 1.75
The boolean value is: true
The user ID as a string is: 101
The gender as a string is: M
Your BMI is: 22.857142857142858

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:56:18.193Z  

```java
class Codechef {
    public static void main(String[] args) {

        String weightStr = "70";
        String heightStr = "1.75";
        String showSummaryStr = "true";
        int userId = 101;
        char gender = 'M';
        
        // Convert Strings to appropriate data types
        int weight = Integer.parseInt(weightStr);
        double height = Double.parseDouble(heightStr);
        boolean showSummary = Boolean.parseBoolean(showSummaryStr);



        // Convert int and char to String
        String userIdStr = String.valueOf(userId);
        String genderStr = Character.toString(gender);


        // Calculate BMI
        double bmi = weight / (height * height); 

        // Print the results
        System.out.println("The integer value is: " + weight);
        System.out.println("The value of height is: " + height);
        System.out.println("The boolean value is: " + showSummary);
        System.out.println("The user ID as a string is: " + userIdStr);
        System.out.println("The gender as a string is: " + genderStr);
        System.out.println("Your BMI is: " + bmi);
    }

}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP39)