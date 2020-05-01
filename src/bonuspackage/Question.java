/*
 * This file contains the methods
 */
package bonuspackage;

/**
 *
 * @author lisa-
 */
public class Question {
    //Creating an attribute
    String greetings;
    
    /**
     * This is the constructor with greetings as a parameter
     * @param greetings 
     */
    public Question(String greetings){
        this.greetings = greetings;
    }
    
    /**
     * This mutator allows to set a greeting.
     * @param greetings 
     */
    void setGreeting(String greetings){
        this.greetings = greetings;
    }
}
