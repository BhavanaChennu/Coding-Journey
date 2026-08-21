class Codechef {
    public static void main(String[] args) {
        
        // Declare a phone number with hyphens
        String phoneNumber = "987-654-3210";

        // Replace hyphens with spaces using replace() method
        String formattedNumber = phoneNumber.replace('-', ' ');

        // Print the original and formatted phone number
        System.out.println("Original Phone Number: " + phoneNumber);
        System.out.println("Formatted Phone Number: " + formattedNumber);
    }
}
