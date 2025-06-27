# Relationales Datenbanksystem

Ein relationales Datenbanksystem speichert Daten in **Tabellen**, die in Beziehung („Relation“) zueinander stehen.  
Jede Tabelle hat eine feste Struktur mit **Spalten** (Attribute) und **Zeilen** (Datensätze).

Beispieltabellen aus einem Warenwirtschaftssystem:

**Tabelle „Kunde“**

| KundenID | Nachname | Vorname | Ort     |
|----------|----------|---------|---------|
| A2749    | Müller   | Marlies | Görlitz |

**Tabelle „Artikel“**

| ArtikelID | Bezeichnung        | Verkaufspreis |
|-----------|--------------------|---------------|
| 56748     | Stoffbär Knuddel   | 14.90         |

**Tabelle „Verkauf“**

| VerkaufsID | Artikel | Kunde  | Verkaufsdatum |
|------------|---------|--------|----------------|
| 1029       | 56748   | A2749  | 2023-11-17     |

Die Beziehungen (Relationen) entstehen über sogenannte **Fremdschlüssel**:
- In der „Verkauf“-Tabelle sind „Artikel“ und „Kunde“ Fremdschlüssel.
- Sie verweisen auf die **ArtikelID** in der Artikeltabelle und die **KundenID** in der Kundentabelle.

### Beispiel-SQL:
Um den Namen der Kundin und die Artikelbezeichnung vom 17.11.2023 zu finden, könnte man schreiben:

```sql
SELECT Kunde.Vorname, Kunde.Nachname, Artikel.Bezeichnung
FROM Verkauf
JOIN Kunde ON Verkauf.Kunde = Kunde.KundenID
JOIN Artikel ON Verkauf.Artikel = Artikel.ArtikelID
WHERE Verkaufsdatum = '2023-11-17';
````

Ein relationales Datenbanksystem besteht also aus:

* einer **Datenbasis** (den Tabellen),
* einem **Datenbankmanagementsystem (DBMS)**, das die Daten verwaltet,
* und der Möglichkeit, Tabellen über **Relationen** zu verknüpfen.