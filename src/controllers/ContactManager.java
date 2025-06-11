package controllers;
import models.Contact;
import models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<String,String>> contacts;
    
    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<String,String> contact){
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
        models.Node<Contact<String, String>> node = contacts.getHead();
        while (node != null) {
            String contactName = node.getValue().getNameT();
            if (name == null) {
                if (contactName == null) {
                    return node.getValue();
                }
            } else {
                if (name.equals(contactName)) {
                    return node.getValue();
                }
            }
            node = node.getNext();
        }
        return null; // no encontró
    }
    

    public void deleteContactByName(String name){
        models.Node<Contact<String,String>> node = contacts.getHead();
        while (node != null) {
            if (node.getValue().getNameT().equals(name)) {
                contacts.deleteByValue(node.getValue());
                break;
            }
            node = node.getNext();
        }
    }

    public void printList(){
        if (contacts.getHead() == null) {
            System.out.println("No hay contactos en la lista.");
            return;
        }
        models.Node<Contact<String,String>> node = contacts.getHead();
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
