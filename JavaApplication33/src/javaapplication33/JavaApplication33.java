
package javaapplication33;

import java.util.Scanner;
class Student{

    private int id;
    protected String name = "John";
    private String address;
    private double grade;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class JavaApplication33 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Student[] st = new Student[100];
        JavaApplication33 obj = new JavaApplication33();
       
        int num = 0;
        double total = 0;
        double average = 0;
       
        for(int x=0; x < 2; x++){
            System.out.println("Enter details of student ");
            System.out.print("ID: ");
            st[x] = new Student();
            st[x].setId(sc.nextInt());
            System.out.print("Name: ");
            st[x].setName(sc.next());
            System.out.print("Address : ");
            st[x].setAddress(sc.next());
            System.out.print("Grade : ");
            st[x].setGrade(sc.nextDouble());
            System.out.print("Status : ");
            st[x].setStatus(sc.next());
           
            total +=st[x].getGrade();
        }
        System.out.println(" ID     | Name     | Address     | Grade     | Status");
       
        for(int x=0; x < 2; x++){
            System.out.println(" "+st[x].getId()+"     | "+st[x].getName()+"     | "+st[x].getAddress()+"     | "+st[x].getGrade()+"     | "+st[x].getStatus());
        }
       
        System.out.println("Total Average: "+total/2);
       
    }
   
}
    
    

