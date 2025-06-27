# Datenbankmodelle

Datenbankmodelle bestimmen, wie Daten strukturiert und gespeichert werden. Drei zentrale Datenbankmodelle sind:

### 1. Hierarchisches Datenmodell
- Daten werden in einer **Baumstruktur** gespeichert.
- Jeder Datensatz kann genau einen übergeordneten Datensatz haben (Parent-Child-Beziehung).
- Vorteil: Sehr schnell bei fest definierten, hierarchischen Daten.
- Nachteil: Wenig flexibel, bei Änderungen aufwendig.
- Beispiel: 
  - Eine Firma (Root)
    - Abteilung 1
      - Mitarbeiter A
      - Mitarbeiter B

### 2. Objektorientiertes Datenmodell
- Daten sind als **Objekte** organisiert, ähnlich wie in objektorientierten Programmiersprachen.
- Objekte enthalten sowohl Daten (Attribute) als auch Verhalten (Methoden).
- Unterstützt Vererbung und Kapselung.
- Vorteil: Gute Verbindung zur Softwareentwicklung.
- Nachteil: Komplexer als relationale Datenbanken.

### 3. Relationales Datenmodell
- Daten werden in **normalisierten Tabellen** gespeichert.
- Jede Tabelle entspricht einer Entität (z. B. Kunde, Artikel).
- Verbindungen zwischen Tabellen entstehen durch Primär- und Fremdschlüssel.
- Vorteil: Flexibel, leistungsfähig, weit verbreitet.
- Beispiel: Kundendaten, Artikel und Verkäufe in separaten, aber verknüpften Tabellen.

Das relationale Modell ist heute am häufigsten im Einsatz, da es gut mit **SQL** kombiniert werden kann und sich für viele Anwendungsbereiche eignet.
