import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("1.Add new Contact \n2.Find a contact by name \n3.Display contacts \n4.Exit");
        System.out.println("Enter your choice : ");
    }

    public void run(){
        while(true){
            displayMenu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    addContact();
                    break;
                case 2:
                    findContactByName();
                case 3:
                    displayContacts();
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if(choice == 4){
                break;
            }
        }
    }

    public void addContact(){
        Contact contact = new Contact();
        System.out.println("Enter your name: ");
        contact.setName(sc.next());
        System.out.println("Enter your company: ");
        contact.setCompany(sc.next());
        System.out.println("Enter your email: ");
        contact.setEmail(sc.next());
        contacts.add(contact);
        System.out.println("Enter your phone number: ");
        contact.setPhone(sc.next());
        System.out.println("Contact added successfully");
    }

    public void findContactByName(){
        System.out.println("Enter the name to find the contact : ");
        String name = sc.next();
        for(Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Contact found");
                System.out.println(contact);
                break;
            } else {
                System.out.println("Contact not found");
            }
        }
    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts found");
        } else {
            for(Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
