
package integer;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Integer {

    private static final DecimalFormat df = new DecimalFormat ("0.00");
    public static void main(String[] args) {
       
        Scanner read = new Scanner (System.in);
        
        int f,s,sum,dif,prod,dis;
                double ave;
        
        
        System.out.println("Input 1st Integer: ");
        f  = read.nextInt();
        System.out.println("Input 2nd Integer: ");
        s = read.nextInt();
        
        sum = f + s;
        System.out.println("Sum of two integers: "+sum);
        
        dif = f - s;
        System.out.println("Difference of two integers: "+dif);
        
        prod = f * s;
        System.out.println("Product of two integers: "+prod);
        
        ave = sum / 2;
        System.out.println("Average of two integers: "+df.format(ave));

        dis = f - s;
        System.out.println("Distance of two integers: "+dis);


                if (f > s ){
            System.out.println(" Max integer: "+f);
                }
                else {
            System.out.println(" Max integer :"+s);
                }
                
                if ( f < s  ){
            System.out.println(" Min integer: "+f);
                }
                else {
            System.out.println(" Min integer :"+s);
                }
                
        
        
        
    }
    
}
