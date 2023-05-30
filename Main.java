import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Antworten.HALLO.getAntwort());
        Scanner reader = new Scanner(System.in);  //Erstellung eines neuen Scanner-Objektes
        System.out.println("Gib eine Frage ein: ");
        String input = reader.nextLine(); // Scannt den nächsten String
        reader.close();

        if (input.contains("Hilfe")) { // Suche in der Frage nach diesem Wort
            System.out.println("Ich versuche zu helfen.");
        } else {
            System.out.println(Antworten.WEITERLEITUNG.getAntwort());
        }
    }
}
