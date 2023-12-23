import java.util.*;
import java.util.ArrayList;

public class BankApp {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("Aashish", "Suhel", "Pakwara", 80760912, 78569823, 8976, 1200));
        list.add(new Account("Arpan", "Krish", "Amroha", 97763932, 98560845, 7680, 2100));
        list.add(new Account("Suresh", "Deepak", "Noida", 84790519, 83449087, 3456, 9800));
        list.add(new Account("Bhumi", "Bhupendra", "Chandosi", 79067890, 96447290, 5926, 12780));

        String n, fn, add;
        int ph, amt, aadhar, pi, accno;
        boolean found;
        System.out.println("Select Any 1 Option");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance Enquiry");
        System.out.println("5. List All of Accounts");
        System.out.println("6. Exit");

        int choice;

        do{
            System.out.print("\nEnter choice(1 - 6) here : ");
    
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("********* Account Open ********");
                    System.out.print("Enter Holder Name : ");
                    n = sc.next();
                    System.out.print("Enter Father Name : ");
                    fn = sc.next();
                    System.out.print("Enter Address : ");
                    add = sc.next();
                    System.out.print("Enter Phone Number : ");
                    ph = sc.nextInt();
                    System.out.print("Enter Aadhar Number : ");
                    aadhar = sc.nextInt();
                    System.out.print("Enter Your Balance : ");
                    amt = sc.nextInt();
                    System.out.print("Enter Your Security Pin : ");
                    pi = sc.nextInt();

                    Account acc = new Account(n, fn, add, ph, aadhar, pi, amt);
                    list.add(acc);
                    System.out.println("Account Successfully Created...!!!");
                    break;
                case 2:
                    System.out.println("********* Account deposit ********");
                    found = false;
                    System.out.print("Enter Account Number : ");
                    accno = sc.nextInt();
                    System.out.print("Enter Pin Number : ");
                    pi = sc.nextInt();
                    for(Account ac: list){
                        if(accno == ac.getAccno() && pi == ac.getPin()){
                            found = true;
                            System.out.println("Customer Name : "+ac.getName());
                            System.out.println("Fsather Name : "+ac.getFathername());
                            System.out.println("Address : "+ac.getAddress());
                            System.out.println("Phone Number : "+ac.getPhoneno());
                            System.out.println("Aadhar Number : "+ac.getAadharno());
                            System.out.println("Total Balance : "+ac.getBal());
                            
                            System.out.print("\nEnter Amount to Deposit : ");
                            amt = sc.nextInt();
                            ac.setBal(ac.getBal() + amt);
                            System.out.println("Deposit Amount Successfully...!!!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account Number / Incorrect Pin...!!!");
                    }
                    break;
                case 3:
                    System.out.println("********* Account Withdraw ********");
                    found = false;
                    System.out.print("Enter Account Number : ");
                    accno = sc.nextInt();
                    System.out.print("Enter Pin Number : ");
                    pi = sc.nextInt();
                    for(Account ac: list){
                        if(accno == ac.getAccno() && pi == ac.getPin()){
                            found = true;
                            System.out.println("Customer Name : "+ac.getName());
                            System.out.println("Fsather Name : "+ac.getFathername());
                            System.out.println("Address : "+ac.getAddress());
                            System.out.println("Phone Number : "+ac.getPhoneno());
                            System.out.println("Aadhar Number : "+ac.getAadharno());
                            System.out.println("Total Balance : "+ac.getBal());
                            
                            System.out.print("\nEnter Amount to Withdraw : ");
                            amt = sc.nextInt();
    
                            if(amt <= ac.getBal()){
                                ac.setBal(ac.getBal() - amt);
                                System.out.println("Withdraw Amount Successfully...!!!");    
                            }
                            else{
                                System.out.println("Insufficient Balance...!!!");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Account Number / Incorrect Pin, Please ReEnter...!!!");
                    }
                    break;
                case 4:
                    System.out.println("********* Account Balance Enquiry ********");
                    found = false;
                    System.out.print("Enter Account Number : ");
                    accno = sc.nextInt();
                    System.out.print("Enter Pin Number : ");
                    pi = sc.nextInt();
                    for(Account ac: list){
                        if(accno == ac.getAccno() && pi == ac.getPin()){
                            found = true;
                            System.out.println("Customer Name : "+ac.getName());
                            System.out.println("Fsather Name : "+ac.getFathername());
                            System.out.println("Address : "+ac.getAddress());
                            System.out.println("Phone Number : "+ac.getPhoneno());
                            System.out.println("Aadhar Number : "+ac.getAadharno());
                            System.out.println("Total Balance : "+ac.getBal());
    
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Ivalid Account Number / Incorrect Pin, Please Re-Enter...!!!");
                    }
                    break;
                case 5:
                    System.out.println("********* List of All Accounts ********");
                    for (Account ac : list) {
                        System.out.println(ac);
                    }
                    break;
                case 6:
                    System.out.println("\n********* Thanks for visiting us ********\n");
                    break;
                default :
                    System.out.println("******** Invalid Choice, Please Try Again...!!! ********");
                    break;
            }
        }while (choice != 6);
        sc.close();
    }
}
