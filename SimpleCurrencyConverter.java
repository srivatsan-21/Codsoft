import java.util.Scanner;

public class SimpleCurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Allow the user to choose the base currency and the target currency
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Step 2: Hardcoded exchange rates for simplicity
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        // Step 3: Take input from the user for the amount they want to convert
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Step 4: Convert the input amount from the base currency to the target currency
        double convertedAmount = amount * exchangeRate;

        // Step 5: Display the converted amount and the target currency symbol to the user
        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);

        scanner.close();
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Hardcoded exchange rates for simplicity
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85; // Example rate
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return 74.50; // Example rate
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18; // Example rate
        } else {
            return 1.0; // Default rate if no match found
    }
    }
}