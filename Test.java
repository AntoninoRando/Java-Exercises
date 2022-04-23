package EspressioniDiVerita;

/**
 * Si progetti un insieme di classi che permettano di rappresentare e calcolare
 * le espressioni con valori di verita'.
 * <p>
 * Si progettino in particolare le classi per rappresentare:
 * <ul>
 * <li>una costante (VERO oppure FALSO)</li>
 * <li>una variabile, con metodo <code>setValoreVerita</code> per impostarne il
 * valore di
 * verita'</li>
 * <li>un'espressione AND(e1, e2)</li>
 * <li>un'espressione OR(e1, e2)</li>
 * <li>un'espressione NOT(e1)</li>
 * </ul>
 * dove e1 ed e2 sono a loro volta espressioni con valori di verita'.
 * <p>
 * Le classi, e le loro opportune generalizzazioni, sono dotate di un metodo
 * <code>getValoreVerita</code> che restituisce il valore di verita'
 * dell'espressione.
 */
public class Test {
    public static void main(String[] args) {
        ValoreVerita tr = ValoreVerita.fromBoolean(true);
        System.out.println(tr);
    }
}