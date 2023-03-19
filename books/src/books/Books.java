
package books;

import java.util.Scanner;
public class Books {

static void main(String[] args) {
Scanner input=new Scanner(System.in);

int books;

    System.out.println("Enter the number of books:");
    books= input.nextInt();
    
    if (books <=0){
        System.out.println("You earn 0 points.");
        
    }else if (books >= 1 && books < 2){
        System.out.println("You earn 5 points.");
    }else if (books >= 2 && books < 3){
        System.out.println("You earn 15 points.");
    }else if (books >= 3 && books < 4){
        System.out.println("You earn 30 points.");
    }else if (books >= 4 ){
        System.out.println("You earn 60 points.");
    }
        
    }

    
}
