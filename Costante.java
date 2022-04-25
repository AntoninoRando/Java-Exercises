package EspressioniDiVerita;

public class Costante extends Espressione {
    /**
     * Salva il valore di verita' della costante. Non puo' essere cambiato.
     */
    private final ValoreVerita stato;

    /**
     * Costruttore della classe che inizializza il valore di verita' della costante.
     * 
     * @param stato valore di verita' della costante sotto forma di
     *              <code>ValoreVerita</code>.
     */
    public Costante(ValoreVerita stato) {
        this.stato = stato;
    }

    @Override
    public ValoreVerita getValoreVerita() {
        return stato;
    }

    @Override
    public String calcolaRappresentazione() {
        return stato.toString();
    }
}