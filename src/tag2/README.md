# Tag 2: Java-Grundlagen interaktiv

Dieser Ordner ist ein kompletter Lernpfad: Jede nummerierte Java-Datei behandelt ein
Thema, zeigt ein kleines Beispiel und endet mit einer Frage oder einem Mini-Quiz.
Die Antworten stehen absichtlich nur in `Loesungen_Tag2.md`.

## Reihenfolge
1. `Tag2_01_Rechenoperatoren.java` - `+`, `-`, `*`, `/`, `%`
2. `Tag2_02_VergleichsoperatorenUndLogik.java` - Vergleichsoperatoren
3. `Tag2_03_IfElseElseIf.java` - Entscheidungen
4. `Tag2_04_SwitchBeispiele.java` - feste Auswahl
5. `Tag2_05_BenutzereingabenScanner.java` - `Scanner` und Eingaben
6. `Tag2_09_Zuweisungsoperatoren.java` - `=`, `+=`, `-=`, `*=`, `/=`, `%=`
7. `Tag2_10_InkrementDekrement.java` - `++` und `--`
8. `Tag2_11_BoolscheAusdruecke.java` - Wahrheitswerte und Logik
9. `Tag2_12_OperatorPrioritaet.java` - Reihenfolge und Klammern
10. `Tag2_03_IfElseElseIf.java` - `if`, `else if`, `else`
11. `Tag2_14_VerschachtelteBedingungen.java` - Bedingungen in Bedingungen
12. `Tag2_04_SwitchBeispiele.java` - `switch`, `case`, `break`, `default`
13. `Tag2_16_Schleifen.java` - Schleifenkonzepte, `while`, `do-while`, `for`
14. `Tag2_17_VerschachtelteSchleifen.java` - Schleifen in Schleifen
15. `Tag2_18_BreakContinue.java` - `break` und `continue`
16. `Tag2_19_Methoden.java` - Aufruf, Parameter, Argumente, `return`, `void`
17. `Tag2_20_Scope.java` - lokale Variablen und Sichtbarkeit
18. `Tag2_21_MethodOverloading.java` - ueberladene Methoden

Die Dateien 06-08 sowie `Tag2_07_InteraktiverOperatorTrainer.java` und
`Tag2_08_SelberAendern.java` bleiben als Wiederholung und Projektaufgaben erhalten.

## Starten

```powershell
javac -d out\tag2 src\tag2\*.java
java -cp out\tag2 tag2.Tag2Runner
```

Der Runner bietet alle Beispiele ueber ein Menue an. Fuer den Unterricht koennen
Schueler zuerst selbst antworten und danach gemeinsam die jeweilige Loesung lesen.
