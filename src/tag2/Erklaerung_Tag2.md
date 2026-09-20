# Tag 2 - Programme beginnen zu denken

Heute treffen Programme Entscheidungen auf Basis von Daten. Das ist der Schritt von "nur ausgeben" zu "logisch handeln".

## Lernziele
- Rechenoperatoren sicher anwenden
- Vergleiche und boolesche Logik verstehen
- Bedingungen mit `if`, `else if`, `else` schreiben
- Mehrere Faelle mit `switch` abbilden
- Benutzereingaben mit `Scanner` verarbeiten
- Ein eigenes Mini-Entscheidungsprogramm bauen

## 1) Rechenoperatoren
```java
+  -  *  /  %
```

Beispiel:
```java
int a = 10;
int b = 5;
System.out.println(a + b); // 15
System.out.println(a * b); // 50
```

## 2) Vergleichsoperatoren
```java
==  !=  >  <  >=  <=
```

Beispiele:
```java
age >= 18
age == 18
age != 20
```

## 3) Logische Operatoren
- `&&` (UND): beide Bedingungen sind wahr
- `||` (ODER): mindestens eine Bedingung ist wahr
- `!` (NICHT): kehrt den Wahrheitswert um

## 4) if / else if / else
```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

## 5) switch
`switch` ist sinnvoll, wenn eine Variable mehrere feste Werte annehmen kann.

## 6) Scanner
Mit `Scanner` liest du Eingaben aus der Konsole ein:
```java
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int age = Integer.parseInt(scanner.nextLine());
```

## 7) Erfolgserlebnis am Ende
Das Abschlussprogramm liest ein Alter ein und gibt `Adult` oder `Minor` aus.

Das ist wichtig: Du kombinierst Variablen, Vergleiche und Bedingungen zu einer echten Funktion.

