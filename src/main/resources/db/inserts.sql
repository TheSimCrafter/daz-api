INSERT INTO mydb.themenbereich (titel)
VALUES ('Grundlagen');

INSERT INTO mydb.artikel (themenbereich_schl, titel, einfach, fortgeschritten, experte)
VALUES ((SELECT id FROM mydb.themenbereich WHERE titel = 'Grundlagen'),
        '3-Schichten-Modell',
        'einfach.md',
        'mittel.md',
        'schwer.md'
        );

INSERT INTO mydb.artikel (themenbereich_schl, titel, einfach, fortgeschritten, experte)
VALUES ((SELECT id FROM mydb.themenbereich WHERE titel = 'Grundlagen'),
        'Datenbankmodelle',
        'einfach.md',
        'mittel.md',
        'schwer.md'
       );

INSERT INTO mydb.artikel (themenbereich_schl, titel, einfach, fortgeschritten, experte)
VALUES ((SELECT id FROM mydb.themenbereich WHERE titel = 'Grundlagen'),
        'relationale Datenbanken',
        'einfach.md',
        'mittel.md',
        'schwer.md'
       );