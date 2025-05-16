package de.lebk.dazapi.responses;

public class AkkordeonThemenbereichResponse {
    private int id;
    private String titel;
    private AkkordeonArtikelResponse[] artikel;

    public AkkordeonThemenbereichResponse(int id, String titel, AkkordeonArtikelResponse[] artikel) {
        this.id = id;
        this.titel = titel;
        this.artikel = artikel;
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

    public AkkordeonArtikelResponse[] getArtikel() {
        return artikel;
    }

    public void setArtikel(AkkordeonArtikelResponse[] artikel) {
        this.artikel = artikel;
    }
}
