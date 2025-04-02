package PrototipModeleDiverse.Reclama.Classes;

public class Benner implements IPanouReclama, IBenner{
    private String nume;
    private int cantitate;
    private String oras ;

    public Benner() {
    }

    public Benner(String nume, int cantitate, String oras) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.oras = oras;
    }

    @Override
    public String getNumeProdus() {
        return this.nume;
    }

    @Override
    public int getCantitate() {
        return this.cantitate;
    }

    @Override
    public String getOras() {
        return this.oras;
    }

    @Override
    public IPanouReclama copiaza() {
        IPanouReclama copie= new Benner();
        ((Benner)copie).nume=this.nume;
        ((Benner)copie).cantitate=this.cantitate;
        ((Benner)copie).oras=this.oras;
        return copie;
    }

    @Override
    public String toString() {
        return "Benner{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                ", oras='" + oras + '\'' +
                '}';
    }
}
