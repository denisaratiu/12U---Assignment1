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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to allow user to input words
        Scanner input = new Scanner(System.in);
        // create an integer that stores the amount of times the loop is used
        // this represents the amount of words inputted
        int numberWords = 0;
        // ask user to input any amount of words
        System.out.println("Enter any amount of words below and type "
                + "exit after inserting your last word.");
        // create a loop that allows user to input as many words as they want
        for (int i = 0;; i++) {
            // create a string that scans in the word
            String word = input.nextLine();
            // make sure to stop if the word is exit
            if (word.equals("exit") == true) {
                break;
            }
            // add one each time to the number of words if the word is not exit
            numberWords++;
        }
        // output the amount of words the user typed 
        System.out.println("You inserted " + numberWords + " words before typing exit.");

    }
}
