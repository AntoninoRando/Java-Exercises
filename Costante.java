package EspressioniDiVerita;

public class Costante extends Espressione {
    private final ValoreVerita stato;

    public Costante(ValoreVerita stato) {
        this.stato = stato;
    }

    public ValoreVerita getValoreVerita() {
        return stato;
    }

    public String getRappresentazione() {
        return stato.toString();
    }
}