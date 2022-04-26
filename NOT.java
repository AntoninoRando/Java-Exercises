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

    @Override
    public ValoreVerita getValoreVerita() {
        switch (eDestra.getValoreVerita().toInt()) {
            case 0:
                return ValoreVerita.VERO; // !FALSO 
            case 1:
                return ValoreVerita.FALSO; // !VERO
            default:
                return ValoreVerita.INDEFINITO; // Include il caso 3
        }
    }

    @Override
    protected String calcolaRappresentazione() {
        StringBuilder rappresentazione = new StringBuilder();

        rappresentazione.append("!");
        rappresentazione.append(eDestra.calcolaRappresentazione());

        return rappresentazione.toString();
    }
}