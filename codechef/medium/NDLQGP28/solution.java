class Codechef {
    public static void main(String[] args) {
        
        // Step 1: Declare a string variable and assign a sentence to it.
        // This sentence contains multiple words separated by spaces.
        String sentence = "Java makes programming easier";

        // Step 2: Use the split() method to break the string into separate words and directly access them.
        String firstWord = sentence.split(" ")[0];  // First word
        String secondWord = sentence.split(" ")[1]; // Second word
        String thirdWord = sentence.split(" ")[2];  // Third word
        String fourthWord = sentence.split(" ")[3]; // Fourth word

        // Step 3: Display each word separately.
        System.out.println("The first word in the sentence is: " + firstWord);
        System.out.println("The second word in the sentence is: " + secondWord);
        System.out.println("The third word in the sentence is: " + thirdWord);
        System.out.println("The fourth word in the sentence is: " + fourthWord);
    }
}