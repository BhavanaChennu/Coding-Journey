# LJAAS50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print the sentence

Write a program that takes the two different strings as input and prints them in a single line separated by spaces.

### Sample 1:
Input
Output

```
Code
Chef
```

```
Code Chef
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:28:17.474Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(input1 + " " + input2);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS50)