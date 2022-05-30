public abstract class Llibre extends Copies {

    private String nom;

    private String tipus;

    public Llibre(String nom, String tipus, String editorial, int any, String autor, String identificador, String estat) {
        super(identificador, estat);
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNom() {
        return nom;
    }

    public String getTipus() {
        return tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAny() {
        return any;
    }

    public String getAutor() {
        return autor;
    }

    private String editorial;

    private int any;

    private String autor;
}
