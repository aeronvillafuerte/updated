
package javaapplication23;

import java.util.Scanner;
public class JavaApplication23 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int num1, num2, num3, total;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Average of three numbers:");
        System.out.print("Enter Choice:");
        int choice = in.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("----ADDITION----");
                System.out.print("Enter num1:");
                num1= in.nextInt();
                System.out.print("Enter num2:");
                num2= in.nextInt();
                
                total= num1+num2;
                System.out.println("Sum = " +total);
                
            case 2:
                System.out.println("----SUBTRACTION----");
                System.out.print("Enter num1:");
                num1= in.nextInt();
                System.out.print("Enter num2:");
                num2= in.nextInt();
                
                total= num1-num2;
                System.out.println("Difference = " +total);
                
            case 3:
                System.out.println("----MULTIPLICATION----");
                System.out.print("Enter num1:");
                num1= in.nextInt();
                System.out.print("Enter num2:");
                num2= in.nextInt();
                
                total= num1*num2;
                System.out.println("Product = " +total);
                
            case 4:
                System.out.println("----DIVISION----");
                System.out.print("Enter num1:");
                num1= in.nextInt();
                System.out.print("Enter num2:");
                num2= in.nextInt();
                
                total= num1/num2;
                System.out.println("Qoutient = " +total);
                
            case 5:
                System.out.println("----AVERAGE OF THREE NUMBERS----");
                System.out.print("Enter num1:");
                num1= in.nextInt();
                System.out.print("Enter num2:");
                num2= in.nextInt();
                System.out.print("Enter num3:");
                num3= in.nextInt();
                
                total= (num1+num2+num3)/3;
                System.out.println("Average = " +total);
                
                if (num1 > num2 && num1 > num3){
                    System.out.println(num1+" has the maximum value.");
                }else if (num2 > num1 && num2 > num3){
                    System.out.println(num2+ " has the maximum value.");
                }else System.out.println(num3+ " has the maximum value.");
                    
                }    
        }
        
        
        
    }
    


