# 3-Schichten-Modell

Das **3-Schichten-Modell** (auch ANSI-Architektur genannt) zeigt, wie eine Datenbank aufgebaut ist. Es gibt drei Ebenen:

### 1. Externe Schicht (Benutzersicht)
- Benutzer sehen nur die Daten, die sie brauchen.
- Beispiel: Ein Mitarbeiter im Verkauf sieht nur Kundendaten.

### 2. Logische Schicht (konzeptuelle Sicht)
- Diese Ebene beschreibt die Struktur der gesamten Datenbank.
- Hier steht: Welche Tabellen gibt es? Welche Felder? Welche Beziehungen?
- Beispiel: Tabelle „Kunde“ mit den Feldern Name, Adresse, Kundennummer.

### 3. Interne Schicht (physische Sicht)
- Hier wird gespeichert, wie und wo die Daten technisch liegen.
- Beispiel: Daten werden auf einem Server oder in einer Cloud gespeichert.

**Vorteil:** Änderungen auf einer Schicht beeinflussen die anderen Schichten nicht direkt.
