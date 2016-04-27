package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a program that prompts for a quote and an author. Display the 
 * quotation and author.
 * @author kelseyhyde
 */
public class PrintingQuotes {
    public static void main(String[] args){
        System.out.println("What is the quote?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String quote = reader.readLine();
            System.out.println("Who said it?");
            String author = reader.readLine();
            
            System.out.println(author + " says, \"" + quote + ".\"");
        }
        catch( IOException e){
            
        }
    }
}
