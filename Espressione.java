package EspressioniDiVerita;

/**
 * Un oggetto <code>Espressione</code> rappresenta un albero binario.
 * <p>
 * Se il nodo dell'albero ha
 * <ul>
 * <li>0 figli, l'espressione prende la forma di una costante o di una
 * variabile;</li>
 * <li>1 figlio, l'espressione prende la forma dell'operatore logico NOT;</li>
 * <li>2 figli, l'espressione prende la forma dell'operatore logico AND oppure
 * OR.</li>
 * </ul>
 * <p>
 * La classe è in grado di calcolare il risultato dell'espressione, anche nel
 * caso in cui alcune variabili non siano
 * definite. Inoltre è in grado di restituire una rappresentazione completa
 * dell'espressione.
 */
public abstract class Espressione {
    /**
     * Rappresenta il sottoalbero dell'espressione, pertanto e' anch'esso di tipo
     * <code>Espressione</code>.
     * <p>
     * Puo' essere <code>null</code> se l'espressione non ha sottoalberi.
     */
    protected Espressione eDestra, eSinistra;

    /**
     * Il metodo calcola il valore di verita' dell'espressione e lo ritorna come
     * <code>ValoreVerita</code>.
     * <p>
     * Il modo in cui viene calcolato il valore viene definito dalle sottoclassi di
     * <code>Espressione</code>.
     * 
     * @return Risultato logico dell'espressione sotto forma di
     *         <code>ValoreVerita</code>.
     */
    protected abstract ValoreVerita getValoreVerita();

    /**
     * Il metodo costruisce la rappresentazione in stringa dell'espressione e la
     * ritorna.
     * <p>
     * Il modo in cui viene costruita la stringa viene definito dalle sottoclassi di
     * <code>Espressione</code>.
     * 
     * @return Stringa che rappresenta l'espressione.
     */
    protected abstract String calcolaRappresentazione();

    /**
     * Ritorna la conversione del valore di verita' dell'espressione da
     * <code>ValoreVerita</code> a <code>boolean</code>.
     * 
     * @return Valore primitivo booleano del risultato.
     */
    public boolean toBoolean() {
        return getValoreVerita().toBoolean();
    }

    /**
     * Ritorna la rappresentazione in stringa dell'espressione ed il valore di
     * verita' affianco.
     * 
     * @return Stringa che rappresenta l'espressione ed il risultato.
     */
    public String toString() {
        return calcolaRappresentazione() + " = " + getValoreVerita();
    }
}
