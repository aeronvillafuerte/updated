package Numerodos;
import java.util.Arrays;

import java.util.Scanner;

 class Numerodos {

    static int[] removeElement(int[] array, int remove)   

    {               

        int[] arrayNum = new int[array.length - 1];
        int i, a;

        for (i = 0, a= 0; i < array.length; i++)
        {            
            if (i == remove)
            {
                continue;
            }           
            arrayNum[a++] = array[i];
        }        
        return arrayNum;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);            
        int[] numArray = { 1, 15, 16, 81, 28};     
        int remove;
        
        System.out.print(" Enter index of the number to remove: ");
        remove = input.nextInt();
        numArray = removeElement (numArray, remove);
        System.out.println(" New array values:" +Arrays.toString(numArray));
    }

}