package EspressioniDiVerita;

public class OR extends Espressione {
    /**
     * Costruttore della classe che salva i sottoalberi (cioè gli operandi) di cui
     * si compone l'operatore or.
     * 
     * @param e1 oggetto della classe <code>Espressione</code> che rappresenta il
     *           primo operando dell'operatore.
     * @param e2 oggetto della classe <code>Espressione</code> che rappresenta il
     *           secondo operando dell'operatore.
     */
    public OR(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
    }

    @Override
    public ValoreVerita getValoreVerita() {
        switch (eDestra.getValoreVerita().toInt() + eSinistra.getValoreVerita().toInt()) {
            case 0:
                return ValoreVerita.FALSO; // FALSO || FALSO
            case 1:
                return ValoreVerita.VERO; // FALSO || VERO
            case 2:
                return ValoreVerita.VERO; // VERO || VERO
            case 4:
                return ValoreVerita.VERO; // VERO || INDEFINITO
            default:
                return ValoreVerita.INDEFINITO; // Include il caso 3: FALSO || INDEFINITO
        }
    }

    @Override
    protected String calcolaRappresentazione() {
        StringBuilder rappresentazione = new StringBuilder();

        rappresentazione.append("(");
        rappresentazione.append(eDestra.calcolaRappresentazione());
        rappresentazione.append(" || ");
        rappresentazione.append(eSinistra.calcolaRappresentazione());
        rappresentazione.append(")");

        return rappresentazione.toString();
    }
}