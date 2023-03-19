
package hgk;

import java.util.Scanner;
public class Hgk {

    
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
    
      
        System.out.println("Weight in pounds:");
        double weight= input.nextInt();
        
        System.out.println("Height in inches:");
        double height= input.nextInt();
        
        double BMI = (weight*703)/(height*height);
        System.out.println("Your BMI is: " +BMI);
        
        if (BMI < 18.5){
            System.out.println("Underweight");
        }else if (BMI >= 18.5 && BMI <25.5){
            System.out.println("Optimal");
        
        }else {
            System.out.println("Overweight");
        }
      
    
}
}