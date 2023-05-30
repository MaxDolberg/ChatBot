import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  //Erstellung eines neuen Scanner-Objektes
        System.out.println("Gib eine Frage ein: ");
        String input = reader.nextLine(); // Scannt den nächsten String
        reader.close();


        System.out.println(input); // Gibt den String wieder zurück
    }
}
