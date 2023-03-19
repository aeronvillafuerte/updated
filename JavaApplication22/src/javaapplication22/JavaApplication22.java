
package javaapplication22;

import java.util.Scanner;
public class JavaApplication22 {

    
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       
       int amiga;
       
        System.out.println("Enter Total Amount of Bill:");
        double bill= s.nextInt();
        
        System.out.println("Would you like to divide the total bill: (Y/N)") ;
        char kwe = s.next().charAt(0);
        
        
        if (kwe == 'Y' || kwe== 'y' ){
        System.out.println("Enter number of friends:");
        amiga= s.nextInt();
        
        double total = bill / amiga;
        System.out.println("Total Payment of each friends: " +(double)total);
        
    }else  {
            System.out.println("Total Bill: " +(double)bill);
        }
    
}
}
