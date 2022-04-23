package EspressioniDiVerita;

public enum ValoreVerita {
    VERO(true, 1), FALSO(false, 0);

    private boolean stato;
    private int statoIntero;

    // Costruttore
    ValoreVerita(boolean stato, int statoIntero) {
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
        if (stato)
            return ValoreVerita.VERO;
        return ValoreVerita.FALSO;
    }
}