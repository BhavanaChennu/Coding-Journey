class Codechef {
    public static void main(String[] args) {
        
        // Define a variable named subjectName and provide it a value.
        String subjectName = "Mathematics@Physics@Chemistry";
        
        // Use replace() method to replace '@' with '_'
        String afterReplace = subjectName.replace('@' , '_') ;       

        // Print the desired results
        System.out.println("Modified subject name: "+afterReplace);
    }
}
