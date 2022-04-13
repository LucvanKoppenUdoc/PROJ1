

import Examenpackage.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Examens
        Examen examen = new Examen("Teambuilding", 5);
        Examen examen1 = new Examen("Nederlands", 5);

        //Gebruikers
        Gebruiker gebruiker = new Gebruiker("Admin", 0, "0", true);
        Gebruiker gebruiker1 = new Gebruiker("Luc", 21095582, "Wachtwoord",
                true);
        Gebruiker gebruiker2 = new Gebruiker("Daniel", 21137943, "Wachtwoord",
                false);
        Gebruiker gebruiker3 = new Gebruiker("Bram", 21113653, "Wachtwoord",
                false);
        Gebruiker gebruiker4 = new Gebruiker("Rick", 20112602, "Wachtwoord",
                false);


        //Vragen Teambuilding
        ArrayList<String> keuzeAntwoorden = new ArrayList<String>();
        keuzeAntwoorden.add("1) Aap");
        keuzeAntwoorden.add("2) Poes");
        keuzeAntwoorden.add("3) Hondje");
        Vraag vraag = new Vraag("Wat is het lievelingsdier van Bram?", 1, keuzeAntwoorden,
                examen);
        ArrayList<String> keuzeAntwoorden1 = new ArrayList<String>();
        keuzeAntwoorden1.add("1) Rikash");
        keuzeAntwoorden1.add("2) Royalistic");
        keuzeAntwoorden1.add("3) Gert");
        Vraag vraag1 = new Vraag("Wat is Roy zijn bijnaam?", 1, keuzeAntwoorden1, examen);
        ArrayList<String> keuzeAntwoorden2 = new ArrayList<String>();
        keuzeAntwoorden2.add("1) 2");
        keuzeAntwoorden2.add("2) 3");
        keuzeAntwoorden2.add("3) 4");
        Vraag vraag2 = new Vraag("Wat is 2+2?", 3, keuzeAntwoorden2, examen);
        ArrayList<String> keuzeAntwoorden3 = new ArrayList<String>();
        keuzeAntwoorden3.add("1) Delft");
        keuzeAntwoorden3.add("2) Maassluis");
        keuzeAntwoorden3.add("3) Arnhem");
        Vraag vraag3 = new Vraag("Waar woont Daniel?", 2, keuzeAntwoorden3, examen);
        ArrayList<String> keuzeAntwoorden4 = new ArrayList<String>();
        keuzeAntwoorden4.add("1) 1 meter 50");
        keuzeAntwoorden4.add("2) 1 meter 20");
        keuzeAntwoorden4.add("3) Hoe lang is inderdaad een chinees");
        Vraag vraag4 = new Vraag("Hoelang is een chinees?", 3, keuzeAntwoorden4, examen);


        //Vragen Nederlands
        ArrayList<String> keuzeAntwoorden5 = new ArrayList<String>();
        keuzeAntwoorden5.add("1) 19");
        keuzeAntwoorden5.add("2) 20");
        keuzeAntwoorden5.add("3) 21");
        Vraag vraag5 = new Vraag("Hoeveel medeklinkers zijn er?", 2, keuzeAntwoorden5, examen1);
        ArrayList<String> keuzeAntwoorden6 = new ArrayList<String>();
        keuzeAntwoorden6.add("1) 5");
        keuzeAntwoorden6.add("2) 6");
        keuzeAntwoorden6.add("3) 7");
        Vraag vraag6 = new Vraag("Hoeveel klinkers zijn er?", 1, keuzeAntwoorden6, examen1);
        ArrayList<String> keuzeAntwoorden7 = new ArrayList<String>();
        keuzeAntwoorden7.add("1) Klinker");
        keuzeAntwoorden7.add("2) Medeklinker");
        keuzeAntwoorden7.add("3) Ligt aan het woord waarin hij geschreven staat");
        Vraag vraag7 = new Vraag("Is de Y een klinker of medeklinker?", 3, keuzeAntwoorden7,
                examen1);
        ArrayList<String> keuzeAntwoorden8 = new ArrayList<String>();
        keuzeAntwoorden8.add("1) Jatwoorden");
        keuzeAntwoorden8.add("2) Leenwoorden");
        keuzeAntwoorden8.add("3) Steelwoorden");
        Vraag vraag8 = new Vraag("Wat is een woord voor woorden die uit een andere taal gebruikt worden?"
                , 2, keuzeAntwoorden8, examen1);
        ArrayList<String> keuzeAntwoorden9 = new ArrayList<String>();
        keuzeAntwoorden9.add("1) Het rode boekje");
        keuzeAntwoorden9.add("2) Het blauwe boekje");
        keuzeAntwoorden9.add("3) Het groene boekje");
        Vraag vraag9 = new Vraag("In welk boekje staan alle spellingsregels van het Nederlands?"
                , 3, keuzeAntwoorden9, examen1);


        Gebruiker ingelogdeUser = Inlog(scanner, gebruiker);
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
                    9) Wat is gemiddeld cijfer van student?
                    0) Exit
                    Uw keuze:""";
            int menuInput = 11;
            while (menuInput > 9 || menuInput < 0) {
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
                gebruikerToevoegen(scanner);

            } else if (menuInput == 4 && ingelogdeUser.getAdmin()) {
                gebruikerVerwijderen(scanner, gebruiker);

            } else if (menuInput == 5) {
                examenAfnemen(scanner, ingelogdeUser);

            } else if (menuInput == 6 && ingelogdeUser.getAdmin()) {
                studentGeslaagd(scanner);

            } else if (menuInput == 7 && ingelogdeUser.getAdmin()) {
                studentExamenGehaald(scanner);

            } else if (menuInput == 8 && ingelogdeUser.getAdmin()) {
                meesteExamensGehaald();
                
            } else if (menuInput == 9 && ingelogdeUser.getAdmin()) {
                gemCijferStudent(scanner);

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
                    System.out.println("Welkom!");
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

    private static void gebruikerToevoegen(Scanner scanner) {
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
                Gebruiker gebruiker = new Gebruiker(naamInput, stNmrInput, stWwInput, adminChoise);
                break;
            } catch (Exception e) {
                System.out.println("Graag cijfers gebruiken");
                scanner.next();
            }
        }
    }
    private static void gebruikerVerwijderen(Scanner scanner, Gebruiker gebruiker) {
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Welke student wilt u verwijderen?");
                String studentNaam = scanner.nextLine();
                if (gebruiker.verwijderStudent(studentNaam)) {
                    System.out.println(studentNaam + " is succesvol verwijderd");
                    break;
                } else {
                    System.out.println("Er is iets fout gegaan, check uw spelling");
                }
            }
            catch (Exception e) {
                scanner.next();
            }
        }
    }
    private static void examenAfnemen(Scanner scanner, Gebruiker huidigeGebruiker){
        int aantalCorrect = 0;
        while(true) {
            int getal = 1;
            for (Examen examen : Examen.getExamenlijst()) {
                System.out.println(getal++ + ") " + examen.getNaam());
            }
            System.out.println("Keuze:");
            try {
                int examenKeuze = scanner.nextInt();
                if (examenKeuze > 0 && (examenKeuze-1) < Examen.getExamenlijst().size()) {
                    Examen tentamen = Examen.getExamenlijst().get(examenKeuze-1);
                    for (int i = 0; i < tentamen.getVragen().size(); i++) {
                        System.out.println(tentamen.getVragen().get(i).getVraagstelling());
                        for(int j = 0; j < tentamen.getVragen().get(i).getKeuzeAntwoorden().size(); j++){
                            System.out.println(tentamen.getVragen().get(i).getKeuzeAntwoorden().get(j));
                        }
                        System.out.println("Je keuze alsjeblieft:");
                        int keuzeStudent = scanner.nextInt();
                        if (keuzeStudent == tentamen.getVragen().get(i).getGoedAntwoord()){
                            aantalCorrect++;
                        }
                    }
                    double tebehalen = tentamen.getTeBehalenPunten();
                    double cijfer = (aantalCorrect / tebehalen) * 10;
                    Resultaat resultaat = new Resultaat(huidigeGebruiker, tentamen, cijfer);
                    break;
                } else {
                    System.out.println("Graag goede cijfers invoeren");
                    scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Graag alleen cijfers in voeren");
                scanner.next();
            }
        }
    }
    private static void studentGeslaagd(Scanner scanner){
        scanner.nextLine();
        Gebruiker student = new Gebruiker();
        Examen examen = new Examen();
        while (true) {
            try {
                System.out.println("Van welke student wilt u nagaan of hij is geslaagd voor een test?");
                String inputNaam = scanner.nextLine();
                for (int i = 0; i < Gebruiker.gebruikerslijst.size(); i++) {
                    if (inputNaam.equals(Gebruiker.gebruikerslijst.get(i).getNaam())) {
                        student = Gebruiker.gebruikerslijst.get(i);
                    }
                }
                break;
            }
            catch(Exception e){
                System.out.println("Graag een naam invoeren!");
            }
        }
        while (true) {
            try {
                System.out.println("Van welk examen wil je nalopen of " + student.getNaam() + " is geslaagd?");
                String inputExamen = scanner.nextLine();
                for (int i = 0; i < Examen.examenlijst.size(); i++) {
                    if (inputExamen.equals(Examen.examenlijst.get(i).getNaam())) {
                        examen = Examen.examenlijst.get(i);
                    }
                }
                break;
            }
            catch(Exception e){
                System.out.println("Graag een examen naam invoeren!");
            }
        }
        if (examen.getStudentGeslaagd(student)) {
            System.out.println(student.getNaam() + " is geslaagd voor " + examen.getNaam() + ".");
        } else {
            System.out.println(student.getNaam() + " is niet geslaagd voor " + examen.getNaam() + ".");
        }
        scanner.nextLine();
    }
    private static void studentExamenGehaald(Scanner scanner){
        scanner.nextLine();
        Gebruiker student = new Gebruiker();
        while (true) {
            try {
                System.out.println("Van welke student wil je na gaan welke examens hij/zij heeft gehaald?");
                String inputNaam = scanner.nextLine();
                for (int i = 0; i < Gebruiker.gebruikerslijst.size(); i++) {
                    if (inputNaam.equals(Gebruiker.gebruikerslijst.get(i).getNaam())) {
                        student = Gebruiker.gebruikerslijst.get(i);
                    }
                }
                break;
            }
            catch(Exception e){
                System.out.println("Graag een naam invoeren!");
                scanner.next();
            }
        }

        for (Examen examen : student.getBehaaldeExamens()) {
            System.out.println("- " + examen.getNaam());
        }
        scanner.nextLine();
    }
    private static void meesteExamensGehaald(){
        Gebruiker student = new Gebruiker();
        int meestBehaald = 0;
        for (int i = 0; i < Gebruiker.gebruikerslijst.size(); i++) {
            if (meestBehaald <= Gebruiker.gebruikerslijst.get(i).getBehaaldeExamens().size()) {
                student = Gebruiker.gebruikerslijst.get(i);
            }
        }
        System.out.println(student.getNaam() + " Heeft met " + student.getBehaaldeExamens().size() + " behaalde examens de meest behaalde examens.");
    }

    private static void gemCijferStudent(Scanner scanner) {
        scanner.nextLine();
        Gebruiker student = new Gebruiker();
        while (true) {
            try {
                System.out.println("Van welke student wil je na gaan wat zijn/haar gemiddelde cijfer is?");
                String inputNaam = scanner.nextLine();
                for (int i = 0; i < Gebruiker.gebruikerslijst.size(); i++) {
                    if (inputNaam.equals(Gebruiker.gebruikerslijst.get(i).getNaam())) {
                        student = Gebruiker.gebruikerslijst.get(i);
                    }
                }
                break;
            }
            catch(Exception e){
                System.out.println("Graag een naam invoeren!");
                scanner.next();
            }
        }
        System.out.println(student.getGemCijferStudent());
        scanner.nextLine();
    }
}