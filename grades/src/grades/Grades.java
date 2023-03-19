	package grades;


import java.util.*;

class classGrades {
 
    private String id;
    private String fname;
    private String lname;
    private double average;
    private String Status = "----";
 
    public classGrades(String id, String fname, String lname){
        this.id = id;
        this.fname = fname;
        this.fname = lname;

}
    
    
    

   

    public  String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getAverage() {
        return average;
    }
    

    public void setId(String id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAverage(double average) {
        this.average = average;
    } 

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
      void display() {

        System.out.format("|%-7s |%-10s |%-10s |%-8s|%-8s|%n", getId(), getFname(), getLname(), getAverage(), getStatus());

    }      

    
    
    
}

   public class Grades{
           void display(int i, classGrades[] gr) {

        System.out.println();
        String centerAlignFormat = "|%-7s |%-10s |%-10s |%-8s|%n";
        System.out.format("___________________________________________________%n");
        System.out.format("| STUDENT LIST                                     |%n");
        System.out.format("---------------------------------------------------%n");
        System.out.format("|ID      |First Name |Last Name  |Average |Status  |%n");
        System.out.format("|______________________________________________|%n");

        for (int x = 0; x < i; x++) {

            in[i].display();
        }
        System.out.format("______________________________________________%n");

    }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       classGrades[] in = new classGrades [100];       
       Grades grade = new  Grades();
       
      
       
       
       int i = 0;
       int classAve = 0;
       String update, id;
       String remove;
       int num = 0;
       double ave1 = 0;
       int ave = 0,  total, g1, g2, g3, g4, g5;
       
      
       System.out.println("------WELCOME TO classAPP------");
        System.out.println("Add number of Student:");
            num = input.nextInt();

       for (i=0; i<num; i++){
           input.nextLine();
          
           System.out.println("Student "+(i+1)+" Details:");
           System.out.print("ID:");
           in[i] = new Student();
           in[i].setId(input.next());
          
           System.out.println("Fname:");
           in[i].setFname(input.next());
           
           System.out.println("Lname:");
           in[i].setLname(input.next());
           
           
           
       }
       
       
      
        
        String loop;
        
