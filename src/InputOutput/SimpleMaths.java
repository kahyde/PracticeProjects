package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a program that prompts for two numbers. Print the sum, difference,
 * product and quotient of those numbers.
 * @author kelseyhyde
 */
public class SimpleMaths {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("What is the first number?");
            String firstStr = reader.readLine();
            int first = Integer.parseInt(firstStr);
            
            System.out.println("What is the second number?");
            String secondStr = reader.readLine();
            int second = Integer.parseInt(secondStr);
            
            System.out.println(first + " + " + second + " = " + (first+second) + "\n" +
                                first + " - " + second + " = " + (first-second) + "\n" +
                                first + " * " + second + " = " + (first*second) + "\n" +
                                first + " / " + second + " = " + (first/second) + "\n");
        }
        catch (IOException e){
            
        }
    }
}
