public enum ValoreVerita {
    VERO(true), FALSO(false);

    private boolean stato;

    // Costruttore
    ValoreVerita(boolean stato) {
        this.stato = stato;
    }

    public boolean toBoolean() {
        return stato;
    }
}
