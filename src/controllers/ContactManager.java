package controllers;

public class ContactManager {
    private LinkedList<Contact<T,U>> contacts;
    
    public addContact(Contact<T,U> contact){

    }

    public Contact<T,U> findContactByName (String name){
        
    }

    public void deleteContactByName(String name){

    }

    public void printList(){
        for (Contact<T,U> contact : contacts){
            System.out.println(contact);
        }
    }
}
