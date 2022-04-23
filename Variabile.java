package EspressioniDiVerita;

public class Variabile extends Espressione {
    public Variabile() {
        // Per default, il valore di stato rimarrà null
    }

    public void setValoreVerita(ValoreVerita stato) {
        this.stato = stato;
        rappresentazione = stato.toString();
    }
}