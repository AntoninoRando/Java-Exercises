package Esercizio2;

/**
 * Un oggetto Espressione è un albero binario. Il nodo centrale è il risultato
 * dei due sottonodi e di un operatore.
 */
public class Espressione {
    protected ValoreVerita stato;
    protected Espressione eDestra, eSinistra;

    protected String rappresentazione = "FALSO";

    // Costruttore che riceve due sottonodi (operatore AND e OR)
    public Espressione(Espressione eDestra, Espressione eSinistra) {
        this.eDestra = eDestra;
        this.eSinistra = eSinistra;
        stato = calcolaStato();
    }

    // Costruttore che riceve un solo sottonodo (operatore NOT)
    public Espressione(Espressione eDestra) {
        this.eDestra = eDestra;
        stato = calcolaStato();
    }

    // Costruttore che non riceve sottonodi ma ha solo uno stato (foglia: variabile
    // o costante)
    public Espressione(boolean valoreVerita) {
        stato = valoreVerita;

        if (valoreVerita == true)
            rappresentazione = "VERO";
    }

    protected boolean calcolaStato() {
        return false;
    }

    public boolean getValoreVerita() {
        return stato;
    }

    public String toString() {
        return rappresentazione;
    }
}

enum ValoreVerita {
    VERO(true), FALSO(false), NULLO(null);

    private boolean stato;

    // Costruttore
    ValoreVerita(boolean stato) { this.stato = stato; }
    public boolean toBoolean() { return stato; }
}
