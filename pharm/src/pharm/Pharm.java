System.out.println("REMOVE STUDENT");
                    System.out.println("Enter student ID to be remove: ");
                    String id = scan.next();
                    for(i = 0; i < size; i++){
                        if (id.matches(GS[i].id)) {
                            while (!id.matches(GS[i].id)) {
                                System.out.println("Invalid input !");
                                System.out.print("Enter ID: ");
                                id = scan.next();
                            }
                        System.out.println("----------------------------------------------");
                        System.out.println("Selected Student: " +GS[i].fname + " " +GS[i].lname);
                        System.out.println("----------------------------------------------");
                        GS[i] = GS[i+1];
                        }
                        
                    System.out.println("|===============================Student List====================================|");
                   
                    System.out.println("+ID. +First Name  +Last Name  +Average  +Status  +");
                    }
                    for(i = 0; i < size-1; i++){
                        GS[i].showData();
                    }

break;