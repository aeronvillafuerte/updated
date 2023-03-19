
package output1;

import java.util.Scanner;


public class Output1 {

    
    public static void main(String[] args) {
        // TODO code application logic 
     
        Scanner reader= new Scanner (System.in);
        int num1, num2;
        
        System.out.println("Enter value for num1:");
        num1 = reader.nextInt();
        
        System.out.println("Enter value for num2:");
        num2 = reader.nextInt();
        
        if (num1 > num2 )
            System.out.println("num1 is greater than num2");
        else if (num2 > num1)
            System.out.println("num2 is greater than num1");
        else 
            System.out.println("both have equal value");
            
             
    }
    
}
