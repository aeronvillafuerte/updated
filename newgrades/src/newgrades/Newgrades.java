/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newgrades;
import java.util.*;
class StudentDetails{

    private String id;
    private String fname;
    private String lname;
    private double average;
    private String status;

    StudentDetails(String id, String fname, String lname) {
        this.id = id;
    this.fname = fname;
    this.lname = lname;
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
   
    
  

}




public class Newgrades {

    
    public static void main(String[] args) {

        
        StudentDetails[] cap = new StudentDetails[100];
        Scanner input = new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
        int ch = 1;
        int x, num = 0;
        
        
        System.out.println("Add number of Student:");
            num = input.nextInt();

       for (x=0; x<num; x++){
           input.nextLine();
          
           System.out.println("Student "+(x+1)+" Details:");
           System.out.print("ID:");
           
           cap[x].setId(input.next());
          
           System.out.println("Fname:");
           cap[x].setFname(input.next());
           
           System.out.println("Lname:");
           cap[x].setLname(input.next());
           
           
           
       }

        
        do {
            System.out.println("Student List");
        System.out.println("    ID  |   First Name |   Last Name    |   Average |   Status");
        
        for(x =0; x < num; x++){
            System.out.println("   "+cap[x].getId()+"  |         "+cap[x].getFname()+"   |        "+cap[x].getLname()+"   |   "+cap[x].getAverage()+" |   "+cap[x].getStatus());
            
            
        }
        System.out.println("Option: \n1. View Student List\n2. Add Student\n3. Update Student Details\n4. Update Student Average\n5. Remove Student\n6. View Class Student\n7. Clear & Quit: ");
                     ch = input.nextInt();
                     
                     
                     switch(ch){
                         case 1:
                                                          

                             break;
                             
                             
                         case 2: 
                             System.out.println("Enter student ID: ");
                             String id = input.next();
                             
                             System.out.println("Enter Fname: ");
                             String fname = input.next();
                             System.out.println("Enter Lname: ");
                             String lname = input.next();
                             
                             cap[x] = new StudentDetails(id,fname,lname);
                             
                             break;
                             
                         case 3:
                            boolean found = false;
                             
                             break;
                         
                         
                         
                     }
        
        
        }while(ch!=0);
        
    }
        }  
