import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        double principal;
        while (true) {
            System.out.print("Enter principal amount: ");
            principal = scanner.nextDouble();
            if (principal > 0) {
                break;
            }
            System.out.println("Principal amount must be greater than 0. Please try again.");
        }

        // Input annual interest rate
        double annualInterestRate;
        while (true) {
            System.out.print("Enter annual interest rate: ");
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate > 0) {
                break;
            }
            System.out.println("Interest rate must be greater than 0. Please try again.");
        }

        // Input loan term in years
        int years;
        while (true) {
            System.out.print("Enter loan term (in years): ");
            years = scanner.nextInt();
            if (years > 0) {
                break;
            }
            System.out.println("Loan term must be greater than 0. Please try again.");
        }

        // Calculate monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate number of monthly payments
        int numberOfPayments = years * 12;

        // Calculate mortgage payment
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Display the monthly mortgage payment
        System.out.println("Your monthly mortgage payment is: $" + mortgage);

        scanner.close();
    }
}
