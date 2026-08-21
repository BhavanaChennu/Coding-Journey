class Codechef {
    public static void main(String[] args) {
        // Define a string
        String word = "unhappy";

        // Check if the word starts with the prefix "un"
        int prefixIndex = word.indexOf("un");
        boolean startsWithUn = (prefixIndex == (word.indexOf("un")));

        // Print the result
        System.out.println("Does the word start with 'un'? "+startsWithUn);

    }
}
