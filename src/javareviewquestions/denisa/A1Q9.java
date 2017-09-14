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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get user to input words
        Scanner input = new Scanner(System.in);
        // ask user to input 10 words
        System.out.println("Enter 10 words below: ");
        // store words in an array
        String[] words = new String[10];
        // store the amount of letters in the word into an array
        int totalCharacters = 0;
        // store the total letter count
        int runningTotalCharacters = 0;
        // create a loop that allows user to input 10 words
        for (int i = 0; i < words.length; i++) {
            // allow user to input words
            words[i] = input.next();
            // count the amount of letters in the word
            totalCharacters = words[i].length();
            // add the total amount of letters from each word together
            runningTotalCharacters = runningTotalCharacters + totalCharacters;
        }
        // get the average word length
        int average = runningTotalCharacters / 10;
        // output the average word length
        System.out.println("The average word length is " + average + " character(s) long.");

    }
}
