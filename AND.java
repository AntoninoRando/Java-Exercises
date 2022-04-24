package EspressioniDiVerita;

public class AND extends Espressione {
    public AND(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
    }

    public ValoreVerita getValoreVerita() {
        boolean risultato = eDestra.getValoreVerita().toBoolean() && eSinistra.getValoreVerita().toBoolean();
        return ValoreVerita.fromBoolean(risultato);
    }

    public String getRappresentazione() {
        return "(" + eDestra.getRappresentazione() + " && " + eSinistra.getRappresentazione() + ")";
    }
}