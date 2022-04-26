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
        switch (eDestra.getValoreVerita().toInt() + eSinistra.getValoreVerita().toInt()) {
            case 0:
                return ValoreVerita.FALSO; // FALSO && FALSO
            case 1:
                return ValoreVerita.FALSO; // FALSO && VERO
            case 2:
                return ValoreVerita.VERO; // VERO && VERO
            case 3:
                return ValoreVerita.FALSO; // FALSO && INDEFINITO
            default:
                return ValoreVerita.INDEFINITO; // Include il caso 4: VERO && INDEFINITO
        }
    }

    @Override
    protected String calcolaRappresentazione() {
        StringBuilder rappresentazione = new StringBuilder();

        rappresentazione.append("(");
        rappresentazione.append(eDestra.calcolaRappresentazione());
        rappresentazione.append(" && ");
        rappresentazione.append(eSinistra.calcolaRappresentazione());
        rappresentazione.append(")");

        return rappresentazione.toString();
    }
}