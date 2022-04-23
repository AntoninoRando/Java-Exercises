package EspressioniDiVerita;

public class AND extends Espressione {
    public AND(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
        stato = ValoreVerita.fromBoolean(e1.toBoolean() && e2.toBoolean());

        rappresentazione = "(" + e1.rappresentazione + " && " + e2.rappresentazione + ")";
    }
}