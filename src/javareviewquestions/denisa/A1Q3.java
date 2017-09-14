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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get the user input
        Scanner input = new Scanner(System.in);

        // ask user to input all expenses
        // input food expense 
        System.out.println("Please enter the food cost below: ");
        double food = input.nextDouble();

        // user input DJ expense
        System.out.println("Please enter the DJ cost below : ");
        double DJ = input.nextDouble();

        // user input hall rental expense
        System.out.println("Please enter the hall rental cost below: ");
        double hallRental = input.nextDouble();

        // user input decoration expense
        System.out.println("Please enter the decoration expense below: : ");
        double decorations = input.nextDouble();

        // user input wait staff expense
        System.out.println("Please enter the cost for wait staff below: : ");
        double staff = input.nextDouble();

        // user input miscellaneous expense
        System.out.println("Please enter any miscellaneous expenses below: ");
        double miscellaneous = input.nextDouble();

        // calculate the total expenses 
        double total = food + DJ + hallRental + decorations + staff + miscellaneous;
        // output the total for all the expenses
        System.out.println("The total cost of all the expenses is $" + total + ".00.");

        // calculate the amount of tickets needed to break even 
        // break even = expenses and revenue are the same
        // tickets are $35.00 
        // round tickets up if it would be a decimal number
        int tickets = (int) Math.ceil(1.0 * total / 35);

        // output the amount of tickets they need to sell to break even
        System.out.println("The prom committee will need to sell " + tickets
                + " ticket(s) to break even.");
    }
}
