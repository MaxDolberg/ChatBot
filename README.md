# ChatBot
Programmierung eines ChatBots für Lernfeld 6
In dieser README dokumentieren wir wichtige Infos zum ChatBot.
Dieses Projekt wurde erstellt von Manuel Seehausen, Marko Blatnjak, Maximilian Meyer und Maximilian Dolberg.

Funktionen des ChatBots:

Der ChatBot liest eine Ausgabe vom Terminal aus und überprüft, ob der Text bestimmte Stichworte enthält.
Wenn ein Wort erkannt wird, ruft der Bot die dazugehörige Nachricht aus Antworten.java auf und gibt diese 
zurück.
Danach fragt der Bot, ob die Antwort hilfreich war. Wenn die Antwort als hilfreich bewertet wurde, 
verabschiedet sich der Bot.
Sollte die Antwort als nicht hilfreich bewertet werden, dann gibt der Bot einen alternativen 
Lösungsvorschlag. Falls es keine alternativen Lösungen gitb, wird dem Nutzer die Telefonnummer des 
Kundensupports gegeben.

Alle Antworten des Nutzers werden vor der Prüfung auf Stichwörter zu Kleinbuchstaben konvertiert.
Wenn also eine neue Anfrage implementiert werden soll, dann muss das Stichwort, auf das der Bot reagieren 
soll, klein geschrieben werden.

Über das Stichwort "ende" lässt sich der Bot aktuell beenden.