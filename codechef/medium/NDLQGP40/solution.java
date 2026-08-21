class Codechef {
    public static void main(String[] args) {
        
        String principalStr = "5000";     // principal amount in rupees
        String rateStr = "5.5";           // annual interest rate in percent
        String timeStr = "2";             // time period in years
        int customerId = 202;             // customer ID (int)
        char accountType = 'S';           // account type: S = Savings, C = Current


        // Convert string inputs to appropriate data types
        int principal = Integer.parseInt(principalStr);
        double rate = Double.parseDouble(rateStr);
        int time = Integer.parseInt(timeStr);



        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Convert other values to strings for display
        String customerIdStr = String.valueOf(customerId);
        String accountTypeStr = Character.toString(accountType);


        // Print the results
        System.out.println("Principal amount is: " + principal);
        System.out.println("Interest rate is: " + rate + "%");
        System.out.println("Time period is: " + time + " years");
        System.out.println("Customer ID as string: " + customerIdStr);
        System.out.println("Account type as string: " + accountTypeStr);
        System.out.println("Calculated Simple Interest is: " + simpleInterest);
        
    }
}