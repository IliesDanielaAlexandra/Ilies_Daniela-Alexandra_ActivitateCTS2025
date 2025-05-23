package Comportamentale.Strategy;

public class OfertaMeniu {
    private String denumireMeniu;
    private int nrCalori;
    private int nrCrbohidrati;

    public OfertaMeniu(String denumireMeniu, int nrCalori, int nrCrbohidrati) {
        this.denumireMeniu = denumireMeniu;
        this.nrCalori = nrCalori;
        this.nrCrbohidrati = nrCrbohidrati;
    }

    public String getDenumireMeniu() {
        return denumireMeniu;
    }

    public int getNrCalori() {
        return nrCalori;
    }

    public int getNrCrbohidrati() {
        return nrCrbohidrati;
    }

    @Override
    public String toString() {
        return "OfertaMeniu{" +
                "denumireMeniu='" + denumireMeniu + '\'' +
                ", nrCalori=" + nrCalori +
                ", nrCrbohidrati=" + nrCrbohidrati +
                '}';
    }
}
