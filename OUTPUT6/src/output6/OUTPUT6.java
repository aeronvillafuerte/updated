
package output6;

import java.util.Scanner;
public class OUTPUT6 {

    
    public static void main(String[] args) {
        Scanner reader= new Scanner (System.in);
        
        int height, width, perim;
        
        System.out.println("Input the Height of the Rectangle:");
        height= reader.nextInt();
        
        System.out.println("Input the Width of the Rectangle:");
        width= reader.nextInt();
        
        perim= 2*(height+width);
        
        System.out.println("Perimeter of the Rectangle:" +perim);
        
       
    }
    
}
