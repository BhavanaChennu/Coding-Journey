class Codechef {
    public static void main(String[] args) {
        // Define the article or text content to analyze
        String article = "This article discusses Java programming.";
        
        // Use the contains() method with the logical AND operator (&&)
        // to check if the article contains both the keywords 'Java' and 'programming'
       boolean containsJava = article.contains("Java");
       boolean containsProg = article.contains("programming");
       boolean containsBoth = containsJava && containsProg;
        
        // Print the result, which will be true if both keywords are present, otherwise false
       System.out.println("Contains both keywords: "+ containsBoth);
    }
}
