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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get user to input a number
        Scanner input = new Scanner(System.in);
        // get the user to input a number between 1 and 10 
        System.out.println("Please input a number between 1 and 10 below: ");
        // scan the users input into an integer
        int number = input.nextInt();
        //create loop that will replace the number inputted with the corresponding amount of asterisks
        for (int numAsterisks = 0; numAsterisks < number; numAsterisks++) {
            // output asterisks that correspond to the number inputted
            System.out.print('*');
        }
    }
}
