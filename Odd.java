
/**
 *code challenges 
 *1. tells you if a number you entered is odd or even
 *2. divisible by 3 or 5 or both or neither
 *3. Replaces 3 or 5 with three or five
 *4. Sum of all mulitiples of 3 or 5 under a 1000
 * @author (Kimberly Druessel) 
 * @date (14 May 2015)
 */

import java.util.Scanner;
import java.lang.String;

public class Odd
{
    int num;
    String userInput;
    Scanner in = new Scanner(System.in);
   
    public void main()
    {   
     check();
     while (true)
        {
            System.out.println("Do you want to try another number? (Y/N): ");
            userInput = in.next();
            if (userInput.equalsIgnoreCase("Y")) 
                check();
            else if (userInput.equalsIgnoreCase("N"))//Enters into sum challenge
            {
                System.out.println("Thank you but before you go!!");
                System.out.println("This is the sum of all multiples of 3 or 5 below 1000!");
                
                int total = 0; 
                for (int i=1; i<1000; ++i) 
                { 
                    if (i%3 == 0 || i%5 == 0) 
                    { 
                        total += i; 
                    } 
                }
                System.out.println("The total is " + total + ".");
                break;
            }
            else
            {
                System.out.println("Try Again With (Y/N) only!");   
            }

        }
    }
        public void check()//Odd/Even and Divisible by 3/5 and replace challenges
        {
            System.out.println("Check Odd or Even");
            System.out.print("Enter an integer: ");
            num = in.nextInt();
            System.out.println("You entered integer "+ num + ".");
            if((num % 2) == 0) 
            {
            System.out.println(num + " is Even number!");
            }
            else
            {
            System.out.println(num + " is Odd number!"); 
            }
            if ((num % 3) == 0 && (num % 5) == 0)
            {
                String myString = "Divisible by both 3 and 5";
                System.out.println(myString);
                System.out.println(myString.replaceAll("3", "three").replaceAll("5", "five"));
            }
            else if  ((num % 3) == 0 && (num % 5) != 0)
            {
                String myString = "Divisible by 3";
                System.out.println(myString);
                System.out.println(myString.replaceAll("3", "three"));
            }
            else if ((num % 3) != 0 && (num % 5) == 0)     
            {
                String myString = "Divisible by 5";
                System.out.println(myString);
                System.out.println(myString.replaceAll("5", "five"));
            }
           
            else
            {
                String myString = "Indivisible by 3 and 5";
                System.out.println(myString);
                System.out.println(myString.replaceAll(" by 3", ", with Liberty").replaceAll("5", "Justice for All"));
            }
                
        }
        
}
 