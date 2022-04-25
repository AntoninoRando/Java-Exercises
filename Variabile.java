package EspressioniDiVerita;

public class Variabile extends Espressione {
    /**
     * Salva il valore di verita' della variabile. Puo' essere cambiato.
     */
    private ValoreVerita stato;

    /**
     * Costruttore della classe; usato solo per creare l'oggetto.
     */
    public Variabile() {
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
    public String calcolaRappresentazione() {
        return stato.toString();
    }
}