INSERT INTO mydb.themenbereich (titel)
VALUES ('Grundlagen');

INSERT INTO mydb.artikel (themenbereich_schl, titel, einfach, fortgeschritten, experte)
VALUES ((SELECT id FROM mydb.themenbereich WHERE titel = 'Grundlagen'),
        'Datenbanksysteme',
        'einfach.md',
        'mittel.md',
        'schwer.md'
        );
