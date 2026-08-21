class Codechef {
    public static void main(String[] args) {
        // Initialize a string variable to store the message
        String message = "Welcome to the club!";

        // Use the startsWith() method combined with the NOT operator (!)
        // to check if the message does NOT start with the word "Hello"
        boolean startsWithHelllo = message.startsWith("Hello");

        // Output the result of the check
        System.out.println("Does not start with 'Hello': "+ !startsWithHelllo);
    }
}
