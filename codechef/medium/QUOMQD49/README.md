# QUOMQD49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Case Sensitivity

What will be the output of the following code?

```
class Codechef {
    public static void main(String[] args) {
        String fileName = "Report.PDF";
        System.out.println(fileName.endsWith("pdf"));
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T11:35:12.607Z  

```cpp
class Codechef {
    public static void main(String[] args) {

        String url = "www.example.com";

        // Use the endsWith() method to check if the URL ends with ".com"
        // This will return true if the URL ends with ".com", otherwise false
        System.out.println("Ends with '.com': " + url.endsWith(".com"));

        // Use the endsWith() method to check if the URL ends with ".org"
        // This will return true if the URL ends with ".org", otherwise false
        System.out.println("Ends with '.org': " + url.endsWith(".org"));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD49)