package area;

import java.util.Scanner;


public class Area {
    float lnght, brdth;
    
    Area (float a, float b){
    lnght = a;
    brdth = b;
}
    
    public float setDim(){
        float total = lnght* brdth;
        return total;
    }
    
    public void getArea(){
        System.out.println("The Area of the Rectangle: " +setDim());
    }
    
    public static void main(String[] args) {
        
        float lnght, brdth;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter the lenght:");
        lnght = read.nextFloat();
        
        System.out.println("Enter the breadth:");
        brdth = read.nextFloat();
        
       
       Area rectangle = new Area(lnght, brdth);
       rectangle.getArea();
       
       
    }
    
}