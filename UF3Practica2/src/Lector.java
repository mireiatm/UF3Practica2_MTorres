public class Lector {

    private String nom;

    public Lector(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    private String DNI;
}
