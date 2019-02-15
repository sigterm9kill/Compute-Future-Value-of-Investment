/*
 * Sean O'Brien
 * Compute the future investment value
 */

package computefutureinvestmentvalue;

import java.util.Scanner;

/*
 * Write a method that computes future investment value at a given interest 
 * rate for a specified number of years.  Write a test program that prompts 
 * the user to enter the investment amount (e.g., 1,000) and the interest rate 
 * (e.g., 9%) and prints a table that displays future value for the years 
 * from 1 to 30.
 */

public class ComputeFutureInvestmentValue {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Get user inputs for investment amount, years and interest rate
        System.out.print("What is the amount that you want to invest? ");
        double investmentAmount = input.nextDouble();
        System.out.print("How many years do you wish to invest?  ");
        int years = input.nextInt();
        System.out.print("What is the interest rate (e.g., 9.5%): ");
        double monthlyInterestRate = input.nextDouble();

        // Assign proper decimal value to user's interest input
        monthlyInterestRate *= 0.01;

        // Make heading format and iteration, also assign new variable 
        // for iteration: 'i'
        System.out.println("Year" + "         " + "Future Value");
        for (int i = 1; i <= years; i++) {
            // Create variable for different spacing requirements
            int spacing = 22;
            if (i >= 10) {
                spacing = 21;
            }
            // Print table, using printf
            // Call futureInvestmentValue method
            System.out.printf(i + "%" + spacing + ".2f\n",
                    futureInvestmentValue(investmentAmount, monthlyInterestRate
                            / 12, i));
        }
    }

    // Calculation method futureInvestmentValue
    public static double futureInvestmentValue(double investmentAmount,
            double monthlyInterestRate, int years) {
        // Calculate future investment value from equation 2.21
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
