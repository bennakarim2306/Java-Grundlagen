# Gesamtstoff: Java-Grundlagen Tag 2

## 1. Rechnen und Werte veraendern

Arithmetische Operatoren sind `+`, `-`, `*`, `/` und `%`. Bei `int` liefert `/`
eine Ganzzahldivision: `10 / 3` ist `3`; `%` liefert den Rest, also `10 % 3` ist
`1`. Mit `=`, `+=`, `-=`, `*=`, `/=` und `%=` werden Variablen Werte zugewiesen.
`counter++` erhoeht einen Wert um eins, `counter--` verringert ihn um eins.

## 2. Vergleichen und logisch denken

Vergleichsoperatoren liefern immer `true` oder `false`: `==`, `!=`, `>`, `<`, `>=`
und `<=`. Boolesche Ausdruecke koennen mit `&&` (beide wahr), `||` (mindestens
einer wahr) und `!` (Umkehrung) verbunden werden.

## 3. Operator-Prioritaet

Wie in der Mathematik kommen `*`, `/` und `%` vor `+` und `-`. Klammern machen
die Absicht deutlich: `2 + 3 * 4` ist `14`, `(2 + 3) * 4` ist `20`.

## 4. Benutzereingaben

```java
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int alter = Integer.parseInt(scanner.nextLine());
```

`nextLine()` liest Text. Zahlen werden hier bewusst mit `Integer.parseInt`
umgewandelt, damit ungültige Eingaben mit einer verständlichen Meldung behandelt
werden können.

## 5. Entscheidungen

```java
if (temperatur < 0) {
    System.out.println("Frost");
} else if (temperatur < 20) {
    System.out.println("Kuehl");
} else {
    System.out.println("Warm");
}
```

Eine verschachtelte Bedingung ist eine `if`-Struktur innerhalb einer anderen.
`switch` ist oft übersichtlicher, wenn eine Variable mit festen Werten verglichen
wird. Das Beispiel dazu ist `Tag2_04_SwitchBeispiele`. `break` beendet den
passenden `case`; `default` behandelt unbekannte Werte.

## 6. Schleifen

Eine Schleife wiederholt Code, solange eine Bedingung gilt. `while` prüft vor dem
Durchlauf, `do-while` danach und läuft daher mindestens einmal. `for` bündelt
Startwert, Bedingung und Schritt und eignet sich gut für Schleifenzähler.
Verschachtelte Schleifen erzeugen zum Beispiel Tabellen oder Muster. `break`
beendet die Schleife sofort, `continue` überspringt nur den aktuellen Durchlauf.

## 7. Methoden

Methoden teilen Programme in verständliche Aufgaben:

```java
static int addiere(int a, int b) {
    return a + b;
}

int ergebnis = addiere(2, 3);
```

`a` und `b` sind Parameter; `2` und `3` sind Argumente beim Aufruf. Der
Rückgabetyp `int` sagt, dass ein Wert zurückkommt. `return` liefert ihn zurück.
Eine `void`-Methode liefert keinen Wert.

## 8. Lokale Variablen, Scope und Overloading

Eine lokale Variable ist nur in ihrer Methode oder ihrem Block sichtbar. Dieser
Bereich heißt Scope. Methoden können außerdem denselben Namen tragen, wenn sich
ihre Parameterlisten unterscheiden. Das nennt man Method Overloading.

## Lernweg

Starte `Tag2Runner`, bearbeite jede Frage ohne `Loesungen_Tag2.md` und ändere
anschließend die Beispiele. Die Dateien `MiniChallenges_Tag2.md` und
`Quiz_Tag2.md` eignen sich für Partnerarbeit oder Hausaufgaben.
