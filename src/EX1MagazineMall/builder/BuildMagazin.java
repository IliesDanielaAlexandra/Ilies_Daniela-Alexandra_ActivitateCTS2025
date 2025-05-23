package EX1MagazineMall.builder;

import java.util.List;

public class BuildMagazin implements IBuild {

    protected String denumire;
    protected int nrIntrari;
    protected float suprafata;
    protected IPodea podea;
    protected List<IDecorarePodea> listTipPodea = null;

    public BuildMagazin(String denumire, int nrIntrari, float suprafata) {
        super();
        this.denumire = denumire;
        this.nrIntrari = nrIntrari;
        this.suprafata = suprafata;
        this.listTipPodea = listTipPodea;
    }

    public BuildMagazin setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public BuildMagazin setListTipPodea(IDecorarePodea listTipPodea) {
        if (listTipPodea != null) {
            this.listTipPodea.add(listTipPodea);
        }
        return this;
    }


    @Override
    public Magazin build() {

            Magazin m = null;

            if (this.suprafata / 100 > this.nrIntrari)
                return null;
            if (this.podea == null) {
                this.podea = new PodeaCustomizata();
            }
//            if (this.podea.getDuritate() < 2) {
//                for (IDecorarePodea d : this.listTipPodea) {
//                    if (d.getTipPodea() == TipMaterialPodea.sticla)
//                        return null;
//                }
//            }
            m = new Magazin(podea, suprafata, nrIntrari, denumire);
            for (IDecorarePodea d : this.listTipPodea) {
                m.adaugaPodea(d);
            }
            return m;
        }

    }
