package Esercizio2;

public class OR extends Espressione {
    public OR(Espressione e1, Espressione e2) {
        eDestra = e1;
        eSinistra = e2;
        stato = ValoreVerita(e1.toBoolean() || e2.toBoolean());
    }

}
