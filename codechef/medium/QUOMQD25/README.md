# QUOMQD25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find and Compare Positions of Two Characters

Write a program to check whether the character `'p'` appears before the character `'e'` in a given string. The program should find the indices of both characters, compare them using relational operators, and display the result.

```
String sentence = "apple pie";

```

The program should  **compare the positions**  of `'p'` and `'e'` in the string and print whether `'p'` appears before `'e'`.

 **Expected Output:** 

```
Is 'p' before 'e'? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:13:32.286Z  

```java
class Codechef {
    public static void main(String[] args) {
        String sentence = "apple pie";

        // Find the indices of 'p' and 'e'
        int indexOfP = sentence.indexOf('p');
        int indexOfE = sentence.indexOf('e');

        // Compare indices using relational operators
        boolean isPBeforeE = (indexOfP < indexOfE);

        // Print the comparison result
        System.out.println("Is 'p' before 'e'? "+isPBeforeE);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD25)