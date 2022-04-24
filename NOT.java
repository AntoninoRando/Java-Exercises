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
        StringBuilder rappresentazione = new StringBuilder();
        
        rappresentazione.append("!");
        rappresentazione.append(eDestra.getRappresentazione());

        return rappresentazione.toString();
    }
}