class Codechef {
    public static void main(String[] args) {
        String password = "mypass123";
        
        // Use a ternary operator to check the password strength
        String strength = (password.length() >= 8 )? "Strong" : "Weak";// Your code here
        
        System.out.println("Password strength: " + strength);
    }
}
