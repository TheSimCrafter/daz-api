package de.lebk.dazapi.responses;

import java.util.List;

public class AkkordeonResponse {
    private AkkordeonThemenbereichResponse[] themenbereich;

    public AkkordeonResponse(AkkordeonThemenbereichResponse[] themenbereich) {
        this.themenbereich = themenbereich;
    }

    public AkkordeonResponse(List<AkkordeonThemenbereichResponse> themenbereich) {
        this.themenbereich = themenbereich.toArray(new AkkordeonThemenbereichResponse[0]);
    }

    public AkkordeonThemenbereichResponse[] getThemenbereich() {
        return themenbereich;
    }

    public void setThemenbereich(AkkordeonThemenbereichResponse[] themenbereich) {
        this.themenbereich = themenbereich;
    }
}
