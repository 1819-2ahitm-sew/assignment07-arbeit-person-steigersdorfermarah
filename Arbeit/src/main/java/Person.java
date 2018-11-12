import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

abstract class Arbeitnehmer {


    public String beruf;
    public String arbeitGeber;
    private double stundenlohn;


    public String getBeruf() {
        return beruf;
    }

    public String getArbeitGeber() {
        return arbeitGeber;
    }

    public Arbeitnehmer() {
        this.beruf = "";
        this.arbeitGeber = "";
    }

    public Arbeitnehmer(String beruf, String arbeitGeber) {
        this.beruf = beruf;
        this.arbeitGeber = arbeitGeber;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String antwort;
        String beruf;
        String arbeitGeber;

        System.out.print("Beruf: ");
         beruf = scanner.nextLine();

        System.out.print("Arbeitgeber: ");
        arbeitGeber = scanner.nextLine();


        System.out.print("Arbeiter oder Angestellter? ");
        antwort = scanner.nextLine();

        antwort = antwort.toLowerCase();


            if (antwort.equals("arbeiter")) {


                System.out.print("Stundenlohn: ");
                double stundenlohn = scanner.nextDouble();

                double gehalt = gehaltBerechnen(stundenlohn);

                String ergebnisArbeiter = ausgabeArbeiter(beruf, arbeitGeber, stundenlohn, gehalt);
                System.out.println(ergebnisArbeiter);




            }else if (antwort.equals("angestellter")){


                double gehalt;

                System.out.print("Lohn: ");
                gehalt = scanner.nextDouble();


                String ergebnisAngestellter = ausgabeAngestellter(beruf, arbeitGeber, gehalt);
                System.out.println(ergebnisAngestellter);


            }


        }

    private static String ausgabeArbeiter(String beruf, String arbeitGeber, double stundenlohn, double gehalt) {
        return "Arbeiter: " + " Beruf: " + beruf + ", Arbeitgeber: " + arbeitGeber + ", Stundenlohn: "+ stundenlohn + ", Gehalt: " + gehalt;

    }

    private static String ausgabeAngestellter(String beruf, String arbeitGeber, double gehalt) {

        return "Arbeiter: " + " Beruf: " + beruf + ", Arbeitgeber: " + arbeitGeber + ", Gehalt: " + gehalt;
    }


    abstract String getEntgelt();

    private static double gehaltBerechnen(double stundenlohn) {

        double gehaltArbeiter = stundenlohn * 40;

    return gehaltArbeiter;
    }


    class Arbeiter extends Arbeitnehmer {

        public double stundenlohn;

        public double getStundenlohn() {
            return stundenlohn;
        }

        public Arbeiter(double stundenlohn) {
            this.stundenlohn = stundenlohn;

        }


        @Override
        public String getEntgelt() {
            return "Arbeiter: " + " Beruf: " + beruf + ", Arbeitgeber: " + arbeitGeber + ", Gehalt: " + Arbeitnehmer.gehaltBerechnen(stundenlohn);
        }


    }


    class Angestellter extends Arbeitnehmer{

        public double gehalt;

        public double getGehalt() {
            return gehalt;
        }

        public Angestellter(double gehalt) {
            this.gehalt = gehalt;

        }


        @Override
        public String getEntgelt() {
            return "Arbeiter: " + " Beruf: " + beruf + ", Arbeitgeber: " + arbeitGeber + ", Gehalt: " + gehalt;
        }






    }




}
