# CTMNMF21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T10:13:59.094Z  

```java
import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Take input of n from user
        int n= sc.nextInt();
        
        int number = 2; // Starting with the first even number
        
        System.out.println("Even numbers from 2 to " + n + ":");
        
        while (number <= n) {  // Continue loop until number is less than or equal to n
            System.out.println(number);
            number += 2;

        }
        sc.close();
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF21)