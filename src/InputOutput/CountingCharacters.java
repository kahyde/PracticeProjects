package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a program that prompts for an input string and displays output that 
 * shows the input string and the number of characters the string contains.
 * @author kelseyhyde
 */
public class CountingCharacters {
    public static void main(String[] args){
        System.out.println("What is the input string?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String input = reader.readLine();
            int length = input.length();
            
            while (length == 0){
                System.out.println("You must enter a string!");
                input = reader.readLine();
                length = input.length();
            }
            System.out.println(input + " has " + length + " characters");
        } 
        catch (IOException ex) {
        }
        
    }
}
