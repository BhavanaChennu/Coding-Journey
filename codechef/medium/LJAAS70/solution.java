import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
       Scanner scanner = new Scanner(System.in);
       int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Increasing");
        } else if (a > b && b > c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
	}
}
