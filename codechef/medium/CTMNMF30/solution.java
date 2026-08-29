import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(  i <= n ){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}