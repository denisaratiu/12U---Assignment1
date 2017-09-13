/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareviewquestions.denisa;

import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get user input
        Scanner input = new Scanner(System.in);
        // ask the user input the initial amount
        System.out.println("Please input the current amount of money in your savings account");
        // scan in the number that the user inputs
        // use a double due to decimal numbers (cents)
        double initialAmount = input.nextDouble();
        // ask the user to input the interest rate
        System.out.println("Please input the interest rate as a decimal");
        // allow user to input a number that represents the interest rate
        double interestRate = input.nextDouble();

        // create two integers that stores the number of years to double and get to 1 million dollars
        int doublingTime = 0;
        int millionDollarTime = 0;

        // calculate the amount of time the money will double in
        for (double balance = initialAmount; balance < initialAmount * 2; balance = (1 + interestRate) * balance) {
            // add one year each time to the time it will take to double the amount
            doublingTime++;
        }
        // calculate the amount of time needed to reach 1 million dollars
        for (double millionBalance = initialAmount; millionBalance < 1000000;
                millionBalance = (1 + interestRate) * millionBalance) {
            // add one year each time to the time it will take to reach 1 million dollars
            millionDollarTime++;
        }
        // output the answers
        System.out.println("It will take " + doublingTime + " year(s) for the money in the "
                + "savings account to double at the specified rate.");
        System.out.println("It will take " + millionDollarTime + " year(s) "
                + "to reach 1 million dollars.");
    }
}
