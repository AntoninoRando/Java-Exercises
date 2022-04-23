package Esercizio2;

public class AND extends Espressione {
    public AND(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
        stato = ValoreVerita(e1.toBoolean() && e2.toBoolean());
    }
}
