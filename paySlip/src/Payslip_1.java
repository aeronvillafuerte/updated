/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class Payslip {
    
}


case 3:
                         System.out.println("Update Student Details ");
                    System.out.print("Enter student ID: ");
                    String update = scan.next();
                    for(i = 0; i < size; i++){
                        if(update.matches(GS[i].id)) {
                           while (!update.matches(GS[i].id)) {
                                  System.out.println("Invalid ID !");
                                  System.out.println("Enter ID again: ");
                                 String id = scan.next();
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("Selected Student: " +GS[i].fname + " " +GS[i].lname);
                        System.out.println("----------------------------------------------");
                        System.out.println("Enter ID");
                        String id = scan.next();
                        System.out.print("Enter First Name: ");
                        String fname = scan.next();
                        System.out.print("Enter Last Name: ");
                        String lname = scan.next();
                        //System.out.print("Enter Average: ");
                       // average = scan.nextDouble();
                        
                      GS[i] = new Gradesystem(id,fname,lname,Average,Status); 
                    }
                    }
                    System.out.println("UPDATE SUCCESSFULLY !");
                    System.out.println("|-------------------------------------------------------------------------------|");
                    System.out.println("|===============================Student List====================================|");
                    System.out.println("|-------------------------------------------------------------------------------|");
                    System.out.println("|   ID    |        FirstName      |       LastName      |  Average  |   Status  |");
                    
                    for (i = 0; i < size; i++){
                         GS[i].showData();
                    }
                       break;