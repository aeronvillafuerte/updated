
package output4;

import java.util.Scanner;
public class Output4 {

   
    public static void main(String[] args) {
        
        Scanner reader= new Scanner (System.in);
        String fstn, scdn;
        
        int age, num1 = 0, brthdate;
        
        System.out.println("Enter first name:");
        fstn = reader. nextLine();
        
        System.out.println("Enter last name:");
        scdn = reader.nextLine();
        
        System.out.println("Enter Birthdate:");
        brthdate= reader.nextInt();
        
        age= (2022- num1);
        
        System.out.println("Hello," +fstn + scdn);
        if (age >= 18)
        System.out.println("Your age is " +age+ "and of legal age.");
        else
        System.out.println("Your age is" +age+ "and of minor age.");
       
       
        
        

    }
    
}
