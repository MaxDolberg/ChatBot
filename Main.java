import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Anlegen wichtiger Variablen
        Boolean running = true;
        Boolean drucker2 = false;
        Boolean bildschirm2 = false;
        String jaNein = "Hat Ihnen diese Antwort geholfen? \n 1 - Ja \n 2 - Nein";

        System.out.println(Antworten.HALLO.getAntwort());
        Scanner reader = new Scanner(System.in);  // Erstellung eines neuen Scanner-Objektes
        System.out.println("Gib eine Frage ein: ");

        // Erstelle eine Schleife, die läuft solange 'running' true ist
        while (running) {

            // Lese die nächste Eingabe aus und wandle sie in Kleinbuchstaben um
            String input = reader.nextLine();
            String message = input.toLowerCase();

            // Untersuchung der Nutzerantwort auf verschiedene Stichwörter
            if (message.contains("drucker")) {
                System.out.println(Antworten.DRUCKER.getAntwort());
                System.out.println(jaNein);
                drucker2 = true;

            } else if (message.contains("wlan")) {
                System.out.println(Antworten.WLAN.getAntwort());
                System.out.println(jaNein);

            } else if (message.contains("bildschirm") || message.contains("monitor")) {
                System.out.println(Antworten.BILDSCHIRM.getAntwort());
                System.out.println(jaNein);
                bildschirm2 = true;

            // Abfrage, ob der Nutzer mit Ja oder Nein auf die Fragen vom ChatBot antwortet
            } else if (message.equals("1") || message.equals("ja")) {
                System.out.println(Antworten.HELP.getAntwort());
                break;

            } else if (message.equals("2") || message.equals("nein")) {
                // Falls eine zweite Antwort verfügbar ist, wird sie hier abgerufen
                if (drucker2) {
                    System.out.println(Antworten.DRUCKER2.getAntwort());
                    drucker2 = false;
                    System.out.println(jaNein);
                    continue;
                }

                if (bildschirm2) {
                    System.out.println(Antworten.BILDSCHIRM2.getAntwort());
                    bildschirm2 = false;
                    System.out.println(jaNein);
                    continue;
                }

                System.out.println(Antworten.NO_HELP.getAntwort());
                break;

            // Stichwort zum Beenden des ChatBots
            } else if (message.contains("ende")) {
                reader.close();
                break;
                
            // Rückfall-Antwort, falls keines der Stichwörter greift
            } else {
                System.out.println(Antworten.WEITERLEITUNG.getAntwort());
                break;
            }
        }
    }
}
