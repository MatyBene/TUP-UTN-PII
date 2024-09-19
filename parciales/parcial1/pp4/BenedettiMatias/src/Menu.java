import java.util.Scanner;

public class Menu {
    private Scanner input;

    public Menu() {
        this.input = new Scanner(System.in);
    }

    public void start() {

        boolean exit = false;

        while (!exit) {
            int option = mainMenu();

            switch (option) {
                case 1 -> {}
                case 2 -> {}
                case 3 -> {}
                case 4 -> exit = true;
                default -> System.out.println("Opción no válida.");
            }
        }
        input.close();
    }

    public int mainMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("Seleccione una opción: ");
        return input.nextInt();
    }
}