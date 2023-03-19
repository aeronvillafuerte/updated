package pharma1;

import java.util.Scanner;


public class Pharma1 {
    
    static void Summary(){
        
                System.out.println("***************************************************************");
                System.out.println("                        SUMMARY DETAILS                        ");
                System.out.println("***************************************************************");
                System.out.format("%-10s  %-10s   %-10s   %-10s   %-10s  \n" ," No.", " Code"," Name"," Stock(pcs)"," Price");
    }
            String cd;
            String nm;
            int stck;
            double prc;
            
    Pharma1(String phcd, String phnm, int phstck,double phprc){
            cd = phcd;
            nm = phnm;
            stck = phstck;
            prc = phprc;
    }
 

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        Pharma1 [] medicinelist = new Pharma1[100];
        
        
            int med = 0;
            int num=0;
            int chc;
            int updte;
            int ttl =0;
            double ttlprof =0;
            char qt;
            
                 System.out.print("Enter number of Medicine to add in the Stack:");
                 num = input.nextInt();
                
        
    for(med=0; med<num; med++)
    {
           input.nextLine();
                 System.out.println("\nMedicine "+(med+1)+" Details:");
                 
                 System.out.print("Code: ");
                    String code = input.nextLine();
                 
                 System.out.print("Name: ");
                    String name = input.nextLine();
                 
                System.out.print("Stocks(pcs): ");
                    int stock = input.nextInt();
                
                System.out.print("Price: ");
                    double price = input.nextDouble();
                
                System.out.println("\n");
            
            medicinelist[med] = new Pharma1(code,name,stock,price);
           
    }
    
                System.out.println("*****Successfully Inputted Medicine List!***** ");
             
     
    do
    {
                System.out.println("\nThings to do:");
                System.out.println("1. View Summary List");
                System.out.println("2. Add Medicine");
                System.out.println("3. Update Medicine");
                System.out.println("4. Remove Medicine");
                System.out.println("5. Clear and Quit");
                
                System.out.print("\n Choice: ");   
           
            chc = input.nextInt();
            
                ttl -= ttl;
                ttlprof -= ttlprof;
                
switch(chc)
{
    
 case 1:
                
                System.out.println("\t\t\t*****Summary*****\t\t\t");
                    
                    
    for(med=0; med<num; med++)
    {
                      
                System.out.format(" %-10s  %-10s   %-10s   %-10s    %-10s  \n" ,med+1, medicinelist[med].cd,medicinelist[med].nm,medicinelist[med].stck,medicinelist[med].prc);
                    
                    ttl += medicinelist[med].stck;
                    ttlprof += medicinelist[med].prc;
                    
    }                  
    
                System.out.println("                                                                  ");
                   
                    
                System.out.println("\nTotal Items in Stocks: "+ttl);
                System.out.println("Total Expected Profit: "+ttlprof);
                
                
        break;
                    
case 2:
                   
                System.out.println("\t\t\t*****Add Medicine*****\t\t\t");
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
                    medicinelist[num] = new Pharma1(ecode,ename,estock,eprice);
                    num +=1;
                    
                System.out.println("Medicine Added Successfully!"); 
                    
        break;
                    
case 3:
    
                System.out.println("\t\t\t*****Update Medicine*****\t\t\t");
                    input.nextLine();
                    
                System.out.println("Enter No. to Update: ");            
                    updte = input.nextInt();
                    int t = updte + 1;
                    
        
    for(med =0; med<num; med++)
    {
        
            if(med+1 == updte){
                
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
                       medicinelist[med] = new  Pharma1(ncode,nname,nstock,nprice);
                        
                System.out.println("Medicine Updated Successfully!"); 
    }
            
    else
    {
          
        
    }      
            
        } break;
                    
case 4:
                System.out.println("\t\t\t*****Delete Medicine*****\t\t\t");
                    input.nextLine();
                    
                System.out.println("Enter No. to Delete: ");
                    int delete = input.nextInt();
              
    for(med=0; med<num;med++)
    {
        if(med+1 == delete)
        {
                     medicinelist[med] =medicinelist[med+1];
                     medicinelist[med] =medicinelist[delete];
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
                     qt = input.next().charAt(0);
        if(qt == 'y')
        {
                System.out.println("Exiting..");
            
                     System.exit(0);break;
                
        }
        
        else
        {
                        
        }

}       
            
    }while(chc < 5);

    } 
    }
    


    
    




    

