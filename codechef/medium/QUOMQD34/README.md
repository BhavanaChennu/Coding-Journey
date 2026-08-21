# QUOMQD34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking for the Last Occurrence of a Substring

In this example, we demonstrate how to use the `lastIndexOf()` method to find the last occurrence of a substring within a string. This method helps identify the position of the last occurrence of a substring, searching from the end of the string.

 **When executed, the code will show:** 

```
The last occurrence of 'Error' is at index: 23

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:19:20.958Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // This is the log message where we want to search for the substring "Error"
        String log = "Error: File not found. Error: Permission denied.";

        // This method searches for the substring starting from the end of the string and moves backward
        int lastIndexOfError = log.lastIndexOf("Error");

        // Display the index of the last occurrence of the substring "Error"
        System.out.println("The last occurrence of 'Error' is at index: " + lastIndexOfError);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD34)