
package javaapplication25;

import java.util.Scanner;
public class JavaApplication25 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int books;
    System.out.println("---WELCOME TO SERENDIPITY BOOKSELLER---");
    System.out.print("\nEnter the number of books:");
    books= input.nextInt();
    
    if (books <=0){
        System.out.println("\nSorry, you earned 0 points.");
        
    }else if (books >= 1 && books < 2){
        System.out.println("\nCongratulations you earned 5 points.");
    }else if (books >= 2 && books < 3){
        System.out.println("\nCongratulations you earned 15 points.");
    }else if (books >= 3 && books < 4){
        System.out.println("\nCongratulations you earned 30 points.");
    }else if (books >= 4 ){
        System.out.println("\nCongratulations you earned 60 points.");
    }
        
    }

    
    }
    


