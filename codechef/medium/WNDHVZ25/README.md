# WNDHVZ25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Advanced Course Eligibility Check

Write a program that takes the student's score as input and determines whether they are eligible for an advanced course. If the score is greater than 60, the student qualifies; otherwise, they need to improve their score.

 **Input:** 
A single integer representing the student's score (out of 100).

### Sample 1:
Input
Output

```
75

```

```
You are eligible for the advanced course!

```

### Sample 2:
Input
Output

```
60

```

```
You need to score higher to enroll in the advanced course.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T17:53:04.426Z  

```java
import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score > 60){
            System.out.println("You are eligible for the advanced course!");
        }
        else{
            System.out.println("You need to score higher to enroll in the advanced course.");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ25)