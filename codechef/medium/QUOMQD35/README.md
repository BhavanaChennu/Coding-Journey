# QUOMQD35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Searching for the Last Dot in a File Path

Complete the program by filling in the missing parts to find the last occurrence of a dot (`.`) in a file path using the `lastIndexOf()` method. This will help locate the file extension or other important information from the file path.

```
String filePath = "C:\\Users\\Documents\\myFile.java";

```

 **Expected Output:** 

```
The last dot is at index: 25

```

 **If you think the answer is 28, that’s incorrect, because as we studied in escape sequences, // is treated as a single character.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:20:14.954Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a filePath string
        String filePath = "C:\\Users\\Documents\\myFile.java";

        // Find the last occurrence of the dot
        int lastIndexOfDot = filePath.lastIndexOf("."); // your code here

        // Print the result
        System.out.println("The last dot is at index: " + lastIndexOfDot);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD35)