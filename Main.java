import Examenpackage.Gebruiker;
import Examenpackage.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Examenlijst examenlijst = new Examenlijst();
        Examen examen = new Examen("Nederlands", 10, examenlijst );
        Gebruiker gebruiker = new Gebruiker("Luc", 21095582, true);
        while (true) {
            String menu = """
                    Menu
                    1) Lijst met examens
                    2) Lijst met gebruikers
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
                System.out.println(gebruiker.getGebruikersLijst());

            } else if (menuInput == 3) {
                menuOptieDrie(scanner);

            } else if (menuInput == 4) {
                menuOptieVier(scanner, gebruiker);

            } else if (menuInput == 5) {
                MenuOptie5();

            } else if (menuInput == 6) {
                /// nog afmaken
                menuOptieZes();

            } else if (menuInput == 7) {

            } else if (menuInput == 8) {

            } else if (menuInput == 0) {
                System.out.println("Programma sluit af...");
                break;
            }
        }
    }

    private static void menuOptieDrie(Scanner scanner) {
        System.out.println("Geef de naam: ");
        scanner.nextLine();
        String naamInput = scanner.nextLine();
        while (true){
            try{
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
                        System.out.println("Graag een 'y' of 'n' geven");
                    }
                }
                Gebruiker gebruiker = new Gebruiker(naamInput, stNmrInput, adminChoise);
                break;
            } catch (Exception e) {
                System.out.println("Graag cijfers gebruiken");
                scanner.next();
            }
        }
    }
    private static void menuOptieVier(Scanner scanner, Gebruiker gebruiker) {
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Welke student wilt u verwijderen?");
                String studentNaam = scanner.nextLine();
                if (gebruiker.verwijderStudent(studentNaam)) {
                    System.out.println(studentNaam + " is succesvol verwijderd");
                    break;
                } else {
                    System.out.println("Er is iets fout gegaan, check uw spelling, druk op enter en probeer het opnieuw");
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
<<<<<<< HEAD
    private static void menuOptieZes(Scanner scanner, Gebruiker gebruiker){
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Van welke student wilt u nagaan of hij is geslaagd voor een test?");
                String inputNaam = scanner.nextLine();
            }
            catch(Exception e){
                System.out.println("Graag een naam invoeren!");
            }
        }
=======
    private static void MenuOptie5(){
        System.out.println("menu optie 5");
>>>>>>> 2acd14f042e79d4b8e6606dc78ccce98659b604d
    }
}