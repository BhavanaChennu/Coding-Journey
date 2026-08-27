import java.util.Scanner; // Import Scanner class to take input from the user

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 

         // Read user input and store it in the 'warningLevel' variable
        int warningLevel = scanner.nextInt();

        switch (warningLevel) {
            case 1: 
                System.out.println("Advisory: Be cautious, weather may affect your plans.");

            case 2: 
                System.out.println("Watch: Conditions may escalate, stay alert.");

            case 3:
                System.out.println("Warning: Severe weather expected, take precautions.");

                System.out.println("Stay safe."); 
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}