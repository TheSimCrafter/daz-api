create table mydb.themenbereich
(
    id    int auto_increment
        primary key,
    titel text not null
);

create table mydb.artikel
(
    id                 int auto_increment
        primary key,
    themenbereich_schl int  null,
    titel              text not null,
    einfach            text null,
    fortgeschritten    text null,
    experte            text null,
    constraint themenbereich_fk
        foreign key (themenbereich_schl) references mydb.themenbereich (id)
);

