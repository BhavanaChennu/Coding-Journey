# GSJ212

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T18:09:37.988Z  

```java
// Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        // accept the count of test cases given in the 1st line
        int t = read.nextInt();
        
        // Run a loop to accept 't' inputs
        for(int i=0; i<t; i++)
        {
            // accept 2 integers on the 1st line of each test case
            int a = read.nextInt();
            int b = read.nextInt();
            
            // accept 1 string on the 2nd line of each test case
            String s = read.next();
            
            // output the 2 integers and 1 string on a single line for each test case
            System.out.println(a + " " + b + " " + s);
        }
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ212)