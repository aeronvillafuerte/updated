
package projgrades;

import java.util.*;

class classAPP {
    protected String id;
    protected String Fname;
    protected String Lname;
    protected double Average;
    private String Status = "------";
    

    public classAPP (String id, String fname, String lname) {

        this.id = id;
        this.Fname = fname;
        this.Lname = lname;
  
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
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






public class Projgrades {
    
    void display(int c, classAPP[] gr) {
        
        

        System.out.println();
        String centerAlignFormat = "|%-7s |%-10s |%-10s |%-8s|%n";
        System.out.format("___________________________________________________%n");
        System.out.format("|                    STUDENT LIST                  |%n");
        System.out.format("___________________________________________________%n");
        System.out.format("|ID      |First Name |Last Name  |Average |Status  |%n");
        System.out.format("|________|___________|___________|________|________|%n");

        for (int i = 0; i < c ; i++) {

            gr[i].display();
        }
        System.out.format("|________|___________|___________|________|________|%n");

    }

  
    public static void main(String[] args) {
      classAPP[] in = new classAPP[100];
        Projgrades grade = new Projgrades();
        Scanner input = new Scanner(System.in);
        
       int i;
       int classAve = 0;
       String update, id;
       String remove;
       int num = 0;
       double ave1 = 0;
       int ave = 0,  total, g1, g2, g3, g4, g5;
        
        
        
        
        

        int n = 0;

        System.out.println("-----Welcome To Class App!!!-----");
        System.out.println();

        System.out.print("Enter number of Student: ");
        num = input.nextInt();

        for (i = 0; i < num; i++) {

            System.out.println("Student " + (i + 1) + " Details ");

            System.out.print("Enter ID: ");
            id = input.next();

            System.out.print("Enter First Name: ");
            String fname = input.next();

            System.out.print("Enter Last Name : ");
            String lname = input.next();

            System.out.println();
            in[i] = new classAPP(id, fname, lname);
            in[i].setId(id);
            in[i].setFname(fname);
            in[i].setLname(lname);

        }

        

        int choice ;
        String loop;

        do {
           
            grade.display(num, in);
             System.out.println();
            
             
            System.out.println("------------------------------------");
            System.out.println("|             Choices               |");
            System.out.println("|  1.View Student List              |");
            System.out.println("|  2. Add Student                   |");
            System.out.println("|  3. Update Student Details        |");
            System.out.println("|  4. Update Student Average        |");
            System.out.println("|  5. Remove Student                |");
            System.out.println("|  6. View Class Average            |");
            System.out.println("|  7. Clear and Quit                |");
            System.out.println("-------------------------------------");
            System.out.println("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    grade.display(num, in);

                    break;

                case 2:
                  

                    System.out.println("Enter student details to add: ");
                   System.out.print("Enter ID: ");
                    id = input.next();

                    for (i = 0; i < num; i++) {

             while(in[i].getId().equals(id)){
                                 
                 System.out.println("ID already exsit!!!");
                 System.out.println("Enter Id Again: ");
                 id = input.next();
             
            }
                    }
            
                            System.out.print("Enter First Name: ");
                            String lname = input.next();

                            System.out.print("Enter Last Name : ");
                            String fname = input.next();

                            System.out.println();
                            in[num] = new classAPP(id, fname, lname);
                            


                            num += 1;

                        
                    

            
            grade.display(num, in);

            break;

          case 3:

                    System.out.println("CHANGE STUDENT DETAILS.");
                    System.out.print("Enter the ID of student: ");
                    id = input.next();

                    for (int x = 0; x < num; x++) {

                        if (in[x].getId().equals(id)) {
                             System.out.println("__________________________________________________");
                            System.out.println("Selected Student: " + in[x].getFname() + " " + in[x].getLname());
                             System.out.println("__________________________________________________");
                                System.out.print("Enter First Name: ");
                            fname = input.next();

                            System.out.print("Enter Last Name : ");
                            lname = input.next();

                            System.out.print("Enter Average:");
                            int avg = input.nextInt();

                            System.out.println();
                            in[x] = new classAPP(in[x].getId(), fname, lname);
                            in[x].setAverage(avg);
                            in[x].setFname(fname);
                            in[x].setLname(lname);

                            if (avg >= 75) {
                                in[x].setStatus("Passed");

                            } else {
                                in[x].setStatus("failed");
                            }
                          
                        }

                    }
                    grade.display(num, in);
                    break;

                case 4:



                    System.out.println("Update Student Average: ");
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
                                        in[i].Average = ave;
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

                    grade.display(num, in);
                    break;

                case 5:
     
                System.out.println("REMOVE STUDENT");
                System.out.print("Enter ID to remove: ");
                id = input.next();
                    
                    System.out.println("");  
                    for (i = 0; i < num; i++) {
                        
                        if (in[i].getId().equals(id)) {
                            while (!id.matches(in[i].id))
                            {
                                System.out.println("Invalid input !");
                                System.out.print("Enter ID: ");
                                id = input.next();
                            }
                        System.out.println("Selected Student: " +in[i].Fname + " " +in[i].Lname);  
                                                  
                        } 
                          

                    }
                 
                    
                    System.out.println("SUCCESS!");
                    break;

                case 6:
                    System.out.println("CLASS AVERAGE REPORT");
                    grade.display(num,in);
                    
                                    for (int x = 0; x < num; x++) {
                                    classAve += in[i].getAverage();
                                    ave1 = classAve/num;
                    }
                    System.out.println("__________________________________");
                    System.out.println("Total Students: " + num);
                    System.out.println("__________________________________");
                    System.out.println("Total Students: " +ave1);
                    

                    
                break; 
                case 7: 
                                System.out.println("Thank you for using the app!");

                                    

                                    break;
            }
                System.out.println();   
                System.out.println("Make another action? Y/N: ");
                loop = input.next();
     }while(loop.equalsIgnoreCase("Y"));

    }
    }


    
    