                do{
                    grade.display(num, in);
                    
                      
        
                    System.out.println("Option: \n1. View Student List\n2. Add Student\n3. Update Student Details\n4. Update Student Average\n5. Remove Student\n6. View Class Student\n7. Clear & Quit: ");
                    System.out.println("Enter Choice: ");
                    int choice = input.nextInt();
   
  
                    switch(choice){
                    
                        
                        
                        case 1:
                             
                                grade.display(num, in);
         
                            break;
                            
                            
                            
                        case 2:
           
                            
                            System.out.println("Student Details:");
                            
                             
                                
                                
           System.out.print("Enter ID:");
           in[i] = new Student();
           id = input.next();
           
           for (i = 0; i < num; i++){
           
           while(in[i].id.equals(in[i].id)){
        
               
               System.out.println("ID already Exist");
               System.out.println("Enter ID again!: ");
               id = input.next();
               
                   
           }

           }         
               
               
          
            System.out.println("First name:");
            in[i].setFname(input.next());
           
           System.out.println("Last name:");
            in[i].setLname(input.next());
            
            in[num] = new classGrades(id, lname, fname);
            
                            in[num].setFname(fname);
                            in[num].setLname(lname);
                 
               
           
           break;
                        case 3:
                            
                            System.out.println("Update Student Details ");
                            System.out.print("Enter student ID: ");
                            update = input.next();
                            
                            
                            for( i = 0; i < num; i++){
                             //   while(!update.equals(cap[x].id) ){
                               //    System.out.println("Invalid ID !");
                                 //System.out.println("Enter ID again: ");
                                  //String id = input.next();
                                
                            //   }
                                
                                if(update.equals(in[i].id)) {
                          
                                
                               
                               
                        System.out.println("Selected Student: " +in[i].getFname()+ " " +in[i].getLname());
                       
                        System.out.println("Enter ID");
                        in[i].setId(input.next());
                        System.out.print("Enter First Name: ");
                        in[i].setFname(input.next());
                        System.out.print("Enter Last Name: ");
                        in[i].setLname(input.next());
                        System.out.println("ENter Average: ");
                        in[i].setAverage(input.nextDouble());
                        
                        
                        
                                }
                        
                                
                            }
                        
                        
                       System.out.println("UPDATE SUCCESSFULLY !");
                                
                             
                             
                             
                              for (i = 0; i < num; i++){
                         in[i].getId();
                              }
      
                            break;
                            case 4:
                            
                            System.out.println("Update Student Average ");
                            System.out.print("Enter student ID: ");
                            update = input.next();
                            
                            
                            for( i = 0; i < num; i++){
                                //while(!update.equals(cap[x].id) ){
                               //    System.out.println("Invalid ID !");
                               //  System.out.println("Enter ID again: ");
                                 // String id = input.next();
                                
                              // }
                                
                                if(update.equals(in[i].id)) {
                          
                                
                               
                               
                        System.out.println("Selected Student: " +in[i].getFname()+ " " +in[i].getLname());
                       
                                    System.out.println("Enter Grades on the ff:");
                                    
                                    System.out.println("Math: ");
                                    g1 = input.nextInt();
                                    System.out.println("Science: ");
                                    g2 = input.nextInt();
                                    System.out.println("Programming: ");
                                    g3 = input.nextInt();
                                    System.out.println("English: ");
                                    g4 = input.nextInt();
                                    System.out.println("Psych: ");
                                    g5 = input.nextInt();
                                    
                                        total = g1 + g2 + g3 + g4 + g5;
                                        ave = total / 5;
                                        in[i].average = ave;
                                       // cap[x].Status
                                        
                                       if(74 > ave){
                                            System.out.println("Total average: "+ave);
                                            System.out.println("Status: Failed");
                                           if (74 > ave){
                                               in[i].setStatus("Failed");
                                           } 
                                       }else if(75 < ave){
                                            System.out.println("Total average: "+ave);
                                            System.out.println("Status: Passed");
                                            if(75 < ave ){
                                                in[i].setStatus("Passsed");
                                            }
                                            
                                        }
                                        
                        
                                }
                        
                                
                            }
                        
                        
                       System.out.println("UPDATE SUCCESSFULLY !");
                                
                             
                             
                             
                              for (i = 0; i < num; i++){
                         in[i].getId();
                              }
      
                            break;
                            case 5:
                            
                            System.out.println("Remove Student ");
                            System.out.print("Enter student ID: ");
                            remove = input.next();
                            
                            
                            for( i = 0; i < num; i++){
                             //   while(!update.equals(cap[x].id) ){
                               //    System.out.println("Invalid ID !");
                                 //System.out.println("Enter ID again: ");
                                  //String id = input.next();
                                
                            //   }
                                
                                if(remove.equals(in[i].id)) {
                          
                   
                                }else{
                       
                   }
                       
                   
                        num -= 1;
                                
                            }
                         
                        
                        
                       System.out.println("REMOVED SUCCESSFULLY!");
                               
                             
                             
                             
                              for (i = 0; i < num; i++){
                         in[i].getId();
                              }
      
                            break;
                            case 6: 
                                System.out.println("CLASS AVERAGE REPORT");
                                System.out.println("    ID  |   First Name |   Last Name    |   Average |   Status");
   
            
         for(i =0; i < num; i++){
            System.out.println("   "+in[i].getId()+"  |         "+in[i].getFname()+"   |        "+in[i].getLname()+"   |   "+in[i].getAverage()+" |   "+in[i].getStatus());
            classAve += in[i].average;
             ave1 = classAve / num;
         }            
         
         
                                System.out.println("Total number of Students: "+num);
                                System.out.println("Class average: "+ave1);
                              //  ave1 = cap[x].average / num;
                                
                                
                                
                                
                                
                                break;
                                
                            
                                
                                
                                case 7: 
                                System.out.println("Thank you for using the app!");

                                    

                                    break;
                            
                            
   
                    }
                    
                    
                
                    System.out.println("Make another action y/n: ");
                    loop = input.next();
                    }while(loop.equalsIgnoreCase("Y"));
   }
   }