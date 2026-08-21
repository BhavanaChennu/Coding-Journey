class Codechef {
    public static void main(String[] args) {
        
        // This is the log message where we want to search for the substring "Error"
        String log = "Error: File not found. Error: Permission denied.";

        // This method searches for the substring starting from the end of the string and moves backward
        int lastIndexOfError = log.lastIndexOf("Error");

        // Display the index of the last occurrence of the substring "Error"
        System.out.println("The last occurrence of 'Error' is at index: " + lastIndexOfError);

    }
}
