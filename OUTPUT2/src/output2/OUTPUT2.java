
package output2;

import java.util.Scanner;
public class OUTPUT2 {

    
    public static void main(String[] args) {
      
        
        Scanner reader= new Scanner (System.in);
        String name;
        
        int mth, scnce, hstr, ssc, ttlm, prcntg,num = 0;
        
        System.out.println("Enter students name:");
        name= reader.nextLine();
        
        System.out.println("Enter mark in math:");
        mth=reader.nextInt();
        
        System.out.println("Enter mark in Science:");
        scnce= reader.nextInt();
        
        System.out.println("Enter mark in History:");
        hstr= reader.nextInt();
        
        System.out.println("Enter mark in SOcial Science:");
        ssc= reader.nextInt();
        
        ttlm= (mth+scnce+hstr+ssc);
        System.out.println("Total Mark:" +ttlm);
        
        prcntg= (ttlm/4);
        System.out.println("Percentage:" +prcntg);
        
        if (num<=75)
            System.out.println("PASSED!");
        else
            System.out.println("FAILED!");
    }
    
}
