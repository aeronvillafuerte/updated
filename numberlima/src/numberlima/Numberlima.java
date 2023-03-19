
package numberlima;
import java.util.Scanner;
import java.util.Arrays;

public class Numberlima {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int[]arr = {1, 4, 17, 7, 25, 3, 100};
       
       int max = arr[0];
       int min = arr[0];
       
       
       for(int i = 0; i < arr.length; i++){
           
           if(arr[i] > max){
               max = arr[i];
           }
           else if (arr[i] < min)
           {
               min = arr[i];
           }
           
    }
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(" Smallest value is: "+min);
        System.out.println(" Largest value is: "+max);

    }
    
}
        

    
    

