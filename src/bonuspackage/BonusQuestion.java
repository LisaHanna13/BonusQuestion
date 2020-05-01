/*
 * This file tests the method from the Question file
 */
package bonuspackage;

/**
 *
 * @author lisa-
 */
public class BonusQuestion {

    /**
     * This is the main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an object
        Question greetingOne = new Question("Hey there!");
        System.out.println("The greeting is: " + greetingOne.greetings);
        
        //use the method
        greetingOne.setGreeting("Hello!");
        System.out.println("The greeting after being modified is: " + greetingOne.greetings);
    }
}
