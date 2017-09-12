/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareviewquestions.denisa;

/**
 *
 * @author ratid6445
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // integer that represents the year that the population was 6 billion
        int year = 1999;
        // start at the world population and increase by the rate until it reaches the wanted population
        // let 6 represent 6 billion (world population) and 10 represent 10 billion (wanted population)
        for (double i = 6; i < 10; i += i * 0.014) {
            // add one to the year each time the loop is gone through until it stops at the wanted population
            year++;
        }
        // output the year
        System.out.println("The population will exceed 10 billion in the year " + year + ".");
    }
}
