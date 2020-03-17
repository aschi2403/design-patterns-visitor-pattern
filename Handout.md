# Visitor Pattern

Ziel des Visitor Patterns ist es Daten verändern zu können ohne die eigentliche Datenklasse zu verändern. Das Visitor Pattern ist also für die Wartbarkeit und einfache Funktionserweiterung von Programmen wichtig. Ein Programm wird auch ohne Verwendung des Visitor Patterns gut funktionieren. Wie wichtig das Patterns ist zeigt sich erst später wenn unerwartete Funktionserweiterungen am Programm notwending sind.

## Worum geht es?
Nehmen wir an wir haben möchten ein System für eine Bank erstellen, welches Kreditkarten verwaltet. Die Bank hat sowohl Visa als auch Mastercard Kreditkarten. Von beiden gibt es jeweils noch verschiedene Modelle wie z.B. Classic und Gold. Die Kreditkarten nehmen an einem Cashbacksystem teil. Die Cashbackaktion unterscheidet zwischen verschiedenen Einsatzgebieten so wird das Cashback an einer Tankstelle anders berechnet als jenes eines Hotels.

## Eine typische Lösung ohne Anwendung des Visitor Patterns