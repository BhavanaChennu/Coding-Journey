# CTMNMF29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factorial Calculation Using While Loop

What will be the output of the above Java program?

```
class Codechef {
    public static void main(String[] args) {
        int num = 5; 
        long factorial = 1;

        while (num > 1) {
            factorial *= num;
            num--;
        }

        System.out.println("Factorial: " + factorial);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T10:19:38.455Z  

```cpp
import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the initial elevation
        int currentElevation = scanner.nextInt();

        // Loop to decrement elevation by 50 meters until reaching 100 meters or less
        while(currentElevation > 100){
            System.out.println("Current elevation: "+currentElevation+" meters.");
            currentElevation -= 50;
        }




        // Display the end of the trail message
        System.out.println("End of the trail reached at 100 meters.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF29)