package EspressioniDiVerita;

public class NOT extends Espressione {
    /**
     * Costruttore della classe che salva il sottoalbero (cioè l'operando) di cui
     * si compone l'operatore not.
     * 
     * @param e oggetto della classe <code>Espressione</code> che rappresenta
     *          l'espressione da negare.
     */
    public NOT(Espressione e) {
        eDestra = e;
    }

    public ValoreVerita getValoreVerita() {
        boolean risultato = !eDestra.getValoreVerita().toBoolean();
        return ValoreVerita.fromBoolean(risultato);
    }

    public String calcolaRappresentazione() {
        StringBuilder rappresentazione = new StringBuilder();

        rappresentazione.append("!");
        rappresentazione.append(eDestra.calcolaRappresentazione());

        return rappresentazione.toString();
    }
}