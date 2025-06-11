package views;
import java.util.Scanner;
public class ConsoleView{
    private Scanner scanner = new Scanner(System.in);   // Constructor can be used for initialization if needed
    public ConsoleView() {
        displayMenu();
    }
    public void displayMenu(){
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar contactos");
        System.out.println("5. Salir");
    }

    public String getInput(String prompt){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;   
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}