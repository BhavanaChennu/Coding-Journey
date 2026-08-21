class Codechef {
    public static void main(String[] args) {
        
        // Declare an email address with an old domain
        String email = "user123@oldmail.com";

        // Replace the old domain with the new domain using replace(CharSequence, CharSequence)
        String standardizedEmail = email.replace("oldmail.com", "newmail.com");

        // Print the original and standardized email
        System.out.println("Original Email: " + email);
        System.out.println("Standardized Email: " + standardizedEmail);
    }
}
