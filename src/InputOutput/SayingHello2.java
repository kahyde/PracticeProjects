package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a version of the program that displays different greetings 
 * for different people.
 * @author kelseyhyde
 */
public class SayingHello2 {
    public static void main(String[] args){
        System.out.println("What is your name?");
        
        try{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String name = reader.readLine();
            
            
            if(isVowel(name.charAt(0))){
               System.out.println("Hello, " + name + ", nice to meet you!"); 
            } 
            else {
               System.out.println("How's it going, " + name + "!");
            }
	}
	catch(IOException e)
	{
            System.exit(1);
	}
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
