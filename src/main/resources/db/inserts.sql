INSERT INTO mydb.themenbereich (titel)
VALUES ('Grundlagen');

INSERT INTO mydb.artikel (themenbereich_schl, titel, einfach, fortgeschritten, experte)
VALUES ((SELECT id FROM mydb.themenbereich WHERE titel = 'Grundlagen'),
               'Datenbanksysteme',
               '## 🟨 1. Sehr einfache Erklärung (Anfänger)\n\n### 🟦 Deutsch\nEin **Datenbanksystem** hilft dem Computer, viele Informationen gut zu speichern und schnell wiederzufinden.\n\nMan kann sich das so vorstellen:\n\n- Die **Datenbank** ist wie ein Notizbuch, in dem alles aufgeschrieben wird – zum Beispiel Namen von Kunden oder Produkte.  \n- Das **Programm**, das die Datenbank steuert, hilft dabei, in diesem Notizbuch etwas zu suchen, etwas Neues aufzuschreiben oder etwas zu ändern.\n\nSo ein System benutzen z. B. Supermärkte, um zu wissen, welche Produkte sie verkaufen und wie viele noch da sind.',
        '## 🟨 2. Mittlere Erklärung (Alltagssprache)\n\n### 🟦 Deutsch\nEin **Datenbanksystem** ist ein Computerprogramm, das dabei hilft, viele Daten übersichtlich zu speichern, zu ordnen und wiederzufinden.\n\nEs besteht aus zwei Teilen:\n\n1. **Datenbank**:  \n   Das ist wie ein großer Schrank, in dem alle Daten aufbewahrt werden – zum Beispiel Namen, Adressen oder Artikel.\n\n2. **Datenbankprogramm (DBMS)**:  \n   Das ist die Software, die den Schrank verwaltet. Sie sorgt dafür, dass man Daten leicht finden, ändern, hinzufügen oder löschen kann – und dass dabei nichts durcheinandergerät.\n\nSo ein System wird zum Beispiel in Supermärkten, Banken oder Behörden verwendet, um viele Informationen gut zu verwalten.',
        '## 🟨 3. Ausführliche Erklärung (formell, technisch)\n\n### 🟦 Deutsch\nEin **Datenbanksystem** ist ein System zur elektronischen Verwaltung von Daten. Es besteht aus zwei Hauptkomponenten:\n\n1. **Datenbasis (Datenbank)**  \n   Die Datenbasis ist der eigentliche Speicherort der Daten. Hier werden die Informationen in strukturierter Form (z. B. Tabellen) abgelegt. Diese Daten können z. B. Kundendaten, Bestellungen oder Artikelinformationen sein.\n\n2. **Datenbankmanagementsystem (DBMS)**  \n   Das DBMS ist die Software, die den Zugriff auf die Daten organisiert, steuert und absichert. Es sorgt dafür, dass mehrere Benutzer gleichzeitig arbeiten können, dass nur berechtigte Nutzer auf bestimmte Daten zugreifen dürfen, und dass Daten konsistent und fehlerfrei bleiben.\n\nZusammen bilden die Datenbasis und das Datenbankmanagementsystem ein vollständiges **Datenbanksystem**.\n\nEin Beispiel aus dem Alltag: Wenn du in einem Online-Shop nach einem Produkt suchst, greift die Website im Hintergrund auf ein Datenbanksystem zu, das die Produktinformationen verwaltet.'
        );


INSERT INTO mydb.artikel (themenbereich_schl, titel, einfach, fortgeschritten, experte)
VALUES ((SELECT id FROM mydb.themenbereich WHERE titel = 'Grundlagen'),
        'Datenbanksysteme',
        'einfach.md',
        'mittel.md',
        'schwer.md'
        );
