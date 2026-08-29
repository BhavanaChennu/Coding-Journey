class Codechef {
    public static void main(String[] args) {
        
        double fuel = 7.0; // Initialize fuel level

        // Start while loop to monitor fuel
        while ( fuel > 1.0 ) {    /* Fill in the missing condition */
            System.out.println( "Fuel remaining: "+fuel +" liters.");    /* Print remaining fuel message */

            // Reduce fuel by 1.0 liter
            fuel--;    // Fill in the missing logic
        }

        // Print low fuel warning
        System.out.println("Warning! Only 1.0 liter of fuel left. Refuel soon!");  
    }
}
