package controllers;
import views.ConsoleView;
public class MenuController {
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
        

    }

    private void findContact(){

    }

    private void deleteContact(){

    }


}
