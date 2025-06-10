package controllers;
import models.LinkedList;
import models.Contact;

public class ContactManager {
    private LinkedList<Contact<String,Integer>> contacts;
    
    public ContactManager() {
        contacts = new LinkedList<>();
    }


    public void addContact(Contact<String,Integer> contact){
        contacts.appendToTail(contact);
    }

    public Contact<String,Integer> findContactByName (String name){
       
        Contact<String,Integer> current = contacts.getHead() != null ? contacts.getHead().getValue() : null;
        models.Node<Contact<String,Integer>> node = contacts.getHead();
        while (node != null) {
            if (node.getValue().getNameT().equals(name)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }

    public void deleteContactByName(String name){
        models.Node<Contact<String,Integer>> node = contacts.getHead();
        while (node != null) {
            if (node.getValue().getNameT().equals(name)) {
                contacts.deleteByValue(node.getValue());
                break;
            }
            node = node.getNext();
        }
    }

    public void printList(){
        models.Node<Contact<String,Integer>> node = contacts.getHead();
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
