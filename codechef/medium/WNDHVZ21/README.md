# WNDHVZ21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T17:35:14.815Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // user to enter the number of apples
        int apples = scanner.nextInt();

        // Check if apples can be evenly divided by 4
       if (apples % 4 == 0) {
            System.out.println("The apples can be evenly shared among friends!");
        } else {
            System.out.println("Some apples will be left over after sharing!");
        }
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ21)