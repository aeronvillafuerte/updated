
package grades2;

import java.util.*;

class classAPP {
    private String id;
    private String Fname;
    private String Lname;
    private double Average;
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






public class Grades2 {
    
    void display(int i, classAPP[] gr) {

        System.out.println();
        String centerAlignFormat = "|%-7s |%-10s |%-10s |%-8s|%n";
        System.out.format("___________________________________________________%n");
        System.out.format("| STUDENT LIST                                     |%n");
        System.out.format("---------------------------------------------------%n");
        System.out.format("|ID      |First Name |Last Name  |Average |Status  |%n");
        System.out.format("|________|___________|___________|________|________|%n");

        for (int x = 0; x < i; x++) {

            gr[x].display();
        }
        System.out.format("|________|___________|___________|________|________|%n");

    }

  
    public static void main(String[] args) {
      classAPP[] cap = new classAPP[100];
        Grades2 grd2 = new Grades2();
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("-----Welcome To classApp!!!-----");
        System.out.println();

        System.out.print("Enter number of Student: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Student " + (i + 1) + " Details ");

            System.out.print("Enter ID: ");
            String id = sc.next();

            System.out.print("Enter First Name: ");
            String fname = sc.next();

            System.out.print("Enter Last Name : ");
            String lname = sc.next();

            System.out.println();
            cap[i] = new classAPP(id, fname, lname);
            cap[i].setId(id);
            cap[i].setFname(fname);
            cap[i].setLname(lname);

        }

        

        int choice ;
        char ans;

        do {
           
            grd2.display(num, cap);
             System.out.println();
            
             
            System.out.println("------------------------------------");
            System.out.println("|             OPTION                |");
            System.out.println("------------------------------------");
            System.out.println("|  1.View Student List              |");
            System.out.println("|  2. Add Student                   |");
            System.out.println("|  3. Update Student Details        |");
            System.out.println("|  4. Update Student Average        |");
            System.out.println("|  5. Remove Student                |");
            System.out.println("|  6. View Class Average            |");
            System.out.println("|  7. Clear and Quit                |");
            System.out.println("-------------------------------------");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    grd2.display(num, cap);

                    break;

                case 2:
                    String id,
                     fname,
                     lname;
                    
                    System.out.println("                                  ");
                    System.out.println("ADD STUDENT");
                    System.out.println("                               ");
                    System.out.println("Enter student details to add: ");
                    System.out.print("Enter ID: ");
                    id = sc.next();

                    for (int i = 0; i < num; i++) {

             while(cap[i].getId().equals(id)){
                                 
                 System.out.println("ID already exsit!!!");
                 System.out.println("Enter Id Again: ");
                 id = sc.next();
             
            }
                    }
            
                            System.out.print("Enter First Name: ");
                            fname = sc.next();

                            System.out.print("Enter Last Name : ");
                            lname = sc.next();

                            System.out.println();
                            cap[num] = new classAPP(id, fname, lname);
                            
                            cap[num].setFname(fname);
                            cap[num].setLname(lname);

                            num += 1;

                        
                    

            
            grd2.display(num, cap);

            break;

          case 3:
                    System.out.println("                                       ");
                    System.out.println("CHANGE STUDENT DETAILS.");
                    System.out.println("                       ");
                    System.out.print("Enter the ID of student: ");
                    String no = sc.next();

                    for (int x = 0; x < num; x++) {

                        if (cap[x].getId().equals(no)) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Selected Student: " + cap[x].getFname() + " " + cap[x].getLname());
                            System.out.println("------------------------------------------------");
                            System.out.print("Enter First Name: ");
                            fname = sc.next();

                            System.out.print("Enter Last Name : ");
                            lname = sc.next();

                            System.out.print("Enter Average:");
                            int avg = sc.nextInt();

                            System.out.println();
                            cap[x] = new classAPP(cap[x].getId(), fname, lname);
                            cap[x].setAverage(avg);
                            cap[x].setFname(fname);
                            cap[x].setLname(lname);

                            if (avg >= 75) {
                                cap[x].setStatus("Passed");

                            } else {
                                cap[x].setStatus("failed");
                            }
                          
                        }

                    }
                    grd2.display(num, cap);
                    break;

                case 4:

                    double totalavg ;
                    int math ,science , programming, english, phych;

                    System.out.println("                         ");
                    System.out.println("UPDATE STUDENT AVERAGE ");
                    System.out.println("                        ");
                    System.out.print("Enter student ID: ");
                    no = sc.next();
                    for (int x = 0; x < num; x++) {
                        int d = 0;
                        if (cap[x].getId().equals(no)) {
                            System.out.println("                                                ");
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");  
                            System.out.println("Selected Student:" + cap[x].getFname() + " " + cap[x].getLname());
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");  
                            System.out.println("                                                ");
                            System.out.println("Enter grades on the ff.");

                            System.out.print("Math: ");
                            math = sc.nextInt();

                            System.out.print("Science: ");
                            science = sc.nextInt();
                            
                            System.out.print("Programming: ");
                            programming = sc.nextInt();
                            System.out.print("English: ");
                            english = sc.nextInt();
                            
                            System.out.print("Phych: ");
                            phych = sc.nextInt();

                            totalavg = (math + science + programming + english + phych) / 5;

                            cap[x].setAverage(totalavg);
                            System.out.println("------------------------------------------------");  
                            System.out.println("Total Average:" + totalavg);
                            
                            if (totalavg >= 75) {
                                System.out.println("Status: Passed");
                                cap[x].setStatus("Passed");
                             
                            } else {
                                System.out.println("Status: Failed");
                                cap[x].setStatus("Failed");
                            
                            }
                            System.out.println("------------------------------------------------");
                            System.out.println();

                        }
                       
                    }

                    grd2.display(num, cap);
                    break;

                case 5:
                System.out.println("                                    ");
                System.out.println("REMOVE STUDENT");
                System.out.println("                                   ");
                System.out.print("Enter ID to remove: ");
                    String del = sc.next();
                    
                System.out.println("------------------------------------------------");  
                    for (int i = 0; i < num; i++) {
                        
                        if (cap[i].getId().equals(del)) {
                          
                            System.out.println("Selected Student:" + cap[i].getFname() + " " + cap[i].getLname());
                            System.out.println();
                            cap[i].setStatus("------");
                            cap[i].setAverage(0.0);
                            cap[i].setFname("------");
                            cap[i].setLname("------");
                      
                        } 
                          

                    }
                 
                    System.out.println("------------------------------------------------");   
                    System.out.println("SUCCESS!");
                    break;

                case 6:
                    double total = 0,
                     stavg = 0;
                    System.out.println("                                                      ");
                    System.out.println("CLASS AVERAGE REPORT");
                    System.out.println("                                        ");
                    grd2.display(num, cap);
                    System.out.println("---------------------------------------------------");
                    System.out.println("Number of Students: " + num);
                    for (int x = 0; x < num; x++) {
                        stavg += cap[x].getAverage();
                        total = stavg*2/num;
                    }
                     
                    System.out.println("Class Average: " +total);
                     System.out.println("---------------------------------------------------");
                    
                break;   
                
                case 7:
                    System.out.println("                            ");
                    System.out.println("THANK YOU FOR USING THE APP!");
                    
                    
                          
               
                    
            }
            System.out.println();   
            System.out.println("Make another action?: ");
             ans = sc.next().charAt(0);
     }
            while (ans == 'y' || ans == 'Y');
            System.out.println("SEE YOU SOONEST! ^_^ "); 
        }


    }




    
    

