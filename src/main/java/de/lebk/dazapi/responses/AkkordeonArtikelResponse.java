package de.lebk.dazapi.responses;

public class AkkordeonArtikelResponse {

    private int id;
    private String titel;

    public AkkordeonArtikelResponse(int id, String titel) {
        this.id = id;
        this.titel = titel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
