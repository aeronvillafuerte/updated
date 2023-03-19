
package sumandaverage;


import java.util.Scanner;
public class Sumandaverage {

   
    public static void main(String[] args) {
        
        int i, sum=0, numero=0;
        double ave;
        {
            System.out.println("Input the 5 numbers:");
        }
        
            for (i=0; i<5;i++)
            {
            Scanner in = new Scanner(System.in);
            numero= in.nextInt();
            
            sum += numero;
        }
            
            ave=sum/5;
            
            System.out.println("The Sum of 5 is: " +sum);
            System.out.println("\nThe Average is: " +ave);
        
    }
    
}
