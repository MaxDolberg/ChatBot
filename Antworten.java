public enum Antworten {
    // Antworten, auf die der ChatBot zurückgreifen kann
    HALLO("Wilkommen! Ich bin der ChatBot der Solution GmbH. Wie kann ich Ihnen behilflich sein?"),
    DRUCKER("Bitte überprüfen Sie zuerst, ob Sie den richtigen Drucker als Gerät ausgewählt haben. Manchmal können sich solche Einstellungen durch Updates verändern."),
    DRUCKER2("Falls das nicht geholfen hat, dann schauen Sie bitte nach, ob noch genug Tinte und Papier verfügbar sind. Manchmal geben Drucker keine Meldung aus, obwohl Sie leer sind."),
    WLAN("Wenn Sie Probleme mit dem WLAN haben, versuchen Sie, den Router für 10 Minuten vom Strom zu nehmen. Schließen Sie ihn danach wieder an und warten weiter 10 Minuten, bis er wieder vollständig läuft."),
    HELP("Es freut mich, dass ich Ihnen helfen konnte. Ich wünsche einen guten Tag."),
    NO_HELP("Es tut mir leid, dass ich Ihnen nicht weiterhelfen konnte. Bitte kontaktieren Sie den Kundensupport unter folgender Nummer: 012 3456789"),
    WEITERLEITUNG("Bei dieser Frage kann ich leider nicht weiterhelfen. Bitte kontaktieren Sie den Kundensupport unter folgender Nummer: 012 3456789"),
    BILDSCHIRM("Wenn Sie ein Problem mit Ihrem Bildschirm haben, sollten Sie am besten Ihren Monitor vom PC trennen und erneut anschließen."),
    BILDSCHIRM2("Da die erste Lösung nicht geholfen hat, ziehen Sie den Stromstecker vom Monitor raus und warten Sie 10 Sekunden. Danach stecken Sie ihn bitte wieder ein und probieren es erneut.");
    TASTATUR("Wenn Sie ein Problem mit Ihrer Tastatur haben, entfernen Sie die Tastatur einmal von Ihrem PC für einige Zeit und schließen Sie die Tastatur erneut an"),
    TASTATUR2("Falls das nicht geholfen hat überprüfen sie ob Ihre Tastatur eine Baterrie benötigt und ob sie eingeschaltet ist."),
    MAUS("Wenn Sie ein Problem mit Ihrer Maus haben, entfernen Sie die Maus einmal von Ihrem PC für einige Zeit und schließen Sie die Maus erneut an"),
    MAUS2("Falls das nicht geholfen hat überprüfen sie ob Ihre Maus eine Baterrie benötigt und ob sie eingeschaltet ist."),

    private String antwort;
 
    Antworten(String reply) {
        this.antwort = reply;
    }
 
    public String getAntwort() {
        return antwort;
    }

}
