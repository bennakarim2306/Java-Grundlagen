# Tag 1 - Java Grundlagen

## Lernziele
- Ein Java-Programm starten und ausfuehren
- Grundstruktur eines Programms verstehen
- Kommentare, Syntax und Variablen anwenden
- Primitive Datentypen von `String` unterscheiden
- Einfache Konsolenausgabe nutzen

## 1) Hello World
Die Klasse `HelloWorld` zeigt das kleinste sinnvolle Programm:
- `class` definiert eine Klasse
- `main` ist der Einstiegspunkt
- `System.out.println(...)` schreibt Text in die Konsole

## 2) Programmstruktur
Wichtige Bausteine:
- `package tag1;` ordnet Klassen einem Paket zu
- `public class ...` ist der Klassenkopf
- `{ ... }` begrenzt Code-Bloecke
- `;` beendet Anweisungen

## 3) Kommentare
- Einzeilig: `// Kommentar`
- Mehrzeilig:
  ```java
  /*
   * Kommentar ueber mehrere Zeilen
   */
  ```
Kommentare helfen Menschen, nicht dem Compiler.

## 4) Variablen und Datentypen
Allgemeine Form:
```java
Datentyp name = wert;
```
Beispiele:
- `int alter = 24;`
- `double preis = 19.99;`
- `boolean aktiv = true;`
- `char buchstabe = 'A';`

## 5) Primitive Datentypen
- Ganze Zahlen: `byte`, `short`, `int`, `long`
- Kommazahlen: `float`, `double`
- Zeichen: `char`
- Wahrheitswerte: `boolean`

## 6) String
`String` speichert Text und ist **kein** primitiver Datentyp.

```java
String name = "Ben";
```

## 7) Einfache Ausgabe
- `System.out.print(...)` ohne Zeilenumbruch
- `System.out.println(...)` mit Zeilenumbruch
- `System.out.printf(...)` formatierte Ausgabe

Beispiel:
```java
System.out.printf("%s ist %d Jahre alt.%n", name, alter);
```

