package de.lebk.dazapi.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "artikel")
public class Artikel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "themenbereich_schl")
    private Themenbereich themenbereichSchl;

    @Lob
    @Column(name = "titel", nullable = false)
    private String titel;

    @Lob
    @Column(name = "einfach")
    private String einfach;

    @Lob
    @Column(name = "fortgeschritten")
    private String fortgeschritten;

    @Lob
    @Column(name = "experte")
    private String experte;

    public Artikel(String titel, String einfach, String fortgeschritten, String experte, Themenbereich themenbereichSchl) {
        this.titel = titel;
        this.einfach = einfach;
        this.fortgeschritten = fortgeschritten;
        this.experte = experte;
        this.themenbereichSchl = themenbereichSchl;
    }

    public Artikel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Themenbereich getThemenbereichSchl() {
        return themenbereichSchl;
    }

    public void setThemenbereichSchl(Themenbereich themenbereichSchl) {
        this.themenbereichSchl = themenbereichSchl;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getEinfach() {
        return einfach;
    }

    public void setEinfach(String einfach) {
        this.einfach = einfach;
    }

    public String getFortgeschritten() {
        return fortgeschritten;
    }

    public void setFortgeschritten(String fortgeschritten) {
        this.fortgeschritten = fortgeschritten;
    }

    public String getExperte() {
        return experte;
    }

    public void setExperte(String experte) {
        this.experte = experte;
    }

}