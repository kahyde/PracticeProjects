package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a simple mad-lib program that prompts for a noun, a verb, an adverb, 
 * and an adjective and injects those into a story.
 * @author kelseyhyde
 */
public class MadLib {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Welcome to Mad libs!");
            
            System.out.println("Enter a noun:");
            String noun = reader.readLine();
            
            System.out.println("Enter a verb:");
            String verb = reader.readLine();
            
            System.out.println("Enter an adjective:");
            String adjective = reader.readLine();
            
            System.out.println("Enter an adverb:");
            String adverb = reader.readLine();
            
            System.out.println();
            System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
        }
        catch (IOException e){
            
        }
    }
}
