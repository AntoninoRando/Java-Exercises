package Esercizio2;

public class AND extends Espressione {
    public AND(Espressione e1, Espressione e2) {
        super(e1, e2);

        StringBuilder sb = new StringBuilder();
        sb.append("(").append(e1.toString()).append(" & ").append(e2.toString()).append(")");
        rappresentazione = sb.toString();
    }

    protected boolean calcolaStato() {
        return eDestra.getValoreVerita() && eSinistra.getValoreVerita();
    }
}
