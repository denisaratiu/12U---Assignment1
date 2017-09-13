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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get user to input a number
        Scanner input = new Scanner(System.in);
        // ask the user to input a number
        System.out.println("Enter a number between 50 and 100 to stop at:");
        // scan the users input 
        int stopCount = input.nextInt();
        // start count from 100, stop when the counter gets to the number inputted
        // go down by 5
        for (int i = 100; i > stopCount; i = i - 5) {
            // output the numbers counted backwards from 100 by 5's until stopped
            System.out.println(i);
        }
    }
}
