package EspressioniDiVerita;

public class Costante extends Espressione {
    public Costante(ValoreVerita stato) {
        this.stato = stato;
        rappresentazione = stato.toString();
    }
}