
package gradesapp;
                                            //Edgardo Siton Jr.
import java.util.*;
class classAPP {
    private String id;
    private String firstname;
    private String lastname;
    private double Average;
    private String Status = "------";
    

    public classAPP (String id, String cfname, String clname) {

        this.id = id;
        this.firstname = cfname;
        this.lastname = clname;
  
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return firstname;
    }

    public void setFname(String Fname) {
        this.firstname = Fname;
    }

    public String getLname() {
        return lastname;
    }

    public void setLname(String Lname) {
        this.lastname = Lname;
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

public class Gradesapp {
   void display(int i, classAPP[] grade) {

        System.out.println();
        String centerAlignFormat = "|%-7s |%-10s |%-10s |%-8s|%n";
        System.out.format("___________________________________________________%n");
        System.out.format("| STUDENT LIST                                     |%n");
        System.out.format("---------------------------------------------------%n");
        System.out.format("|ID      |First Name |Last Name  |Average |Status  |%n");
        System.out.format("|________|___________|___________|________|________|%n");

        for (int x = 0; x < i; x++) {

            grade[x].display();
        }
        System.out.format("|________|___________|___________|________|________|%n");

    }
   
    public static void main(String[] args) {
             classAPP[] clap = new classAPP[100];
       Gradesapp grapp = new Gradesapp();
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("-----Welcome To classApp!!!-----");
        System.out.println();

        System.out.print("Enter number of Student: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Student " + (i + 1) + " Details ");

            System.out.print("Enter ID: ");
            String studid = sc.next();

            System.out.print("Enter First Name: ");
            String studfname = sc.next();

            System.out.print("Enter Last Name : ");
            String studlname = sc.next();

            System.out.println();
            clap[i] = new classAPP(studid, studfname, studlname);
            clap[i].setId(studid);
            clap[i].setFname(studfname);
            clap[i].setLname(studlname);

        }

        

        int ch ;
        char ans;

        do {
           
            grapp.display(num, clap);
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
            ch = sc.nextInt();

            switch (ch) {

                case 1:

                    grapp.display(num, clap);

                    break;

                case 2:
                    String studid,
                     studfname,
                     studlname;
                    
                    System.out.println("                                  ");
                    System.out.println("ADD STUDENT");
                    System.out.println("                               ");
                    System.out.println("Enter student details to add: ");
                    System.out.print("Enter ID: ");
                    studid = sc.next();

                    for (int i = 0; i < num; i++) {

             while(clap[i].getId().equals(studid)){
                                 
                 System.out.println("ID already exsit!!!");
                 System.out.println("Enter Id Again: ");
                 studid = sc.next();
             
            }
                    }
            
                            System.out.print("Enter First Name: ");
                            studfname = sc.next();

                            System.out.print("Enter Last Name : ");
                            studlname = sc.next();

                            System.out.println();
                            clap[num] = new classAPP(studid, studfname, studlname);
                            
                            clap[num].setFname(studfname);
                            clap[num].setLname(studlname);

                            num += 1;

                        
                    

            
            grapp.display(num, clap);

            break;

          case 3:
                    System.out.println("                                       ");
                    System.out.println("CHANGE STUDENT DETAILS.");
                    System.out.println("                       ");
                    System.out.print("Enter the ID of student: ");
                    String student = sc.next();

                    for (int x = 0; x < num; x++) {

                        if (clap[x].getId().equals(student)) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Selected Student: " + clap[x].getFname() + " " + clap[x].getLname());
                            System.out.println("------------------------------------------------");
                            System.out.print("Enter First Name: ");
                            studfname = sc.next();

                            System.out.print("Enter Last Name : ");
                            studlname = sc.next();

                            System.out.print("Enter Average:");
                            int avg = sc.nextInt();

                            System.out.println();
                            clap[x] = new classAPP(clap[x].getId(), studfname, studlname);
                            clap[x].setAverage(avg);
                            clap[x].setFname(studfname);
                            clap[x].setLname(studlname);

                            if (avg >= 75) {
                                clap[x].setStatus("Passed");

                            } else {
                                clap[x].setStatus("Failed!");
                            }
                          
                        }

                    }
                    grapp.display(num, clap);
                    break;

                case 4:

                    double ttlavg ;
                    int math ,scie , prog, eng, phy;

                    System.out.println("                         ");
                    System.out.println("UPDATE STUDENT AVERAGE ");
                    System.out.println("                        ");
                    System.out.print("Enter student ID: ");
                    student = sc.next();
                    for (int x = 0; x < num; x++) {
                        int d = 0;
                        if (clap[x].getId().equals(student)) {
                            System.out.println("                                                ");
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");  
                            System.out.println("Selected Student:" + clap[x].getFname() + " " + clap[x].getLname());
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");  
                            System.out.println("                                                ");
                            System.out.println("Enter grades on the ff.");

                            System.out.print("Math: ");
                            math = sc.nextInt();

                            System.out.print("Science: ");
                            scie = sc.nextInt();
                            
                            System.out.print("Programming: ");
                            prog = sc.nextInt();
                            System.out.print("English: ");
                            eng = sc.nextInt();
                            
                            System.out.print("Phych: ");
                            phy = sc.nextInt();

                            ttlavg = (math + scie + prog + eng + phy) / 5;

                            clap[x].setAverage(ttlavg);
                            System.out.println("------------------------------------------------");  
                            System.out.println("Total Average:" + ttlavg);
                            
                            if (ttlavg >= 75) {
                                System.out.println("Status: Passed");
                                clap[x].setStatus("Passed");
                             
                            } else {
                                System.out.println("Status: Failed!");
                                clap[x].setStatus("Failed");
                            
                            }
                            System.out.println("------------------------------------------------");
                            System.out.println();

                        }
                       
                    }

                    grapp.display(num, clap);
                    break;

                case 5:
                System.out.println("                                    ");
                System.out.println("REMOVE STUDENT");
                System.out.println("                                   ");
                System.out.print("Enter ID to remove: ");
                    String rem = sc.next();
                    
                System.out.println("------------------------------------------------");  
                    for (int i = 0; i < num; i++) {
                        
                        if (clap[i].getId().equals(rem)) {
                          
                            System.out.println("Selected Student:" + clap[i].getFname() + " " + clap[i].getLname());
                            System.out.println();
                            clap[i].setStatus("------");
                            clap[i].setAverage(0.0);
                            clap[i].setFname("------");
                            clap[i].setLname("------");
                      
                        } 
                          

                    }
                 
                    System.out.println("------------------------------------------------");   
                    System.out.println("SUCCESS!");
                    break;

                case 6:
                    double ttl = 0,
                     stavg = 0;
                    System.out.println("                                                      ");
                    System.out.println("CLASS AVERAGE REPORT");
                    System.out.println("                                        ");
                    grapp.display(num, clap);
                    System.out.println("---------------------------------------------------");
                    System.out.println("Number of Students: " + num);
                    for (int x = 0; x < num; x++) {
                        stavg += clap[x].getAverage();
                        ttl = stavg*2/num;
                    }
                     
                    System.out.println("Class Average: " +ttl);
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
            System.out.println("SEE YOU SOONEST! 😊 "); 

    }
    
}
