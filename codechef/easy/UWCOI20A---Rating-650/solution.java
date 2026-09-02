import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        for(int i = 0 ; i < t; i++){
            for(int j = 0; j < n; j++){
                if( arr[j] > max)
                     max = arr[j];
            }
        }
        System.out.println(max);
        
	}
}
