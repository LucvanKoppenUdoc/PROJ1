import Examenpackage.Gebruiker;
import Examenpackage.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Examens
        Examen examen = new Examen("Nederlands", 10);

        //Gebruikers
        Gebruiker gebruiker = new Gebruiker("Luc", 21095582, "Wachtwoord", true);
        Gebruiker gebruiker2 = new Gebruiker("Daniel", 21137943,
                "Wachtwoord", true);
        Gebruiker gebruiker3 = new Gebruiker("Bram", 21113653, "Wachtwoord", true);
        Gebruiker gebruiker4 = new Gebruiker("Rick", 20112602, "Wachtwoord", false);
        examen.setStudentGeslaagd(gebruiker.getGebruikersLijst());

        //Vragen
        ArrayList<String> keuzeAntwoorden = new ArrayList<String>();
        keuzeAntwoorden.add("1 aap");
        keuzeAntwoorden.add("2 poes");
        keuzeAntwoorden.add("3 hondje");
        Vraag vraag = new Vraag("Wat is mijn lievelingsdier?", 1, keuzeAntwoorden, examen);
        ArrayList<String> keuzeAntwoorden1 = new ArrayList<String>();
        keuzeAntwoorden1.add("1 Rikash");
        keuzeAntwoorden1.add("2 Royalistic");
        keuzeAntwoorden1.add("3 Gert");
        Vraag vraag1 = new Vraag("Wat is Roy zijn bijnaam?", 1, keuzeAntwoorden1, examen);
        ArrayList<String> keuzeAntwoorden2 = new ArrayList<String>();
        keuzeAntwoorden2.add("1 2");
        keuzeAntwoorden2.add("2 3");
        keuzeAntwoorden2.add("3 4");
        Vraag vraag2 = new Vraag("Wat is 2+2?", 3, keuzeAntwoorden2, examen);
        ArrayList<String> keuzeAntwoorden3 = new ArrayList<String>();
        keuzeAntwoorden3.add("1 Delft");
        keuzeAntwoorden3.add("2 Maassluis");
        keuzeAntwoorden3.add("3 Arnhem");
        Vraag vraag3 = new Vraag("Waar woont Daniel?", 2, keuzeAntwoorden3, examen);
        ArrayList<String> keuzeAntwoorden4 = new ArrayList<String>();
        keuzeAntwoorden4.add("1 1 meter 50");
        keuzeAntwoorden4.add("2 1 meter 20");
        keuzeAntwoorden4.add("3 Ja idd");
        Vraag vraag4 = new Vraag("Hoelang is een chinees?", 3, keuzeAntwoorden4, examen);

        //TEST
        //System.out.println(examen.getVragen());

        Gebruiker ingelogdeUser = Inlog(scanner, gebruiker);
        System.out.println(ingelogdeUser);
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
                    menuInput = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("\nGraag cijfers invoegen\n");
                    scanner.next();
                }
            }
            if (menuInput == 1) {
                for (int i = 0; i < Examen.getExamenlijst().size(); i++) {
                    System.out.println(Examen.getExamenlijst().get(i));
                }

            } else if (menuInput == 2 && ingelogdeUser.getAdmin()) {
                for (int i = 0; i < gebruiker.getGebruikersLijst().size(); i++) {
                    System.out.println(gebruiker.getGebruikersLijst().get(i));
                }

            } else if (menuInput == 3 && ingelogdeUser.getAdmin()) {
                menuOptieDrie(scanner);

            } else if (menuInput == 4 && ingelogdeUser.getAdmin()) {
                menuOptieVier(scanner, gebruiker);

            } else if (menuInput == 5) {
                MenuOptieVijf();

            } else if (menuInput == 6 && ingelogdeUser.getAdmin()) {
                studentGeslaagd(scanner);

            } else if (menuInput == 7 && ingelogdeUser.getAdmin()) {
                menuOptieZeven();

            } else if (menuInput == 8 && ingelogdeUser.getAdmin()) {
                menuOptieAcht();

            } else if (menuInput == 0) {
                System.out.println("Programma sluit af...");
                break;
            } else {
                System.out.println("\nJe hebt hier geen rechten voor!\n");
            }
        }
    }

    private static Gebruiker Inlog(Scanner scanner, Gebruiker gebruiker) {
        int gebruikerNummer = 0;
        while (true) {
            try {
                System.out.println("Wat is je studentnummer?");
                gebruikerNummer = scanner.nextInt();
                System.out.println("Wat is je wachtwoord?");
                scanner.nextLine();
                String wachtwoordInput = scanner.nextLine();
                if (gebruiker.getGebruikerOnGebruikerNummer(gebruikerNummer).getWachtwoord().equals(wachtwoordInput)) {
                    System.out.println("hallo");
                    break;
                } else {
                    System.out.println("Verkeerder inlog probeer opnieuw!\n");

                }
            } catch (Exception e) {
                System.out.println("Graag alleen cijfers gebruiken\n");
                scanner.next();
            }

        }
        return gebruiker.getGebruikerOnGebruikerNummer(gebruikerNummer);
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
                System.out.println("Geef het wachtwoord: ");
                String stWwInput = scanner.nextLine();
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
                Gebruiker gebruiker = new Gebruiker(naamInput, stNmrInput,stWwInput, adminChoise);
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
                    System.out.println("Er is iets fout gegaan, check uw spelling, druk op enter en probeer het " +
                            "opnieuw");
                }
            }
            catch (Exception e) {
                System.out.println(e);
                scanner.next();
            }
        }
    }
    private static void MenuOptieVijf(){
        System.out.println("hallo");
    }
    private static void studentGeslaagd(Scanner scanner){
        //nog afmaken
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Van welke student wilt u nagaan of hij is geslaagd voor een test?");
                String inputNaam = scanner.nextLine();
                //if (gebruiker.)
                break;
            }
            catch(Exception e){
                System.out.println("Graag een naam invoeren!");
                scanner.next();
            }
        }
    }
    private static void menuOptieZeven(){
        System.out.println("hallo");
    }
    private static void menuOptieAcht(){
        System.out.println("hallo");
    }
}