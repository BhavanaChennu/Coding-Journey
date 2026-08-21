class Codechef {
    public static void main(String[] args) {
        
        String s1="Hello";
        String s2="World";
        
        // Converting both strings to uppercase
        s1.toUpperCase();
        s2.toUpperCase();


        // Concatenating with a space in between
        String s3 = s1.concat(" ").concat(s2);

        // Printing the length of the final string
        System.out.println(s3.length());

        // Printing the final string
        System.out.println(s3);
        
    }
}
