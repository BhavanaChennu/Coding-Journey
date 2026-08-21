class Codechef {
    public static void main(String[] args) {
        
        // This is the string where we will search for the substring "www"
        String url = "https://www.example.com";

        // The indexOf() method searches for the first occurrence of the substring "www"
        // It returns the starting index of the substring in the string
        // If "www" is not found, it will return -1
        int indexOfWWW = url.indexOf("www");

        // Display the index of the substring "www" or -1 if it is not found
        System.out.println("The index of 'www' is: " + indexOfWWW);
    }
}
