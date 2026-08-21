# NDLQGP29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Splitting Text Data Using Multiple Delimiters

A data management system processes log entries from various sources. These logs contain timestamps separated by multiple separators.

 **Steps to Complete:** 

- Use the split() method to split log entry using multiple delimiters (:, ;).
- Display the desired results.

 **Expected Output:** 

```
Timestamp: 12  
Minutes: 30  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T12:31:06.223Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Example log entry with multiple delimiters
        String logEntry = "12:30";

        // Use split() with multiple delimiters (Regex: [:;] means split at ':', ';')
        String timestamp = logEntry.split("[:;]")[0]; // Extract first part
        String minutes = logEntry.split("[:;]")[1];   // Extract second part

        // Print extracted log components
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Minutes: " + minutes);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP29)