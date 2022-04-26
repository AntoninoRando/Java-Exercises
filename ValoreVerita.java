package EspressioniDiVerita;

public enum ValoreVerita {
    VERO(true, 1), FALSO(false, 0), INDEFINITO(null, 3);

    private Boolean stato;
    private int statoIntero;

    /**
     * Costruttore dei tipi.
     * 
     * @param stato       il valore di verita' sotto forma di booleano. Il
     *                    costruttore prende un oggetto di tipo <code>Boolean</code>
     *                    per poter passare alla costante INDEFINITO null.
     * @param statoIntero numero intero che rappresenta l'intero corrispondente al
     *                    valore di verita'.
     */
    ValoreVerita(Boolean stato, int statoIntero) {
        this.stato = stato;
        this.statoIntero = statoIntero;
    }

    public boolean toBoolean() {
        return stato;
    }

    public int toInt() {
        return statoIntero;
    }

    public static ValoreVerita fromBoolean(Boolean stato) {
        if (stato == null)
            return ValoreVerita.INDEFINITO;
        else if (stato)
            return ValoreVerita.VERO;
        else
            return ValoreVerita.FALSO;
    }
}