import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

abstract class Person {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String antwort;
        String vorname;
        String nachname;
        String schule;
        String universitaet;
        String studienfach;
        String klasse;
        int matrikelNr;
        int katalogNr;


        System.out.print("Vorname: ");
        vorname = scanner.nextLine();
        System.out.print("Nachname: ");
        nachname = scanner.nextLine();


        System.out.print("Schueler oder Student?: ");
        antwort = scanner.nextLine();

        antwort = antwort.toLowerCase();



        if (antwort.equals("schueler")) {

            System.out.print("Name der Schule: ");
            schule = scanner.nextLine();
            System.out.print("Klasse: ");
            klasse = scanner.nextLine();
            System.out.print("KatalogNr: ");
            katalogNr = scanner.nextInt();


            String ergebnisSchueler = ausgabeSchueler(vorname,nachname, katalogNr,schule,klasse);
            System.out.println(ergebnisSchueler);

        } else if (antwort.equals("student")) {

            System.out.print("Name der Universitaet: ");
            universitaet = scanner.nextLine();
            System.out.print("MatrikelNr: ");
            matrikelNr = scanner.nextInt();
            System.out.print("Studienfach: ");
            studienfach = scanner.nextLine();

            String ergebnisStudent = ausgabeStudent(vorname, nachname, universitaet, matrikelNr, studienfach);
            System.out.println(ergebnisStudent);

        }

        class Schueler extends Person {

            public String schule;
            public String klasse;
            public int katalogNr;


            public Schueler(String schule, String klasse) {
                this.schule = schule;
                this.klasse = klasse;

            }

            @Override
            public String toString() {

                return "Schueler: " + vorname + " " + nachname +
                        ", Schule: " + schule + ", katalogNr: " + katalogNr + ", Klasse: " + klasse;
            }

        }
        class Student extends Person {

            public String universitaet;
            public String matrikelNr;
            public String studienfach;


            public Student(String universitaet, String studienfach) {
                this.universitaet = universitaet;
                this.studienfach = studienfach;
            }

            @Override
            public String toString() {
                return "Student: " + vorname + " " + nachname +
                        ", Universitaet: " + universitaet + ", MatrikelNr: " + matrikelNr + ", Studienfach: " + studienfach;
            }
        }



    }

    private static String ausgabeSchueler(String vorname, String nachname, int katalogNr,String schule, String klasse) {

    return "Schueler: " + vorname + " " +nachname + ", Schule: " + schule + ", KatalogNr: "+ katalogNr + ", Klasse: " + klasse ;
    }

    private static String ausgabeStudent(String vorname, String nachname, String universitaet, int matrikelNr, String studienfach) {

    return "Schueler: " + vorname + " " +nachname + ", Universitaet: " + universitaet + ", MatrikelNr: "+ matrikelNr + ", Studienfach: " + studienfach ;
    }





    public String vorname;
    public String nachname;


    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Person(){
        this.vorname = "";
        this.nachname = "";
    }

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return this.vorname + " " + this.nachname;
    }







}


