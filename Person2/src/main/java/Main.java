//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        final String FILENAME = "personen.csv";
//
//        //Zähle die Zeilen in der Datei
//        int zeilenAnzahl = countLinesOfFile(FILENAME) - 1;
//
//        //Erstelle das Array
//        Person [] personen = new Person[zeilenAnzahl];
//
//
//        readFile(FILENAME, personen);
//
//        for (int i = 0; i < personen.length; i++) {
//            System.out.println(personen[i].getVorname() + " " + personen[i].getNachname());
//        }
//
//    }
//
//
//    private static void readFile(String fileName, Person[] liste){
//
//
//
//        try (Scanner scanner = new Scanner(new FileReader(fileName))){
//            scanner.nextLine();
//            int i = 0;
//            while (scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                String [] elements = line.split(";");
//                String vorname = elements[0];
//                String nachname = elements[1];
//                Person person = new Person(vorname, nachname);
//                liste[i] = person;
//                i++;
//
//            }
//
//
//        } catch (FileNotFoundException e){
//           System.err.println(e.getMessage());
//        }
//
//
//    }
//
//    private static int countLinesOfFile(String filename){
//        int counter = 0;
//
//        try(Scanner scanner = new Scanner(new FileReader(filename))){
//
//            while (scanner.hasNextLine()){
//                counter++;
//                scanner.nextLine();
//
//            }
//
//        } catch (FileNotFoundException e) {
//            System.err.println(e.getMessage());
//        }
//
//        return counter;
//    }
//}
//
//
