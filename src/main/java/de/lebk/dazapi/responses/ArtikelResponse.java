package de.lebk.dazapi.responses;

public class ArtikelResponse {

    private int id;
    private String themenbereich;
    private String einfach;
    private String fortgeschritten;
    private String experte;

    public ArtikelResponse(int id, String themenbereich, String einfach, String fortgeschritten, String experte) {
        this.id = id;
        this.themenbereich = themenbereich;
        this.einfach = einfach;
        this.fortgeschritten = fortgeschritten;
        this.experte = experte;
    }

    public int getId() {
        return id;
    }

    public String getThemenbereich() {
        return themenbereich;
    }

    public String getEinfach() {
        return einfach;
    }

    public String getFortgeschritten() {
        return fortgeschritten;
    }

    public String getExperte() {
        return experte;
    }
}
