package EspressioniDiVerita;

public class OR extends Espressione {
    public OR(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
    }

    public ValoreVerita getValoreVerita() {
        boolean risultato = eDestra.getValoreVerita().toBoolean() || eSinistra.getValoreVerita().toBoolean();
        return ValoreVerita.fromBoolean(risultato);
    }

    public String getRappresentazione() {
        StringBuilder rappresentazione = new StringBuilder();
        
        rappresentazione.append("(");
        rappresentazione.append(eDestra.getRappresentazione());
        rappresentazione.append(" || ");
        rappresentazione.append(eSinistra.getRappresentazione());
        rappresentazione.append(")");

        return rappresentazione.toString();
    }
}