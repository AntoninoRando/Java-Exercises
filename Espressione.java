package EspressioniDiVerita;

/**
 * Un oggetto Espressione è un albero binario. Il nodo centrale è il risultato
 * dei due sottonodi e di un operatore.
 */
public abstract class Espressione {
    protected ValoreVerita stato;
    protected Espressione eDestra, eSinistra;
    protected String rappresentazione;

    public ValoreVerita getValoreVerita() {
        return stato;
    }

    public boolean toBoolean() {
        return stato.toBoolean();
    }

    public String toString() {
        return rappresentazione + " = " + stato;
    }

    // public static Espressione fromString() {

    // }
}
