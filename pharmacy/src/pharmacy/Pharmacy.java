
package pharmacy;

import java.util.Scanner;


public class Pharmacy {
    
    String code;
            String name;
            int stock;
            double price;
    Pharmacy(String phcode, String phname, int phstock,double phprice){
        code = phcode;
            name = phname;
            stock = phstock;
            price = phprice;
    }
 static void Table(){    
                System.out.println("                                                               ");
                System.out.println("                        SUMMARY DETAILS                        ");
                System.out.println("                                                               ");
                System.out.format("%-10s  %-10s   %-10s   %-10s   %-10s  \n" ," No.", " Code"," Name"," Stock(pcs)"," Price");
    }
    
    

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        Pharmacy[] medlist = new Pharmacy[100];
        
        
            int m = 0;
            int num=0;
            double ttlprof =0;
            int ch;
            int updt;
            int ttlStocks =0;
            char quit;
            
                 System.out.print("Enter number of Medicine: ");
                 num = input.nextInt();
                 System.out.println("\n");
        
    for(m=0; m<num; m++)
    {
           input.nextLine();
                 System.out.println("Medicine "+(m+1)+" Details:");
                 
                 System.out.print("Enter Code: ");
                    String ecode = input.nextLine();
                 
                 System.out.print("Enter Name: ");
                    String ename = input.nextLine();
                 
                System.out.print("Enter Stocks(pcs): ");
                    int mstock = input.nextInt();
                
                System.out.print("Enter Price: ");
                    double mprice = input.nextDouble();
                
                System.out.println("\n");
            
            medlist[m] = new Pharmacy(ecode,ename,mstock,mprice);
           
    }
    
                System.out.println("Successfully Inputted Medicine List! ");
             
     
    do
    {
                System.out.println("\nThings to do:");
                System.out.println("1. View Summary List\n2. Add Medicine\n3. Update Medicine\n4. Remove Medicine\n5. Clear and Quit");
                System.out.print("Enter Choice: ");   
           
            ch = input.nextInt();
            
                ttlStocks -= ttlStocks;
                ttlprof -= ttlprof;
                
switch(ch)
{
    
 case 1:
                
                System.out.println("\n");
                    Table(); 
                    
    for(m=0; m<num; m++)
    {
                      
                System.out.format(" %-10s  %-10s   %-10s   %-10s    %-10s  \n" ,m+1, medlist[m].code,medlist[m].name,medlist[m].stock,medlist[m].price);
                    
                    ttlStocks += medlist[m].stock;
                    ttlprof += medlist[m].price;
                    
    }                  
    
                System.out.println("                                                                  ");
                    double tProfit = ttlprof * ttlStocks;
                    
                System.out.println("\nTotal Items in Stocks: "+ttlStocks);
                
                System.out.println("Total profit: "+ttlprof);
                
                System.out.println("Total Expected Profit = "+tProfit); 
                
        break;
                    
case 2:
                   
                System.out.println("\t\t\tAdd Medicine");
                    input.nextLine();
                    
                System.out.print("Enter Code: ");
                    String ecode = input.nextLine();
                    
                System.out.print("Enter Name: ");
                    String ename = input.nextLine();
                    
                System.out.print("Enter Stocks(pcs): ");
                    int estock = input.nextInt();
                    
                System.out.print("Enter Price: ");
                    double eprice = input.nextDouble();
                    
                System.out.println("\n");
                    medlist[num] = new Pharmacy(ecode,ename,estock,eprice);
                    num +=1;
                    
                System.out.println("Medicine Added Successfully!"); 
                    
        break;
                    
case 3:
    
                System.out.println("\t\t\tUpdate Medicine");
                    input.nextLine();
                    
                System.out.println("Enter No. to Update: ");            
                    updt = input.nextInt();
                    int t = updt + 1;
                    
        
    for(m =0; m<num; m++)
    {
        
            if(m+1 == updt){
                
                input.nextLine();
                    
                System.out.print("Enter New Code: ");
                        String ncode = input.nextLine();
                        
                System.out.print("Enter New Name: ");
                        String nname = input.nextLine();
                        
                System.out.print("Enter New Stocks(pcs): ");
                        int nstock = input.nextInt();
                        
                System.out.print("Enter New Price: ");
                        double nprice = input.nextDouble();
                        
                System.out.println("\n");
                        medlist[m] = new Pharmacy(ncode,nname,nstock,nprice);
                        
                System.out.println("Medicine Updated Successfully!"); 
    }
            
    else
    {
          
        
    }      
            
        } break;
                    
case 4:
                System.out.println("\t\t\tDelete Medicine");
                    input.nextLine();
                    
                System.out.println("Enter No. to Delete: ");
                    int delete = input.nextInt();
              
    for(m =0; m<num;m++)
    {
        if(m+1 == delete)
        {
                     medlist[m] = medlist[m+1];
                     medlist[m] = medlist[delete];
                     num -=1;
                System.out.println("Medicine Removed Successfully!"); 
                
        }
        
        else
        {
              
        }         
        
    }
        break;
case 5:
                System.out.print("Do you want to Exit? [Y/N]: ");
                     quit = input.next().charAt(0);
        if(quit == 'y')
        {
                System.out.println("Exiting..");
            
                     System.exit(0);break;
                
        }
        
        else
        {
                        
        }

}       
            
    }while(ch < 5);

      
    }
    
}

    
    

