import java.util.*;
// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
         Scanner scanner = new Scanner(System.in);

        // Taking user input for luggage weight
        int luggageWeight = scanner.nextInt();

        // Defining the maximum allowed weight
        int maxWeight = 20;

        // Checking if the luggage meets the weight restriction
        if (luggageWeight <= maxWeight) {
            System.out.println("Your luggage is within the allowed limit.");
        } else {
            int excessWeight = luggageWeight - maxWeight;
            System.out.println("Your luggage exceeds the limit by " + excessWeight + " kg. Additional charges may apply.");
        }

        System.out.println("Luggage check completed.");
    }
}