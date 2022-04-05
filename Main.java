

import Examenpackage.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Examenlijst examenlijst = new Examenlijst();
        Examen examen = new Examen("Kaas", 10, examenlijst );

        System.out.println(examenlijst);
        System.exit(0);
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
                //System.out.println(Examenlijst.getExamenlijst());
            } else if (menuInput == 2) {

            } else if (menuInput == 3) {
                //Scanner gebruiken voor input
                //fout in gebruiker.java oplossen
                Gebruiker gebruiker = new Gebruiker("Luc", 21095582, true);

            } else if (menuInput == 4) {
                //verwerken in gebruikerslijst
                System.out.println("Welke student wilt u verwijder?");
                String studentVerwijderen = scanner.nextLine();
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


