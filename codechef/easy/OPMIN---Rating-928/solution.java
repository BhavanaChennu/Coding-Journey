import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int largest = a[0] , secondLargest = Integer.MIN_VALUE;
            for(int i = 1; i < n; i++){
                if(a[i] > largest){
                    secondLargest = largest;
                    largest = a[i];
                }
                else if(a[i] > secondLargest && a[i] != largest ){
                    secondLargest = a[i];
                }
            }
            int sum = largest + secondLargest;
            System.out.println(sum);            
        }
    }
}
