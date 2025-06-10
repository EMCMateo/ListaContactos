package controllers;
import models.LinkedList;
import models.Contact;

public class ContactManager {
    private LinkedList<Contact<String,String>> contacts;
    
    public ContactManager() {
        contacts = new LinkedList<>();
    }


    public void addContact(Contact<String,String> contact){
        contacts.appendToTail(contact);
    }

    public Contact<String,String> findContactByName (String name){
       
        Contact<String,String> current = contacts.getHead() != null ? contacts.getHead().getValue() : null;
        models.Node<Contact<String,String>> node = contacts.getHead();
        while (node != null) {
            if (node.getValue().getNameT().equals(name)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }

    public void deleteContactByName(String name){
        contacts.deleteByValue(new Contact<>(name, null));
    }

    public void printList(){
        models.Node<Contact<String,String>> node = contacts.getHead();
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
