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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask the user to input 3 numbers 
        System.out.println("Please input three numbers below: ");
        //make an array that stores three numbers
        double[] numbers = new double[3];
        //store the numbers in an array
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }

        // get the product of the number
        // create a double o store the product
        double product = 1;
        for (int i = 0; i < 3; i++) {
            // multiply the numbers by themselves and one
            product = product * numbers[i];
        }
        // output the product
        System.out.println("The product of the numbers is " + product);

        // get the square of the product
        double square = Math.pow(product, 2);
        // output the square of the product
        System.out.println("The square of the product is " + square);

        // get the square root of the product
        double squareRoot = Math.sqrt(product);
        // output the square root of the product
        System.out.println("The square root of the product is " + squareRoot);

    }
}
