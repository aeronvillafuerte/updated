package out4 ;

import java.util.Scanner;
public class Out4 {

   
    public static void main(String[] args) {
        
        Scanner reader= new Scanner (System.in);
        String fstn, scdn;
        
        int num1 = 0, brthdate;
        
        System.out.println("Enter first name:");
        fstn = reader. nextLine();
        
        System.out.println("Enter last name:");
        scdn = reader.nextLine();
        
        System.out.println("Enter Birthdate:");
        num1= reader.nextInt();
        
        brthdate= (2022- num1);
        
        System.out.println("Hello," +fstn  +scdn);
        if (brthdate >= 18)
        System.out.println("Your age is " +brthdate+ " and of legal age.");
        else
        System.out.println("Your age is" +brthdate+ " and of minor age.");
       
    }
    
}
