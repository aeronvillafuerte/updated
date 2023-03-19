package pharmacy3;

import java.util.*;
public class Pharmacy3 {

   
    public static void main(String[] args) {
        
        
        
        
            int i, tstock = 0, update = 0, delete = 0;
            int[]medstock = new int[99];
                double tprice = 0;
                double[]medprice = new double[50];
                double[]medpricestock = new double[50];
                    String[]medcode = new String[50];
                    String[]medname = new String[50];
            
        
            
            
            
            
        Scanner input = new Scanner(System.in);
        
                    System.out.println("Enter number of medicines to add in stocks: ");
                        int stock_add = input.nextInt();
        
                        for(i = 0; i < stock_add; i++){
            
                                        System.out.println("\nMedicine " +(i+1) +" Details:");
                                        medcode[i] = input.nextLine();

                                        System.out.println("Code: ");
                                        medcode[i] = input.nextLine();

                                        System.out.println("Name: ");
                                        medname[i] = input.nextLine();

                                        System.out.println("Stocks(pcs): ");
                                        medstock[i] = input.nextInt();

                                        System.out.println("Price: ");
                                        medprice[i] = input.nextDouble();

                                        tstock += medstock[i];
                                        medpricestock[i] = medstock[i] * medprice[i];
                                        tprice += medpricestock[i];
            
        }
                        
                        
                        
                        
                        
                        
                        
                        
        
        System.out.println("\nSuccessfully Inputted Medicine List!\n");
    
        int loop = 1;
        
                do{

                    System.out.println("Things to do: \n1. View Summary List\n2. Add Medicine\n3. Update Medicine\n4. Remove Medicine\n5. Clear and Quit\n\nChoice: ");
                    int choice = input.nextInt();

                    switch(choice){

                        case 1:

                            System.out.println("\nSummary Details");
                            System.out.println("_______________________________________________________________________________________");
                             System.out.print("\n"+ "No."+ "\t"+ "Code"+ "\t\t"+ " Name"+ "\t\t"+ "Stocks(pcs)"+ "\t"+ "Price"+"\n");
                             for(i=0;i<stock_add;i++)
                             {
                                String leftAlignformat = "%-7d %-16s %-14s %-15s %.2f \n";
                                {
                                    System.out.format(leftAlignformat, i+1, medcode[i], medname[i], medstock[i], medprice[i]);
                                }
                             }

                            System.out.println("_______________________________________________________________________________________");
                            System.out.println("");
                            System.out.println("\n\nTotal Items in Stocks: "+tstock);

                            String leftAlignformat= "%-1s %.2f\n %-1s";
                                {
                                    System.out.format(leftAlignformat, "Total Expected Profit: ", tprice, "\n");
                                }


                            break;

                case 2: 

                                        stock_add += 1;
                                        i = stock_add - 1;

                                        System.out.println("\nMedicine " +(i+1) +" Details:");
                                        medcode[i] = input.nextLine();

                                        System.out.println("Code: ");
                                        medcode[i] = input.nextLine();

                                        System.out.println("Name: ");
                                        medname[i] = input.nextLine();

                                        System.out.println("Stocks(pcs): ");
                                        medstock[i] = input.nextInt();

                                        System.out.println("Price: ");
                                        medprice[i] = input.nextDouble();

                                        tstock += medstock[i];
                                        medpricestock[i] = medstock[i] * medprice[i];
                                        tprice += medpricestock[i];

                                        System.out.println("\nNo. Added!\n");

                    break;
                    
                case 3: 
                    
                    do{
                        
                        System.out.println("\nChoose a No. to update: ");
                        update = input.nextInt();
                        
                    }while(update > stock_add || update <= 0); 
                    
                    i = update - 1;
                    
                                tstock = tstock - medstock[i];
                                tprice = tprice - medpricestock[i];
                                medstock[i] = 0;
                                medprice[i] = 0;

                                System.out.println("\nMedicine " +(i+1) +" Details:");
                                medcode[i] = input.nextLine();

                                System.out.println("Code: ");
                                medcode[i] = input.nextLine();

                                System.out.println("Name: ");
                                medname[i] = input.nextLine();

                                medstock[i] = 0;
                                medprice[i] = 0;

                                System.out.println("Stocks(pcs): ");
                                medstock[i] = input.nextInt();

                                System.out.println("Price: ");
                                medprice[i] = input.nextDouble();

                                tstock += medstock[i];
                                medpricestock[i] = medstock[i] * medprice[i];
                                tprice += medpricestock[i];
                    
                    System.out.println("\nNo. Updated!\n");
                    
                    break;
                    
                    
                case 4:
                    
                    do{
                        
                        System.out.println("\nChoose a No. to Remove: ");
                        delete = input.nextInt();
                        
                    }while(delete > stock_add || delete <= 0);
                    
                    int x = delete - 1;
                    
                    tstock = tstock - medstock[x];
                    tprice = tprice - medpricestock[x];
                    medstock[i] = 0;
                    medprice[i] = 0;
                    
                                    for(i = delete-1; i < medcode.length-1 && i < medname.length-1 &&i < medstock.length-1 && i < medprice.length-1; i++){
                                        medcode[i] = medcode[i + 1];
                                        medname[i] = medname[i + 1];
                                        medstock[i] = medstock[i + 1];
                                        medprice[i] = medprice[i + 1];
                                    }
                    
                    stock_add -= 1;
                    
                    System.out.println("\nNo. Removed!\n");
                    
                    break;

                                case 5:

                                    System.out.println("\nDone!\n");

                                    loop = 0;

                                    break;

            }
            
                            }while(loop != 0);
           
    
        
        
        
        
        
        
        

    }
    
}


