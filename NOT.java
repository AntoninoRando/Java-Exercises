package EspressioniDiVerita;

public class NOT extends Espressione {
    public NOT(Espressione e) {
        eDestra = e;
        stato = ValoreVerita(!e.toBoolean());
    }
}