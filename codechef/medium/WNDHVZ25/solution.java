import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score > 60){
            System.out.println("You are eligible for the advanced course!");
        }
        else{
            System.out.println("You need to score higher to enroll in the advanced course.");
        }
    }
}