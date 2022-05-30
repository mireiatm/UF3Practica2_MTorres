public class Copies {

    private String identificador;

    public Copies(String identificador, String estat) {
        this.identificador = identificador;
        this.estat = estat;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getEstat() {
        return estat;
    }

    private String estat;
}
