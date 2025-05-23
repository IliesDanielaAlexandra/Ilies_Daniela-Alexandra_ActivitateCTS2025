package EX1MagazineMall.builder;

import java.util.ArrayList;

public class Magazin extends  AMagazin{


    public Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        super(podea, suprafata, nrIntrari, denumire);
    }

    void adaugaPodea(IDecorarePodea adaugaPodea){
        if(this.listTipPodea==null){
            this.listTipPodea= new ArrayList<>();
        }
        if (adaugaPodea!=null){
            this.listTipPodea.add(adaugaPodea);
        }

    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", nrIntrari=" + nrIntrari +
                ", suprafata=" + suprafata +
                ", podea=" + podea +
                ", listTipPodea=" + listTipPodea +
                '}';
    }
}
