class Codechef {
    public static void main(String[] args) {
        
        String feedback = "   Great product and service! ";
        
        // Trim the original string and store as trimmedFeedback
        String trimmedFeedback = feedback.trim();

        // convert trimmedFeedback to upper case and lower case
        String uppercase = trimmedFeedback.toUpperCase();
        String lowercase = trimmedFeedback.toLowerCase();

        
        // output the strings and length as required
        System.out.println(uppercase + "\n" + lowercase + "\n" + trimmedFeedback.length());




    }
}