class Codechef {
    public static void main(String[] args) {
        String sentence = "apple pie";

        // Find the indices of 'p' and 'e'
        int indexOfP = sentence.indexOf('p');
        int indexOfE = sentence.indexOf('e');

        // Compare indices using relational operators
        boolean isPBeforeE = (indexOfP < indexOfE);

        // Print the comparison result
        System.out.println("Is 'p' before 'e'? "+isPBeforeE);

    }
}
