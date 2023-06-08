import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Anlegen wichtiger Variablen
        Boolean running = true;
        Boolean drucker2 = false;
        Boolean bildschirm2 = false;
        Boolean tastatur2 = false;
        Boolean maus2 = false;
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

            } else if (message.contains("wlan") || message.contains("w-lan")) {
                System.out.println(Antworten.WLAN.getAntwort());
                System.out.println(jaNein);

            } else if (message.contains("mikrofon") || message.contains("mikro")) {
                System.out.println(Antworten.MIKROFON.getAntwort());
                System.out.println(jaNein);

            } else if (message.contains("ton") || message.contains("sound")) {
                System.out.println(Antworten.TON.getAntwort());
                System.out.println(jaNein);

            } else if (message.contains("computer") || message.contains("pc")) {
                System.out.println(Antworten.COMPUTER.getAntwort());
                System.out.println(jaNein);

            } else if (message.contains("lan")) {
                System.out.println(Antworten.LAN.getAntwort());
                System.out.println(jaNein);

            } else if (message.contains("bildschirm") || message.contains("monitor")) {
                System.out.println(Antworten.BILDSCHIRM.getAntwort());
                System.out.println(jaNein);
                bildschirm2 = true;

            } else if (message.contains("tastatur") || message.contains("keyboard")) {
                System.out.println(Antworten.TASTATUR.getAntwort());
                System.out.println(jaNein);
                tastatur2 = true;

            } else if (message.contains("maus") || message.contains("mouse")) {
                System.out.println(Antworten.MAUS.getAntwort());
                System.out.println(jaNein);
                maus2 = true;

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

                if (tastatur2) {
                    System.out.println(Antworten.TASTATUR2.getAntwort());
                    tastatur2 = false;
                    System.out.println(jaNein);
                    continue;
                }

                if (maus2) {
                    System.out.println(Antworten.MAUS2.getAntwort());
                    maus2 = false;
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
