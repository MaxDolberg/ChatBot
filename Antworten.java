public enum Antworten {
    HALLO("Wilkommen! Ich bin der ChatBot der SolutionGmbH. Wie kann ich dir behilflich sein?"),
    WEITERLEITUNG("Bei dieser Frage kann ich leider nicht weiterhelfen. Bitte kontaktieren Sie den Kundensupport unter folgender Nummer: 012 34567");

    private String antwort;
 
    Antworten(String reply) {
        this.antwort = reply;
    }
 
    public String getAntwort() {
        return antwort;
    }
}
