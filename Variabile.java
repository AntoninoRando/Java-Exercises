package EspressioniDiVerita;

public class Variabile extends Espressione {
    /**
     * Salva il valore di verita' della variabile. Puo' essere cambiato.
     */
    private ValoreVerita stato;

    /**
     * Costruttore della classe. Per default, lo stato dell'oggetto ha valore di
     * verita' INDEFINITO.
     */
    public Variabile() {
        stato = ValoreVerita.INDEFINITO;
    }

    /**
     * Permette di impostare il valore di verita' dell'oggetto.
     * 
     * @param stato valore di verita' sotto forma di <code>ValoreVerita</code>.
     */
    public void setValoreVerita(ValoreVerita stato) {
        this.stato = stato;
    }

    @Override
    public ValoreVerita getValoreVerita() {
        return stato;
    }

    @Override
    protected String calcolaRappresentazione() {
        return stato.toString();
    }
}