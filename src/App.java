import controllers.MenuController;
import models.Contact;
public class App {
    public static void main(String[] args) throws Exception {

        Contact <String, String> contact1 = new Contact<>("Alice", "0965478231");
        Contact <String, String> contact2 = new Contact<>("Juan", "0942315687");
        Contact <String, String> contact3 = new Contact<>("Pedro", "0978432032");
        Contact <String, String> contact4 = new Contact<>("Mateo", "0991650338");
        Contact <String, String> contact5 = new Contact<>("Ferxxo", "0987521466");
        
        MenuController cs = new MenuController();
        cs.showMenu();


        System.out.println(contact1.equals(contact2));
        System.out.println(contact1.equals(contact3));
        System.out.println(contact1.equals(contact4));
        System.out.println(contact1.equals(contact5));

        

    }
}
