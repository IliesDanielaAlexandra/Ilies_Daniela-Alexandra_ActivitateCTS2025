package singlenton.classes;

public class Agentie {

    private String nume;
    private final int nrAngajati;

    private static  Agentie instance=null;


    private Agentie( String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }



    public  static synchronized Agentie getInstance(String numeI, int nrAngajatiI){
        if (instance== null){
            instance=new Agentie(numeI,nrAngajatiI );
        }
        return instance;
    }


    @Override
    public String toString() {
        return "Agentie{" +
                "nume='" + nume + '\'' +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
