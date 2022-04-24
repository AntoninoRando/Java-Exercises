package EspressioniDiVerita;

public class NOT extends Espressione {
    public NOT(Espressione e) {
        eDestra = e;
    }

    public ValoreVerita getValoreVerita() {
        boolean risultato = !eDestra.getValoreVerita().toBoolean();
        return ValoreVerita.fromBoolean(risultato);
    }

    public String getRappresentazione() {
        return "!" + eDestra.getRappresentazione();
    }
}