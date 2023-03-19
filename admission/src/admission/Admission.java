
package admission;

import java.util.Scanner;
public class Admission {

  
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        int math, phy, chem, tot, tmp;
        
        System.out.println("Eligibility Criteria for an Engeneering:");
        System.out.println("Marks in Mathematics >= 65");
        System.out.println("Mark in Physics >=55");
        System.out.println("Marks in Chemistry >= 50");
        System.out.println("Total in all Three Subject >= 190");
        System.out.println("Total in Math and Physics >= 140");
        
        System.out.println("\n-----------------------------------------");
        
        System.out.println("Input the marks in Math:");
        math = input.nextInt();
        System.out.println("Input the marks in Physics:");
        phy = input.nextInt();
        System.out.println("Input the marks in Chemistry:");
        chem = input.nextInt();
        
        tot = math + phy + chem;
        System.out.println("Total of the three subject:" +tot);
        
        tmp = math + phy;
        System.out.println("Total of Math and Physics:" +tmp);
        
        if (math >= 65){
            System.out.println("The candidate is eligible for admission. ");
        }else if(phy >= 55){
            System.out.println("The candidate is not eligible for admission.");
        }else if (chem >= 50){
            System.out.println("The candidate is not eligible for admission.");
        }else if (tot >= 190 || tmp >= 140){
            System.out.println("The candidate is not eligible for admission.");
        }
      
        
}
    
}
