

import Examenpackage.Gebruiker;
import Examenpackage.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Examenlijst examenlijst = new Examenlijst();
        Examen examen = new Examen("Kaas", 10, examenlijst );

        while (true) {

            String menu = """
                    Menu
                    1) Lijst met examens
                    2) Lijst met studenten
                    3) Nieuwe student inschrijven
                    4) Student verwijderen
                    5) Examen afnemen
                    6) Is student geslaagd voor test?
                    7) Welke examens heeft student gehaald?
                    8) Welke student heeft de meeste examens gehaald?
                    0) Exit
                    Uw keuze:""";

            int menuInput = 11;
            while (menuInput > 8 || menuInput < 0) {
                try {
                    System.out.println(menu);
                    menuInput = scanner.nextInt();  // Read user input
                } catch (InputMismatchException e) {
                    System.out.println("\nGraag cijfers invoegen\n");
                    scanner.next();
                }
            }
            System.out.println("uw keuze is: " + menuInput);  // Output user input
            
            if (menuInput == 1) {
                System.out.println(examenlijst);
            } else if (menuInput == 2) {

            } else if (menuInput == 3) {
                System.out.println("Geef de naam: ");
                scanner.nextLine();
                String naamInput = scanner.nextLine();
                System.out.println("Geef het studentennummer: ");
                int stNmrInput = scanner.nextInt();
                scanner.nextLine();
                boolean adminChoise = false;
                while (true) {
                    System.out.println("Is dit een docent (y/n)");
                    String adminInput = scanner.nextLine().toUpperCase();
                    if (adminInput.equals("Y") || adminInput.equals("N")){
                        if (adminInput.equals("Y")) {
                            adminChoise = true;
                        }
                        break;
                    } else {
                        System.out.println("Graag een 'y/Y' of 'n/N' geven");
                    }
                }
                Gebruiker gebruiker = new Gebruiker(naamInput, stNmrInput, adminChoise);

            } else if (menuInput == 4) {
                //gebruik menuinput 2: gebruikerslijst printen
                while (true) {
                    try {
                    System.out.println("Welke student wilt u verwijderen?");
                    scanner.nextLine();
                    String studentVerwijderen = scanner.nextLine();
                    //input verwerken in gebruikerslijst??
                    break;
                    }
                    // Catch werkt niet
                    catch (Exception e) {
                        System.out.println("\nGraag een naam invoeren\n");
                    }
                }
            } else if (menuInput == 5) {

            } else if (menuInput == 6) {

            } else if (menuInput == 7) {

            } else if (menuInput == 8) {

            } else if (menuInput == 0) {
                System.out.println("Programma sluit af...");
                break;
            }
        }
    }
}


