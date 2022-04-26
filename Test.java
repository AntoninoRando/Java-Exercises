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
        // Costruiamo un ValoreVerita da un booleano.
        ValoreVerita trV = ValoreVerita.fromBoolean(true);
        System.out.println(trV);

        // Costruiamo un ValoreVerita INDEFINITO.
        System.out.println(ValoreVerita.fromBoolean(null));

        // Costruiamo un AND.
        Espressione and1 = new AND(new Costante(ValoreVerita.VERO), new Costante(ValoreVerita.FALSO));
        System.out.println(and1.toString());

        // Costruiamo due costanti ed un OR.
        Costante tr = new Costante(trV);
        Espressione fl = new Costante(ValoreVerita.FALSO);
        OR or1 = new OR(tr, fl);
        System.out.println(or1.toString());

        // Costruiamo una variabile, settiamo il valore e costruiamo un NOT.
        Variabile var1 = new Variabile();
        var1.setValoreVerita(trV);
        Espressione not1 = new NOT(new AND(or1, var1));
        System.out.println(not1.toString());

        // Cambiamo il valore alla variabile di prima e verifichiamo cambi anche il
        // valore dell'espressione che ne faceva uso.
        var1.setValoreVerita(ValoreVerita.FALSO);
        System.out.println(not1.toString());
        System.out.println(not1.getValoreVerita());

        // Costruiamo una variabile indefinita e verifichiamo funzioni il calcolo
        // dell'espressione con delle incognite.
        Espressione varIndef = new Variabile();
        System.out.println(new AND(varIndef, tr).toString());
        System.out.println(new AND(varIndef, fl).toString());

        // Verifichiamo funzioni il metodo che converte a booleano una Variabile.
        System.out.println(var1.toBoolean());

        // Verifichiamo che il codice seguente dia errore perché il tipo indefinito non
        // ha un corrispettivo booleano.
        System.out.println(varIndef.toBoolean());
    }
}