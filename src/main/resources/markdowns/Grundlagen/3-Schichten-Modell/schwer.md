# 3-Schichten-Modell

Das **ANSI-3-Schichten-Modell** ist ein Standardmodell zur Beschreibung von Datenbanksystemen. Es unterteilt eine Datenbankarchitektur in drei Schichten, die unabhängig voneinander sind. Dadurch wird Flexibilität, Sicherheit und Wartbarkeit erhöht.

### 1. Externe Schicht (Benutzersichten)
- Diese Schicht stellt individuelle **Sichten auf die Daten** bereit.
- Verschiedene Benutzer sehen unterschiedliche Ausschnitte der Datenbank.
- Beispiel: Eine Person aus der Buchhaltung sieht Umsatzdaten, nicht aber Kundendetails.

### 2. Konzeptuelle Schicht (logisches Datenmodell)
- Beschreibt **die komplette logische Struktur der Datenbank**.
- Hier werden alle Entitäten, Attribute und Beziehungen definiert.
- Beispiel: Die Entität „Kunde“ mit den Attributen KundenID, Name, Ort.

### 3. Interne Schicht (physisches Datenmodell)
- Beschreibt **die physische Speicherung** der Daten.
- Beinhaltet Informationen zu Speicherorten, Zugriffswegen, Indizes usw.
- Beispiel: Ob Daten auf einer lokalen Festplatte oder in der Cloud gespeichert werden.

**Vorteil des Modells:**  
- Die Trennung der Ebenen ermöglicht es, die Technik zu ändern (z. B. Speicherort), ohne die Benutzeroberfläche zu verändern.  
- Auch neue Benutzerrollen lassen sich einführen, ohne die Struktur der Datenbank selbst anzupassen.
