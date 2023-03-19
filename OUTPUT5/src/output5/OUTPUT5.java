
package output5;

import java.util.Scanner;
public class OUTPUT5 {

   
    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        
        String Fname, Lname;
        
        int age, brthdate;
        
        System.out.println("Enter first name:");
        Fname= reader.nextLine();
        
        System.out.println("Enter last name:");
        Lname= reader.nextLine();
        
        System.out.println("Enter Birthdate:");
        brthdate= reader.nextInt();
        
        age= (2022-brthdate);
        
        System.out.println("Hello " + Fname + Lname);
        System.out.println("Your Age is " +age+ " years old");
     
    }
    
}
