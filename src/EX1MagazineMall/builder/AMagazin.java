package EX1MagazineMall.builder;

import java.util.List;

public abstract class AMagazin {

    protected String denumire;
    protected int nrIntrari;
    protected float suprafata;
    protected IPodea podea;
    protected List<IDecorarePodea> listTipPodea=null;

    public AMagazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        this.podea = podea;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.denumire = denumire;
    }
}
