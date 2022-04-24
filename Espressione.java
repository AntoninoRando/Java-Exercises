package EspressioniDiVerita;

/**
 * Un oggetto Espressione è un albero binario. Il nodo centrale è il risultato
 * dei due sottonodi e di un operatore.
 */
public abstract class Espressione {
    protected Espressione eDestra, eSinistra;

    /**
     * Il risultato dell'espressione non viene salvato in una variabile, ma viene
     * calcolato dal metodo. Questa scelta permette di
     * modificare il risultato ad ogni cambiamento di qualsiasi sottoalbero
     * dell'espressione.
     * <p>
     * Il metodo è astratto perché ogni operatore (AND, OR, NOT), variabile o
     * costante calcola il risultato in maniera differente.
     * 
     * @return Risultato dell'espressione.
     */
    public abstract ValoreVerita getValoreVerita();

    /**
     * La forma in Stringa dell'espressione non viene salvato come valore, così che
     * può variare alle variazioni nei sottoalberi dell'espressione.
     * 
     * @return Stringa che rappresenta l'espressione.
     */
    public abstract String getRappresentazione();

    /**
     * @return Valore primitivo booleano del risultato.
     */
    public boolean toBoolean() {
        return getValoreVerita().toBoolean();
    }

    /**
     * @return Stringa che rappresenta l'espressione ed il risultato.
     */
    public String toString() {
        return getRappresentazione() + " = " + getValoreVerita();
    }

    // public static Espressione fromString() {

    // }
}
