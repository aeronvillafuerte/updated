//sweet
package prefi;
import java.util.*;
import java.util.InputMismatchException;

//Room class with attributes
class Room{
int roomno;
                protected int no;
                protected int floor;
                protected float rate;
               protected float balance;
               protected  int capacity;
               protected  String status;           
               protected  int num;
//Room class constructor
      Room(int numroom, int rfloor,float rrate,float rbalance,int rcap, String rstatus)
            {                
		this.no=numroom;
		this.floor=rfloor;
		this.rate=rrate;
		this.balance=rbalance;
                this.capacity=rcap;		
               this.status=rstatus;
                
}//end of this class Room....
	String getDetails(){
System.out.format("\n| %-6d | %-6d | %-10.2f | %-10.2f | %-10s | %-9s |\n" ,no,floor,rate,balance,capacity,status);
System.out.print("\n|--------------------------------------------------------------------|");
return "";  
	}
}//end of this class Room....


class RoomApp extends formatTable {
    private static Scanner sc=new Scanner(System.in);  
    private  static boolean error= false;             
    private static  int mcapacity=0,maxcap=0,capacity=0;
    private static int rate=0;
    private static float deposit=0;
    private static  int numroom=0,i=0;
     private static int num;
    private static String date;  
    private static int choice=0;
  
