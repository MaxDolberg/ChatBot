public enum Antworten {
    // Antworten, auf die der ChatBot zurückgreifen kann
    HALLO("Wilkommen! Ich bin der ChatBot der Solution GmbH. Wie kann ich Ihnen behilflich sein?"),
    WLAN("Wenn Sie Probleme mit dem WLAN haben, versuchen Sie den Router für 10 Minuten vom Strom zu nehmen."),
    HELP("Es freut mich, dass ich Ihnen helfen konnte. Ich wünsche einen guten Tag."),
    NO_HELP("Es tut mir leid, dass ich Ihnen nicht weiterhelfen konnte. Bitte kontaktieren Sie den Kundensupport unter folgender Nummer: 012 3456789"),
    WEITERLEITUNG("Bei dieser Frage kann ich leider nicht weiterhelfen. Bitte kontaktieren Sie den Kundensupport unter folgender Nummer: 012 3456789"),
    TEST("Test1"),
    BILDSCHIRM("Wenn Sie ein Problem mit Ihrem Bildschirm haben, sollten Sie am besten Ihren Monitor vom PC trennen und erneut anschließen.");
    
    private String antwort;
 
    Antworten(String reply) {
        this.antwort = reply;
    }
 
    public String getAntwort() {
        return antwort;
    }

}
