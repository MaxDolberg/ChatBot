public enum Antworten {
    HALLO("Wilkommen! Ich bin der ChatBot der SolutionGmbH. Wie kann ich dir behilflich sein?"),
    WLAN("Wenn Sie Probleme mit dem WLAN haben, versuchen Sie den Router für 10 Minuten vom Strom zu nehmen."),
    WEITERLEITUNG("Bei dieser Frage kann ich leider nicht weiterhelfen. Bitte kontaktieren Sie den Kundensupport unter folgender Nummer: 012 34567");

    private String antwort;
 
    Antworten(String reply) {
        this.antwort = reply;
    }
 
    public String getAntwort() {
        return antwort;
    }
}
