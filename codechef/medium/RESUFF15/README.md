# RESUFF15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:08:48.014Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        boolean bookingStatus = sc.nextBoolean();
        String roomType = sc.next();

        // Outer if condition checks if the booking is valid
        if( bookingStatus ){
            // Nested if condition checks the type of room
            if( roomType.equals("Luxury")){
                System.out.println("Welcome to your Luxury Suite!");
            }
            else if(roomType.equals("Standard")){
                System.out.println("Welcome to your Standard Room!");
            }
        }
        else {
            System.out.println("Booking not found. Please check your details.");
        }
        // Indicating that the reservation check is completed
        System.out.println("Reservation check completed.");
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF15)