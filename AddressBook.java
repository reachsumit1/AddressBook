package AssignmentProjectDay9;
import java.util.*;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program. ");
        ArrayList<Contact> list = new ArrayList<>();
        Scanner sc1=new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println(" 1 Add ");
            System.out.println(" 2 Display ");
            System.out.println(" 3 Delete ");
            System.out.println("4 Update ");
            System.out.println("Enter your choice:");
            choice=sc1.nextInt();

            switch (choice){
                //Create.....
                case 1:
                    System.out.println("Enter user first name: ");
                    String firstName= sc1.nextLine();
                    System.out.print("Enter user second name:");
                    String lastName= sc1.nextLine();
                    System.out.print("Enter the address:");
                    String address= sc1.nextLine();
                    System.out.print("Enter the city:");
                    String city= sc1.nextLine();
                    System.out.print("Enter the state: ");
                    String state= sc1.nextLine();
                    System.out.print("Enter the zip code: ");
                    int zip= sc1.nextInt();
                    System.out.print("Enter the Phone number: ");
                    int PhoneNumber= sc1.nextInt();
                    System.out.print("Enter the email:");
                    String email= sc1.nextLine();
                    Contact ct=new Contact(firstName,lastName,address,city,state,zip,PhoneNumber,email);
                    list.add(ct);
//                    list.add(new Contact(firstName,lastName,address,city,state,zip,phone,email));
                    break;

                // Display......
                case 2:
//                    System.out.println("----------------------------------------");
                    Iterator<Contact> itr=list.iterator();
                    while(itr.hasNext()){
                        Contact contactDetails=itr.next();
                        System.out.println(contactDetails);
                    }
                    System.out.println("----------------------------------------------");
                    break;

                //  Delete.......
                case 3:
                    boolean found=false;
                    System.out.println("Enter the  Phone number to delete:");
                    int updateedNumber= sc1.nextInt();
                    System.out.println("----------------------------------------");
                    itr=list.iterator();
                    while(itr.hasNext()){
                        Contact contactDetails=itr.next();
                        if(contactDetails.PhoneNumber==updateedNumber){
                            itr.remove();
                            found=true;
                        }}
                    if(!found){
                        System.out.println("Record is not found");
                    }else{
                        System.out.println("Record is deleted successfully..");
                    }
                    System.out.println("----------------------------------------------");
                    break;


                //Update ........
                case 4:
                    found=false;
                    System.out.println("Enter the  PhoneNumber to update:");
                    updateedNumber= sc1.nextInt();
                    System.out.println("----------------------------------------");
                    ListIterator<Contact>li=list.listIterator();
                    while(li.hasNext()){
                        Contact contactDetails=li.next();
                        if(contactDetails.PhoneNumber==updateedNumber){
                            System.out.println("Enter the first name: ");
                            firstName= sc1.nextLine();
                            System.out.println("Enter last Name:");
                            lastName=sc1.nextLine();
                            System.out.println("Enter the address: ");
                            address=sc1.nextLine();
                            System.out.println("Enter the city: ");
                            city=sc1.nextLine();
                            System.out.println("Enter state: ");
                            state=sc1.nextLine();
                            System.out.println("Enter the zip code .");
                            zip=sc1.nextInt();
                            System.out.println("Enter phone number:");
                            PhoneNumber= sc1.nextInt();
                            System.out.println("Enter email: ");
                            email= sc1.nextLine();
                            Contact ct1=new Contact(firstName,lastName,address,city,state,zip,PhoneNumber,email);
                            // set update the last elements...
                            li.set(ct1);
                            found=true;
                        }}
                    if(!found){
                        System.out.println("Record is not found");
                    }else{
                        System.out.println("Record is Updated successfully..");
                    }
                    System.out.println("----------------------------------------------");
                    break;
            }
        }while (choice!=0);
    }
}
