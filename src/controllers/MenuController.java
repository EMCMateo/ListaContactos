package controllers;
import models.Contact;
import views.ConsoleView;
import java.util.Scanner;

public class MenuController {
    Scanner leer = new Scanner(System.in);
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        contactManager = new ContactManager();
        consoleView = new ConsoleView();
    }

    public void showMenu(){
        String option = consoleView.getInput("Seleccione una opción: ");

        switch (option) {
            case "1":
                addContact();
                showMenu();
                break;
            case "2":
                findContact();
                showMenu();
                break;
            case "3":
                deleteContact();
                showMenu();
                break;
            case "4":
                consoleView.showMessage("Lista de contactos:");
                printList();
                showMenu();
                break;
            case "5":
                consoleView.showMessage("Saliendo del programa...");
                System.exit(0);
                break;
            default:
                consoleView.showMessage("Opción no válida. Intente de nuevo.");
                showMenu();
                break;
        }

    }

    private void addContact(){
        System.out.println("Agregar contacto");
        String name = consoleView.getInput("Ingrese el nombre del contacto: ");
        String phone = consoleView.getInput("Ingrese el número de teléfono: ");
        if (name.isEmpty() || phone.isEmpty()) {
            consoleView.showMessage("El nombre y el número de teléfono no pueden estar vacíos.");
            return;
        } else {
            Contact<String, String> contact = new Contact<>(name, phone);
            contactManager.addContact(contact);
            consoleView.showMessage("Contacto agregado exitosamente.");
        }
    }

    private void findContact(){
        String name = consoleView.getInput("Ingrese el nombre del contacto a buscar: ");
        Contact<String,String> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }

    }

    private void deleteContact(){
        consoleView.showMessage("Elminar contacto");
        String contacto = consoleView.getInput("Ingrese el nombre del contacto");
        contactManager.deleteContactByName(contacto);
    }

    private void printList(){
        contactManager.printList();
    }


}
