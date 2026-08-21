# NDLQGP15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Processing User Feedback in a Survey System

In a survey system, users submit feedback in the form of short text responses. These responses may include  **leading or trailing spaces**, inconsistent  **capitalization**, or  **mixed case letters**.

 **Tasks to do:** 

- Trimming any leading and trailing whitespace.
- Printing the cleaned feedback in: All uppercase All lowercase
- Printing the length of the cleaned feedback (after trimming).

 **Expected Output** 

```
GREAT PRODUCT AND SERVICE!
great product and service!
26

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:53:43.139Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String feedback = "   Great product and service! ";
        
        // Trim the original string and store as trimmedFeedback
        String trimmedFeedback = feedback.trim();

        // convert trimmedFeedback to upper case and lower case
        String uppercase = trimmedFeedback.toUpperCase();
        String lowercase = trimmedFeedback.toLowerCase();

        
        // output the strings and length as required
        System.out.println(uppercase + "\n" + lowercase + "\n" + trimmedFeedback.length());




    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP15)