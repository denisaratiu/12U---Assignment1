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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to get user input
        Scanner input = new Scanner(System.in);
        // ask the user to input their name below
        System.out.println("Please input your name: ");
        // scan the users name into a variable
        String name = input.nextLine();
        // say hello to the user
        System.out.println("Hello " + name + "!");
    }
}
