# Relationales Datenbanksystem

Ein relationales Datenbanksystem besteht aus mehreren **Tabellen**.  
Jede Tabelle enthält Daten zu einem bestimmten Thema. Zum Beispiel:
- Kunden
- Produkte
- Verkäufe

Die Tabellen sehen aus wie in Excel: mit **Spalten** (z. B. Name, Ort) und **Zeilen** (jede Zeile ist ein Datensatz).

Beispiel:  
**Tabelle „Kunde“**

| KundenID | Nachname | Vorname | Ort     |
|----------|----------|---------|---------|
| A7890    | Meier    | Peter   | Köln    |
| A2749    | Müller   | Marlies | Görlitz |

Wichtig:
- Jede Tabelle hat einen **Schlüssel** (z. B. KundenID).
- Über diesen Schlüssel kann man Tabellen verbinden.

**Relationale Datenbanken** heißen so, weil sie mit „**Relationen**“ arbeiten.  
Relationen sind Verbindungen zwischen Tabellen.  

Zum Beispiel:
- Eine Kundin kauft ein Produkt.
- Diese Info steht in einer dritten Tabelle (z. B. „Verkauf“).
- Dort steht: Kunde A2749 hat Produkt 56748 gekauft.