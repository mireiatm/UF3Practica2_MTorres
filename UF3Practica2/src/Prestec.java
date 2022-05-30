
import java.util.Date;

public class Prestec {

    private int numPrestec;

    public int getNumPrestec() {
        return numPrestec;
    }

    public Date getRecollir() {
        return recollir;
    }

    public void setNumPrestec(int numPrestec) {
        this.numPrestec = numPrestec;
    }

    public void setRecollir(Date recollir) {
        this.recollir = recollir;
    }

    public void setEntregar(Date entregar) {
        this.entregar = entregar;
    }

    public Date getEntregar() {
        return entregar;
    }

    public Prestec(int numPrestec, Date recollir, Date entregar) {
        this.numPrestec = numPrestec;
        this.recollir = recollir;
        this.entregar = entregar;
    }

    private Date recollir;

    private Date entregar;
}
