package practiceprojects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kelseyhyde
 */
public class SayingHello {
    public static void main(String[] args){
        System.out.println("What is your name?");
        
        try{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String name = reader.readLine();
	      
	    System.out.println("Hello, " + name + ", nice to meet you!");
	}
	catch(IOException e)
	{
            System.exit(1);
	}
    }
}
