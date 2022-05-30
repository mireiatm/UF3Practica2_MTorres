
import java.util.ArrayList;
import java.util.Date;

public class Autor {

    private String nom;

    private String nacionalitat;

    private Date dataNeix;

    public Autor(String nom, String nacionalitat, Date dataNeix, ArrayList<Llibre> libro) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.dataNeix = dataNeix;
        this.libro = libro;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public void setDataNeix(Date dataNeix) {
        this.dataNeix = dataNeix;
    }

    public void setLibro(ArrayList<Llibre> libro) {
        this.libro = libro;
    }

    public String getNom() {
        return nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public Date getDataNeix() {
        return dataNeix;
    }

    public ArrayList<Llibre> getLibro() {
        return libro;
    }

    public Autor(ArrayList<Llibre> libro) {
        this.libro = libro;
    }

    private ArrayList<Llibre> libro;
}
