package booking;

import java.util.*;

import BookingConstructor.*;

import java.text.*;

public class booked {

    static String date;
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String status;
        int no, rate, size, capacity, floorNum = 0;

        System.out.println("WELCOME TO PAYAPP");
        
        System.out.print("Enter date: ");
        date = scanner.next();
        
        System.out.print("Enter number of Rooms: ");
        size = scanner.nextInt();
        while (size < 0) {
            System.out.println("Invalid");

            System.out.println("Enter number of Rooms again: ");
            size = scanner.nextInt();
        }

        BookingModel[] book = new BookingModel[size];

        for (int i = 0; i < size; i++) {

            System.out.println("====================================");
            
            System.out.println("Room " + (i + 1) + " Details");

            System.out.print("No.: ");
            no = scanner.nextInt();
            System.out.print("Floor No.: ");
            floorNum = scanner.nextInt();
            System.out.print("Rate: ");
            rate = scanner.nextInt();
            System.out.print("Max Capacity: ");
            capacity = scanner.nextInt();
            System.out.print("Status: ");
            status = scanner.next();

            while (!status.toLowerCase().matches("open") && !status.toLowerCase().matches("booked")) {
                System.out.println("Must be open/booked only!");
                System.out.print("Status: ");
                status = scanner.next();
            }

            book[i] = new BookingModel(no, floorNum, rate, capacity, status);
            
            book[i].setMaxCap(capacity);

        }

