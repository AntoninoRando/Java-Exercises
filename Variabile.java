package Esercizio2;

public class Variabile extends Espressione {
    public Variabile() {
    }

    public void setValoreVerita(boolean valoreVerita) {
        stato = valoreVerita;

        if (valoreVerita == true)
            rappresentazione = "VERO";
        else
            rappresentazione = "FALSO";
    }
}