package Esercizio2;

public class NOT extends Espressione {
    public NOT(Espressione e) {
        super(e);
        
        StringBuilder sb = new StringBuilder();
        sb.append("!(").append(e.toString()).append(")");
        rappresentazione = sb.toString();
    }

    protected boolean calcolaStato() {
        return !eDestra.getValoreVerita();
    }

}
