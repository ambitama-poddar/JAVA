// You need to develop and test a Java program for a phone book application, 
// where users can store their contacts using different fields, 
// such as name, phone number, and email address. 
// Implement a HashMap to store the contacts, with name as the key and 
// a Contact object as the value, which comprises the contact information. 
// Implement methods for adding, removing, and searching for contacts.

import java.util.HashMap;
import java.util.Map;

class Contacts{
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contacts(String name, String phoneNumber, String emailAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Contacts [name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "]";
    }
}

class PhoneBookManager{
    private Map<String, Contacts> phoneBook;
    
    public PhoneBookManager(){
        this.phoneBook = new HashMap<String,Contacts>();    
    }

    public void addContact(String name, String phoneNumber, String emailAddress){
        Contacts contact = new Contacts(name, phoneNumber, emailAddress);
        phoneBook.put(name, contact);
    }

    public void removeContact(String name){
        phoneBook.remove(name);
    }

    public void searchContact(String name){
        System.out.println(phoneBook.get(name));
    }

    public void displayContact(){
        if(phoneBook.isEmpty()){
            System.out.println("Phone book is empty");
        }
        else{
            for(Map.Entry<String, Contacts> entry : phoneBook.entrySet()){
                System.out.println(entry.getValue());
            }
        }
    }
}

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();

        Contacts contact1=new Contacts("John", "1234567890", "john.doe@gmail.com");
        Contacts contact2=new Contacts("Jane", "0987654321", "jane.brown@gmail.com");
        Contacts contact3=new Contacts("Jack", "1230984567", "jack.johnson@gmail.com");

        phoneBookManager.addContact(contact1.getName(), contact1.getPhoneNumber(), contact1.getEmailAddress());
        phoneBookManager.addContact(contact2.getName(), contact2.getPhoneNumber(), contact2.getEmailAddress());
        phoneBookManager.addContact(contact3.getName(), contact3.getPhoneNumber(), contact3.getEmailAddress());

        phoneBookManager.displayContact();

        phoneBookManager.searchContact("John");

        phoneBookManager.removeContact("Jane");

        phoneBookManager.displayContact();
    }
}
