import java.util.Scanner;

public class PaySlip
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float slr, hrs, add, tns = 0;
		float mh = 10;
		
		Employee emp = new Employee();
		PaySlip ps = new PaySlip();
			
                System.out.print("Enter your name: ");
		emp.name = input.nextLine();
		System.out.print("Enter employee ID: ");
		emp.employeeID = input.nextInt();
		input.nextLine();		
		
		System.out.print("Enter your address: ");
		emp.address = input.nextLine();	
		System.out.print("Enter your phone number: ");
		emp.phone = input.nextLine();
		
		System.out.print("Enter your salary: ");
	    slr = input.nextFloat();
		System.out.print("Enter number of hours: ");
	    hrs = input.nextFloat();
				
		emp.getDetails();
		ps.getInfo(slr, hrs);
		
	    add = ps.addSalary(slr) + ps.addWorks(hrs);
	   System.out.println("Additional: $" +add);
	   
	   
	   tns = (((hrs / mh) * slr) + add);
	   
	   System.out.println("Total net Salary: $"+tns);
						
	}
	void getInfo(float salary, float hours)
	{
	    System.out.println("Your Salary: " +salary);
	    System.out.println("Your duty hours: " +hours);
	    
	}
	float addSalary(float slry)
	{
	    float addSal = 0;
	    
	    if(slry < 300) addSal += 10;
	    return addSal;
	    	       
	}
	float addWorks(float hrs)
	{
	    float addHr = 0;
	    if(hrs > 6) addHr += 10;	    
	    return addHr;
	    
	}
		
}
class Employee
{
    int employeeID;
    String name, address, phone;
   
    void getDetails()
    {
        System.out.println("*********************");
        System.out.println();
        System.out.println("PaySlip for " +name);
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("Address: " +address);
        System.out.println("Contact: " +phone);
        System.out.println("Employee ID: " +employeeID);
        
        
                
    }
    
}
