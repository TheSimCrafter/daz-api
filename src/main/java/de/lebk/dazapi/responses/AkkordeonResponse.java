package de.lebk.dazapi.responses;

public class AkkordeonResponse {
    private AkkordeonThemenbereichResponse[] themenbereich;

    public AkkordeonResponse(AkkordeonThemenbereichResponse[] themenbereich) {
        this.themenbereich = themenbereich;
    }

    public AkkordeonThemenbereichResponse[] getThemenbereich() {
        return themenbereich;
    }

    public void setThemenbereich(AkkordeonThemenbereichResponse[] themenbereich) {
        this.themenbereich = themenbereich;
    }
}
