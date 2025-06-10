package controllers;
import models.Contact;
import views.ConsoleView;
import java.util.Scanner;
public class MenuController {
    Scanner leer = new Scanner(System.in);
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public void showMenu(){
        consoleView = new ConsoleView();
        contactManager = new ContactManager();
        consoleView.displayMenu();
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
        }else{
            Contact <String, String> contact = new Contact<>(name, "0965478231");}
    
    }

    private void findContact(){

    }

    private void deleteContact(){

    }


}
