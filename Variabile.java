package EspressioniDiVerita;

public class Variabile extends Espressione {
    private ValoreVerita stato;
    /** Lasciamo il costruttore vuoto per sottolineare il fatto che una Variabile può
     * cambiare valore (quindi anche il valore iniziale sarà impostato col metodo)
     */
    public Variabile() {
        // Per default, il valore di stato rimarrà null
    }

    public void setValoreVerita(ValoreVerita stato) {
        this.stato = stato;
    }

    public ValoreVerita getValoreVerita() {
        return stato;
    }

    public String getRappresentazione() {
        return stato.toString();
    }
}