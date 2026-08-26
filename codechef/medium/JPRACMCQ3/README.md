# JPRACMCQ3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Chef needs to park her car while she watches a movie. The parking charges at the theater are as follows:

- Rs. $X$ for the first 1 hour
- Rs. $Y$ for every extra hour after the first hour

If Chef parks her car for $H$ hours, what is the total parking charges that she should pay?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:41:20.851Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int newrows = sc.nextInt();
        
        int totalCells = (rows + newrows) * cols;
        System.out.println(totalCells);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ3)