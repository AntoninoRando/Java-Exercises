package EspressioniDiVerita;

public class AND extends Espressione {
    /**
     * Costruttore della classe che salva i sottoalberi (cioè gli operandi) di cui
     * si compone l'operatore and.
     * 
     * @param e1 oggetto della classe <code>Espressione</code> che rappresenta il
     *           primo operando dell'operatore.
     * @param e2 oggetto della classe <code>Espressione</code> che rappresenta il
     *           secondo operando dell'operatore.
     */
    public AND(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
    }

    @Override
    public ValoreVerita getValoreVerita() {
        boolean risultato = eDestra.getValoreVerita().toBoolean() && eSinistra.getValoreVerita().toBoolean();
        return ValoreVerita.fromBoolean(risultato);
    }

    @Override
    public String calcolaRappresentazione() {
        StringBuilder rappresentazione = new StringBuilder();

        rappresentazione.append("(");
        rappresentazione.append(eDestra.calcolaRappresentazione());
        rappresentazione.append(" && ");
        rappresentazione.append(eSinistra.calcolaRappresentazione());
        rappresentazione.append(")");

        return rappresentazione.toString();
    }
}