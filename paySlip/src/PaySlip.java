
import java.util.Scanner;
public class PaySlip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float slr, hrs, add, ttlnt = 0, mnHr=10;
        
        Employee emp = new Employee();
        Payslip ps = new Payslip(0);
        
        System.out.println("Enter employee ID: ");
        emp.employeeID = input.nextInt();
        System.out.println("Enter your Name: ");
        emp.name= input.next();
        System.out.println("Enter your Address: ");
        emp.address= input.next ();
        System.out.println("Enter your Phone Number: ");
        emp.phone = input.next();
        System.out.println("Enter your Salary: ");
        slr = input.nextFloat();
        System.out.println("Enter your Hours: ");
        hrs = input.nextFloat();
        
        emp.getDetails(0);
        ps.getInfo(slr, hrs);
        
        add = ps.addSalary(slr)+ ps.addWorks(hrs);
        System.out.println("Additional: $" + add);
        
        ttlnt = (((hrs/mnHr)* slr)+ add);
        
        System.out.println("Total net Salary: $" + ttlnt);
               
    }
     void getInfo(float slr, float hrs)
     {
         System.out.println("Your Salary: " +slr);
         System.out.println("Your Duty Hours: " +hrs);
     }
     float addSalary(float slr)  
     {
         float addSalary=0;
         
         if (slr < 300) addSalary +=10;
         return addSalary;
     }
     
     float addWorks (float hrs)
     {
         float addhr =0;
         if(hrs > 6) addhr +=10;
         return addhr;
     }
     class Employee {

    int employeeID;
    String name;
    String address;
    String phone;
      

    void getDetails(int i)
    {
        System.out.println("Payslip for " +name);
        System.out.println("Address: " +address);
        System.out.println("Contact:" +phone);
        System.out.println("Employee ID: " +employeeID);
    }

        
        }

      
        }

        
    

