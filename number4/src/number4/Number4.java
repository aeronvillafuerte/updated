
package number4;

import java.util.Scanner;
public class Number4 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            int uno, dos, tres;
            
            System.out.print(" Input first number: ");
            uno = input.nextInt();

            System.out.print(" Input second number: ");
            dos = input.nextInt();

            System.out.print(" Input third number: ");
            tres = input.nextInt();

            if(uno < dos && uno< tres) System.out.println(" \nIncreasing order.");
            else if(uno > dos && dos > tres) System.out.println(" \nDecreasing order.");
            else System.out.println(" \nNeither increasing or decreasing order.");
    }
}
    
    

