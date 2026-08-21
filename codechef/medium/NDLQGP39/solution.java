class Codechef {
    public static void main(String[] args) {
        // Declare a product price as a String
        String priceStr = "120.50";

        // Convert the String price to a double for calculations
        double price = Double.parseDouble(priceStr);

        // Apply a 10% discount
        double discountedPrice = price * 0.90;

        // Convert the final price back to String
        String finalPriceStr = String.valueOf(discountedPrice);

        // Print the original and discounted prices
        System.out.println("Original Price: $" + priceStr);
        System.out.println("Discounted Price: $" + finalPriceStr);
    }
}