        getOptions(size, book);

    }

    static void deletedRooms(int size, BookingModel[] book) {
        System.out.println("================================================="
                + "===============================================================");
        System.out.println("|\tNo\t|\tFloor\t|\tRate\t|\tBalance\t|\tCapacity\t|\tStatus\t\t|");
        System.out.println("==============================================="
                + "=================================================================");

        for (int i = 0; i < size; i++) {

            if ("deleted".equals(book[i].getStatus().toLowerCase())) {

                System.out.println("|\t" + book[i].getNo() + "\t|\t" + book[i].getFloorNum() + "\t|\t"
                        + book[i].getRate() + "\t|\t" + book[i].getRate()
                        + "\t|\t" + book[i].getCapacity() + "\t\t|\t" + book[i].getStatus() + "\t\t|");
            }
        }
        System.out.println("================================================"
                + "================================================================");

    }

    static void openRooms(int size, double balance, double deposit, BookingModel[] book) {

        System.out.println("================================================="
                + "===============================================================");
        System.out.println("|\tNo\t|\tFloor\t|\tRate\t|\tBalance\t|\tCapacity\t|\tStatus\t\t|");
        System.out.println("==============================================="
                + "=================================================================");

        for (int i = 0; i < size; i++) {

            if ("open".equals(book[i].getStatus()) || "Open".equals(book[i].getStatus())) {

                System.out.println("|\t" + book[i].getNo() + "\t|\t" + book[i].getFloorNum() + "\t|\t"
                        + book[i].getRate() + "\t|\t" + book[i].getRate()
                        + "\t|\t" + book[i].getCapacity() + "\t\t|\t" + book[i].getStatus() + "\t\t|");
            }
        }
        System.out.println("================================================"
                + "================================================================");

    }

    static void bookedRooms(int size, double deposit, double charge, BookingModel[] book) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("======================================="
                + "=========================================================================");
        System.out.println("|\tNo\t|\tFloor\t|\tRate\t|\tBalance\t|\tCapacity\t|\tStatus\t\t|");
        System.out.println("==============================================="
                + "=================================================================");

        for (int i = 0; i < size; i++) {

            if ("booked".equals(book[i].getStatus().toLowerCase())) {

                if (charge > book[i].getRate()) {
                    book[i].setBalance(0);
                }

                System.out.println("|\t" + book[i].getNo() + "\t|\t" + book[i].getFloorNum()
                        + "\t|\t" + book[i].getRate() + "\t|\t" + decimal.format(book[i].getBalance())
                        + "\t|\t" + book[i].getCapacity() + "\t\t|\t" + book[i].getStatus() + "\t\t|");

            }

        }
        System.out.println("======================================================"
                + "==========================================================");

    }

    static void roomDisplay(int size, double deposit, double charge, BookingModel[] book) {

        int totalAvail = 0, totalCap = 0, totalBooked = 0, totalDeleted = 0, totalRooms = 0;
        double balance = 0;

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("==============================================="
                + "=================================================================");
        System.out.println("|\tNo\t|\tFloor\t|\tRate\t|\tBalance\t|\tCapacity\t|\tStatus\t\t|");
        System.out.println("==============================================="
                + "=================================================================");

        for (int i = 0; i < size; i++) {

            if ("booked".equals(book[i].getStatus().toLowerCase()) || "open".equals(book[i].getStatus().toLowerCase())) {
                if (book[i].getStatus().toLowerCase().equals("open")) {
                    balance = book[i].getRate();
                    book[i].setBalance(balance);
                }

                System.out.println("|\t" + book[i].getNo() + "\t|\t" + book[i].getFloorNum() + "\t|\t"
                        + book[i].getRate() + "\t|\t" + decimal.format(book[i].getBalance())
                        + "\t|\t" + book[i].getCapacity() + "\t\t|\t" + book[i].getStatus() + "\t\t|");

            }
        }

        System.out.println("==============================================="
                + "=================================================================");
        for (int i = 0; i < size; i++) {

            if ("booked".equals(book[i].getStatus().toLowerCase()) || "open".equals(book[i].getStatus().toLowerCase())) {
                totalRooms++;
            }

            if ("booked".equals(book[i].getStatus().toLowerCase())) {
                totalBooked++;
            }

            if ("open".equals(book[i].getStatus().toLowerCase())) {
                totalAvail++;
            }

            if ("deleted".equals(book[i].getStatus().toLowerCase())) {
                totalDeleted++;
            }

            totalCap += book[i].getCapacity();
        }

        System.out.println("Date: "+date);
        
        System.out.println(
                "Total number of Rooms: " + totalRooms);
        System.out.println(
                "Total expected person: " + totalCap);
        System.out.println(
                "Total Booked Rooms: " + totalBooked);
        System.out.println(
                "Total Available Rooms: " + totalAvail);
        System.out.println(
                "Total Deleted Rooms: " + totalDeleted);

    }

    static void getOptions(int size, BookingModel[] book) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int newCap, delete;
        double deposit = 0, balance = 0, charge = 0;

        do {

            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");
            System.out.println("|  Options (To - DO)    |");
            System.out.println("|  1. View Booked Rooms |");
            System.out.println("|  2. Book a Room       |");
            System.out.println("|  3. Update Booking    |");
            System.out.println("|  4. Delete Booking    |");
            System.out.println("|  5. View Summary      |");
            System.out.println("|6. Restore Room Deleted|");
            System.out.println("|  7. Clear and Quit    |");
            System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");

            System.out.println("Enter the option that you want to do: ");
            option = scanner.nextInt();

            switch (option) {

                case 1:

                    int bookedCount = 0;

                    for (int i = 0; i < size; i++) {
                        if ("booked".equals(book[i].getStatus().toLowerCase())) {
                            bookedCount++;
                        }
                    }

                    if (bookedCount > 0) {

                        bookedRooms(size, deposit, charge, book);

                        break;
                    } else {
                        System.out.println("No booked rooms displayed!");
                        break;
                    }
                case 2:

                    int num, newCapacity = 0,
                     countOpen = 0;
                    double percent;
                    int roomNum;

                    for (int i = 0; i < size; i++) {
                        if ("open".equals(book[i].getStatus().toLowerCase())) {
                            countOpen++;
                        }
                    }

                    if (countOpen > 0) {
                        openRooms(size, balance, deposit, book);

                        System.out.println("Select Room No.: ");
                        roomNum = scanner.nextInt();

                        for (int i = 0; i < size; i++) {

                            if (roomNum == book[i].getNo() && "booked".equals(book[i].getStatus().toLowerCase())) {
                                System.out.println("Invalid this room is already exist!");
                                System.out.println("Select Room number again.: ");
                                roomNum = scanner.nextInt();

                            }

                            if (book[i].getNo() == roomNum){
                                

                                System.out.println("Number of people: ");
                                num = scanner.nextInt();

                                if (num > book[i].getCapacity()) {

                                    while (num > book[i].getCapacity()) {
                                        System.out.println("Invalid. Max Capacity is  " + book[i].getCapacity());
                                        System.out.println("Number of people: ");
                                        num = scanner.nextInt();
                                    }

                                }

                                newCapacity = book[i].getCapacity() - num;
                                
                                book[i].setCapacity(newCapacity);
                                
                                System.out.println("Deposit: ");
                                charge = scanner.nextDouble();

                                percent = book[i].getRate() * .50;

                                while (charge < percent) {
                                    System.out.println("Your deposit must be greater than 50% of your balance");
                                    System.out.println("Deposit: ");
                                    charge = scanner.nextDouble();
                                }

                                balance = book[i].getRate() - charge;

                                if (charge > book[i].getRate()) {
                                    int total = (int) charge - book[i].getRate();
                                    System.out.println("Your change is " + total);
                                    book[i].setBalance(0);
                                }

                                book[i].setBalance(balance);

                                book[i].setStatus("booked");

                                System.out.println("Rooms Succesfully Booked!");

                                break;

                            }

                        }

                    } else {
                        System.out.println("No open rooms to book");
                    }
                    break;

                case 3:

                    int update;

                    int countBookedRoom = 0;

                    for (int i = 0; i < size; i++) {
                        if ("booked".equals(book[i].getStatus())) {
                            countBookedRoom++;
                        }
                    }

                    if (countBookedRoom > 0) {

                        bookedRooms(size, deposit, charge, book);

                        System.out.println("Select the room number that you want to update: ");
                        update = scanner.nextInt();

                        for (int i = 0; i < size; i++) 

                            if (update == book[i].getNo()) {

                                System.out.println("Deposit: ");
                                charge = scanner.nextDouble();

                                percent = balance * .50;

                                while (charge < percent) {
                                    System.out.println("Your deposit must be greater than 50% or " + percent);
                                    System.out.println("Enter deposit again: ");
                                    charge = scanner.nextDouble();
                                }

                                System.out.println("Update Capacity");
                                newCap = scanner.nextInt();

                                while (newCap > book[i].getMaxCap()) {
                                    System.out.println("The only capacity available is " + book[i].getMaxCap());
                                    System.out.println("Update Capacity again");
                                    newCap = scanner.nextInt();
                                }

                                book[i].setCapacity(newCap);

                            }

                        }
                        
                        System.out.println("UPDATED SUCCESSFULLY");
                    } else {
                        System.out.println("No booked rooms to be updated!");
                    }
                    break;

                case 4:

                    int capDel = 0;
                    int countBooked = 0;

                    for (int i = 0; i < size; i++) {
                        if ("booked".equals(book[i].getStatus())) {
                            countBooked++;
                        }
                    }

                    if (countBooked > 0) {

                        System.out.println("DELETE BOOKING");

                        System.out.println("BOOKED ROOMS");

                        bookedRooms(size, deposit, charge, book);

                        System.out.println("Enter the room number to delete: ");
                        delete = scanner.nextInt();

                        for (int i = 0; i < size; i++) {

                            if (delete == book[i].getNo() && "open".equals(book[i].getStatus())) {
                                while (delete == book[i].getNo() && "open".equals(book[i].getStatus())) {
                                    System.out.println("Invalid!");
                                    System.out.println("Enter the room number to delete again: ");
                                    delete = scanner.nextInt();
                                }
                            }

                        }

                        for (int x = 0; x < size; x++) {

                            if (delete == book[x].getNo()) {

                                book[x].setStatus("Deleted");

                                capDel = book[x].getCapacity() - book[x].getCapacity();

                                book[x].setCapacity(capDel);

                            }

                        }

                        System.out.println("SUCCESSFULLY DELETED!");
                    } else {
                        System.out.println("No booked rooms to be deleted!");
                    }
                    break;

                case 5:

                    roomDisplay(size, deposit, charge, book);

                    break;

                case 6:

                    int restore,
                     countDelete = 0;

                    for (int k = 0; k < size; k++) {
                        if (book[k].getStatus().equals("Deleted")) {
                            countDelete++;
                        }
                    }

                    if (countDelete > 0) {

                        deletedRooms(size, book);

                        System.out.println("Enter the room number that you want to restore: ");
                        restore = scanner.nextInt();

                        for (int i = 0; i < size; i++) {
                            if (restore == book[i].getNo() && "open".equals(book[i].getStatus().toLowerCase()) && "booked".equals(book[i].getStatus().toLowerCase())) {
                                while (restore == book[i].getNo() && "open".equals(book[i].getStatus().toLowerCase()) && "booked".equals(book[i].getStatus().toLowerCase())) {
                                    System.out.println("Invalid");
                                    System.out.println("Enter the room number that you want to restore: ");
                                    restore = scanner.nextInt();
                                }
                            }
                        }

                        for (int z = 0; z < size; z++) {

                            if (restore == book[z].getNo()) {

                                book[z].setStatus("open");

                            }

                        }
                        System.out.println("RESTORED SUCCESSFULLY");
                    } else {
                        System.out.println("No deleted rooms");
                    }

                    break;
                case 7:

                    System.out.println("Thank you for using the PayApp!");

                    break;

                default:

                    System.out.println("Invalid input! ");
                    System.out.println("Try again!");

            }

        } while (option == option);
    }

}
