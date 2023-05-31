import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Anlegen wichtiger Variablen
        Boolean running = true;

        System.out.println(Antworten.HALLO.getAntwort());
        Scanner reader = new Scanner(System.in);  // Erstellung eines neuen Scanner-Objektes
        System.out.println("Gib eine Frage ein: ");

        while (running) {

            String input = reader.nextLine(); // Scannt den nächsten String
            String message = input.toLowerCase();

            if (message.contains("hilfe")) { // Suche in der Frage nach diesem Wort
                System.out.println("Ich versuche zu helfen.");
            } else if (message.contains("wlan")) {
                System.out.println(Antworten.WLAN.getAntwort());
            } else if (message.contains("ende")) {
                reader.close();
                break;
            } else {
                System.out.println(Antworten.WEITERLEITUNG.getAntwort());
            }
        }
    }
}
