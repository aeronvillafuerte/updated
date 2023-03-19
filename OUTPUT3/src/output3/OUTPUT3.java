
package output3;

import java.util.Scanner;
public class OUTPUT3 {

    public static void main(String[] args) {
        
        Scanner reader= new Scanner (System.in);
        String name;
        
        int ttlp, ttll, xpctdp = 0, nprod, pprod, sprod,rprod;
        
        System.out.println("Enter number of products:");
        nprod= reader.nextInt();
        
        System.out.println("Enter price per products:");
        pprod= reader.nextInt();
        
        System.out.println("Number of sold products:");
        sprod= reader.nextInt();
        
        System.out.println("Enter remaining products:");
        rprod= reader.nextInt();
        
        ttlp = pprod*sprod;
        ttll = (nprod-sprod)*pprod;
        xpctdp = pprod*nprod; 
        
        System.out.println("Total Price:" +ttlp);
        System.out.println("Total Loss:" +ttll);
        System.out.println("Expected Profit:"+xpctdp);

    }
    
}
