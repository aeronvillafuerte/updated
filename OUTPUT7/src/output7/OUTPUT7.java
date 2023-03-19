
package output7;

import java.util.Scanner;
public class OUTPUT7 {

    
    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        
        int t=0;
        int hours, minutes, mnt;
        
        
        System.out.println("Enter number of minutes:");
        minutes= reader.nextInt();
        
        hours=  minutes /60;
        mnt= minutes % 60;
        
        System.out.println("Total hours " +hours+ " and " +mnt+ " minutes " );
        
        
        
        

    }
    
}