    public static void main(String[] args) {
        
	System.out.print("\n Welcome to payApp\n");
	                RoomApp ra= new RoomApp();
                        Room []rm=new Room[100];       
                        System.out.print("\n Enter Date: ");
                         date=sc.next();                
    do{
          error = false;
        try{
             System.out.print("\n Enter number of Rooms: ");
             numroom= sc.nextInt();
                     
        }catch(InputMismatchException e){
                System.out.print("\n--->Invalid input! please try again!!\n");    
             error = true;         
             sc.nextLine();
          }
    }while(error); 
           for (i=0; i<numroom;i++){
                   ra.formatLine();
             System.out.print("\n\n    ROOM "+(i+1)+" DETAILS: ");
                   ra.getRoomDetails(i,rm);
                            }
           
            
   do {  
    char question=0;
		  
	       ra.formatOptions();
            
		System.out.print("\nChoice: ");  
                while (!sc.hasNext("[0-9]+")) {                  
                System.out.print("\nInvalid! please input a number ONLY!!\n");     
                sc.next();
                 System.out.print("\nChoice: ");  
                }choice=sc.nextInt();
			
switch (choice){
	case 1:
                     System.out.print("\t\t\tB O O K E D  R O O M(s)"); 
                        ra.formatHeader();
			ra.BookedRoom(i,rm);
	break;
	case 2:
                     System.out.print("\t\t\tA V A I L A B L E  R O O M(s)"); 
                        ra.formatHeader();
                        ra.openRoom(i,rm);
	break;
	case 3:
                        System.out.print("\t\t\tU P D A T E  B O O K I N G"); 
                         ra.formatHeader();
                        ra.updateBooking(i,rm);
                        
        break;
        case 4:
                        ra.formatHeader();
                        ra.deleteRoom(i,rm);
        break;
        case 5:
                    
                        ra.viewSummary(i,rm);
        break;
        case 6:
                    System.out.print("\n\nThank you for availing our services, see you soon!!\n");
    		  
        break;
        
        default:
    		    System.out.print("\nInvalid input, please choose between Option 1 to 6!!\n"); 
				
}
                    System.out.print("\nMake another action(y/n): ");
                     question=sc.next().charAt(0);
                if(question=='y'||question=='Y'){
                     continue; 
                  }
                if(question=='n'||question=='N'){
                      System.out.print("\n\nThank you for using our services, see you soon!!\n");
                      break;
               }else if(question!='y'||question!='Y'||question=='n'||question=='N'){
                      System.out.print("\nInvalid input! Please input *(y or Y to continue!)*(n or N to end transaction)\n");
                }if (choice==choice) continue;
			  break;
                  
}while(true);
       System.out.print("\n End of payApp transaction...\n");
    }
                       
void getRoomDetails(int i,Room[] rm){	
                 RoomApp ra= new RoomApp();      
                int floor=0, no =0;
                float roombalance = 0;
                              
              ra.formatLinedivider();
      do{
          error = false;
         try{
             System.out.print("\n No.: ");                        
             no=sc.nextInt();            
        }catch(InputMismatchException e){
          System.out.print(" !!!!!!Invalid Input! please try again!!!!!!");  
              error = true;         
             sc.nextLine();
          }
     }while(error);                                     
             ra.formatLinedivider();                 
                          do{
          error = false;
          try{
            System.out.print("\n Floor No.: ");                             
           floor=sc.nextInt();    
          }catch(InputMismatchException e){
             System.out.print(" !!!!!!Invalid Input! please try again!!!!!!");  
                  error = true;         
             sc.nextLine();
          }
      }while(error);                                                              
          ra.formatLinedivider();                                   
                          do{
          error = false;
          try{
            System.out.print("\n Rate: ");                                 
           rate=sc.nextInt();  
          }catch(InputMismatchException e){
              System.out.print(" !!!!!!Invalid Input! please try again!!!!!!");    
                    error = true;         
             sc.nextLine();
          }
      }while(error);                                          
           ra.formatLinedivider();
                         do{
          error = false;
       try{
            System.out.print("\n Max Capacity: "); 
            maxcap = sc.nextInt();               
          }catch(InputMismatchException e){
               System.out.print(" !!!!!!Invalid Input! please try again!!!!!!");  
             error = true;         
                sc.nextLine();
          }
      }while(error);                               
            ra.formatLinedivider();  
             System.out.print("\n Status: ");
                String status=sc.next();            
                         while(!status.matches("Open+")&&!status.matches("Booked+")) {
            System.out.print(" !!!!!!Invalid Input! please try again!!!!!!");
            System.out.print("\n Status: "); 
                status=sc.next();     
}
            ra.formatLinedivider();
            System.out.print("\n\n");
                   rm[i]= new Room(no,floor,rate,roombalance,maxcap,status);         
}//end of get userInput Method.... 	
void BookedRoom(int i,Room[] rm){
  int c=0;
      RoomApp ra= new RoomApp();      
   	  	  		
   	  	for (i=0; i<numroom;i++){
                         if("Booked".equals(rm[i].status)||"booked".equals(rm[i].status)||"BOOKED".equals(rm[i].status   )){                       
                        
                         System.out.print(rm[i].getDetails());
                                            
   	  	  } 
                      }
            
   	  }
void openRoom(int i,Room[] rm){
         int count=0;
            
       for( i=0;i<numroom;i++)
        {  
          if("Open".equals(rm[i].status)||"OPEN".equals(rm[i].status)||"open".equals(rm[i].status   ))
          {
            rm[i].getDetails();   
          
           }            
         }  System.out.print("\n Note: 50% of room rate is required to do the booking");
         for( i=0;i<numroom;i++){
             if("Open".equals(rm[i].status)||"OPEN".equals(rm[i].status)||"open".equals(rm[i].status   ))
          {
                count++;
            }}
         
             if(count > 0){    
               
do{
      error = false;
    try{
               System.out.print("\n Select Room No.: ");
           num=sc.nextInt();             
        }catch(InputMismatchException e){
               System.out.print("\n --->Invalid input! please try again!!\n");     
             error = true;         
             sc.nextLine();
          }
   }while(error);                                                                
                     for(i=0; i<numroom; i++){                                                     if(rm[i].no==num){
                         if("Booked".equals(rm[i].status)||"booked".equals(rm[i].status)||"BOOKED".equals(rm[i].status)){
                                 System.out.print("\n Invalid Room No. ! "+num+" was already booked. Check for another Available Room.\n ");
                            }else{
      do{
          error = false;
          try{
             System.out.print("\n Number of People: ");
           mcapacity = sc.nextInt();
                       
          }catch(InputMismatchException e){
                  System.out.print("\n --->Invalid input! please try again!!\n");       
             error = true;         
             sc.nextLine();
          }
      }while(error);                       
                                         
                         while(mcapacity >rm[i].capacity){
                             System.out.print("\n Invalid. Max Capacity is "+rm[i].capacity);                                              
                  System.out.print("\n Number of People: ");         
                        mcapacity = sc.nextInt();              
                          }  
                        float reqPayment =(float)(rm[i].rate * .50);    
                  do{
          error = false;
          try{
            System.out.print("\n Enter Deposit: ");
           deposit = sc.nextFloat(); 
                   
          }catch(InputMismatchException e){
             System.out.print("\n--->Invalid input! please try again!!\n");       
             error = true;         
           sc.nextLine();
          }
      }while(error);                                                                                    
                           while( deposit < reqPayment){
                          System.out.print("\n Invalid Amount 50% of "+rm[i].rate+" is "+reqPayment+". Above is required");
            System.out.print("\n Enter Deposit: ");                        
            deposit = sc.nextFloat();                                                    
                             } float total =rm[i].rate-deposit ;
                             rm[i].balance= total;
                             rm[i].capacity= mcapacity;
                             rm[i].status = "Booked";                            
                     System.out.print("\n Room Booked!"); break;
        }
        }
       }
             }else{System.out.print("\n\n Sorry! All Rooms Are Already Booked!\n");  }              
       }//end of open room method.
void updateBooking(int i,Room[] rm){
  int cnt=0;
             RoomApp ra= new RoomApp();     
                                    
             for( i=0;i<numroom;i++)
                      {  
            if("Booked".matches(rm[i].status)||"booked".matches(rm[i].status)||"BOOKED".matches(rm[i].status)){
            	System.out.print("\n\n");
            	System.out.print(rm[i].getDetails());    
            } 
               }
             for( i=0;i<numroom;i++)
                      {  
            if("Booked".matches(rm[i].status)||"booked".matches(rm[i].status)||"BOOKED".matches(rm[i].status)){
                cnt++;
            }
            }
       if(cnt>0){
                      do{
          error = false;
          try{
            System.out.print("\n Select Room No. to Update: ");
           num=sc.nextInt();
                    
          }catch(InputMismatchException e){
             System.out.print("\n --->Invalid input! please try again!!\n");       
             error = true;         
             sc.nextLine();
          }
      }while(error);                       
                                                     
                       for(i=0; i<numroom; i++){ 
                         if(rm[i].no== num){  
                             if(rm[i].status.equals("Open")|| rm[i].status.equals("open")|| rm[i].status.equals("OPEN") ){
                             System.out.println("\t\t---->Error Room no. "+rm[i].no+ " was not in the List!");
                          }else{
                       do{
          error = false;
          try{
             System.out.print("\n Update Capacity: ");
           mcapacity = sc.nextInt();       
          }catch(InputMismatchException e){
              System.out.print("\n --->Invalid input! please try again!!\n");       
             error = true;         
             sc.nextLine();
          }
      }while(error);                 
                                 
                         while(mcapacity > rm[i].capacity){
                       System.out.print("\n Invalid. Max Capacity is "+rm[i].capacity);                                 
                           System.out.print("\n Update Capacity: ");            
                          mcapacity = sc.nextInt();                    
                          }
                        float reqPay =(float)(rm[i].rate * .50);   
                     do{
          error = false;
          try{
             System.out.print("\n Update Deposit: ");
              deposit = sc.nextFloat();                 
          }catch(InputMismatchException e){
             System.out.print("\n --->Invalid input! please try again!!\n");            
             error = true;         
             sc.nextLine();
          }
      }while(error);                                        
                         float total = rm[i].balance-deposit ;
                      rm[i].balance = total;
                      rm[i].capacity= mcapacity;
                      rm[i].status = "Booked";                           
                    System.out.print("\n Booking Updated!"); break;
        }
       }                            
 }
}else{System.out.print("\n\n  No Customers Booked Yet!\n");  } 
}

void deleteRoom(int i,Room[] rm){
        RoomApp ra= new RoomApp();     
        System.out.println("\n");
        System.out.println("\t\t\tD E L E T E   B O O K I N G");      
              ra.formatHeader();
             for( i=0;i<numroom;i++)
                      {  
            if("Booked".matches(rm[i].status)||"booked".matches(rm[i].status)||"BOOKED".matches(rm[i].status)){
              rm[i].getDetails();      
            	  
            }            
             }        
        do{
          error = false;
          try{
           System.out.print("\nSelect Room No. to Delete: ");
           num=sc.nextInt();      
          }catch(InputMismatchException e){
               System.out.print("\n --->Invalid input! please try again!!\n");
             error = true;         
             sc.nextLine();
          }
      }while(error);                                                                  
             for(i=0; i<numroom; i++)
                        {
                       if(rm[i].no== num){                                   
                           if(rm[i].status.equals("Open")|| rm[i].status.equals("open")|| rm[i].status.equals("OPEN") ){
                             System.out.println("\t\t---->Error Room no. "+num+ " was not in the List!");
                          }else{
                           
                            rm[i] = rm[i];
                       rm[i].status="Deleted";
 System.out.println("DELETED SUCCESSFULLY.");      
                        }
                             }else{/*print("\n\t\t\tINVALID INPUT\t"); */ }                            
                        }
}
void viewSummary(int i,Room[] rm){
    RoomApp ra= new RoomApp();    
      int ttlBooked= 0;
                 int open = 0;
                 int cap = 0;
                 
              System.out.println("\n");               
              System.out.println("\t\t\tS U M M A R Y  R E P O R T"); 
               ra.formatHeader();
                           
                            for(i=0; i<numroom; i++)
                        {
                             System.out.print(rm[i].getDetails());  
                             
                           if("Booked".equals(rm[i].status)||"booked".equals(rm[i].status)||"BOOKED".equals(rm[i].status)){
                                 ttlBooked++;
                           cap += rm[i].capacity;
                           }
                                if("Open".equals(rm[i].status)||"open".equals(rm[i].status)||"OPEN".equals(rm[i].status )){
                                       open++;
                                }
  
                            }      
                 System.out.println("\nNo. of Rooms: "+i);
                 System.out.println("Booked Rooms: "+ttlBooked);
                 System.out.println("Open Rooms: "+open);
                 System.out.println("Total Expected Guess: "+cap);
                        } 
                
}

//end of class Room App.......
 class formatTable {
 void formatOptions()
	{ 
            System.out.println("|--------------------------------------|");                
	    System.out.println("|            OPTIONS (TO - DO)         |");
	    System.out.println("|--------------------------------------|");
            System.out.println("|            1. View Booked Rooms      |");
            System.out.println("|            2. Book a Room            |");
            System.out.println("|            3. Update Booking         |");
            System.out.println("|            4. Delete Booking         |");
            System.out.println("|            5. View Summary           |");
            System.out.println("|            6. Clear and quit         |");
            System.out.println("|--------------------------------------|");
	}//END OF MY MENU......
    void formatHeader()
	{                        
            System.out.print("\n|--------------------------------------------------------------------|");
            System.out.print("\n|                                                                    |");
            System.out.print("\n|--------------------------------------------------------------------|");
           System.out.format("\n| %-6s | %-6s | %-10s | %-10s | %-10s | %-9s |\n"," No.","Floor","Rate","Balance","Capacity","Status");
            System.out.print("\n|--------------------------------------------------------------------|");
                               
            
   	}//END OF SUMMARY TABLE.....
     void formatLine()
	{   
            System.out.print("");
        }  
     void formatLinedivider()
	{   
            System.out.print("");
        }  
}