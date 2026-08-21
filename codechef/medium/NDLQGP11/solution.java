class Codechef {
    public static void main(String[] args) {
        
        // Declare receipt header with extra spaces
        String receiptHeader = "    BILLING RECEIPT    ";

        // Trim spaces to format the header properly using trim() method
        String formattedHeader = receiptHeader.trim();

        // Print the original and formatted header
        System.out.println("Original Header: [" + receiptHeader + "]");
        System.out.println("Formatted Header: [" + formattedHeader + "]");
    }
}