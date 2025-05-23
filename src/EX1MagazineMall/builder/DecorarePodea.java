package EX1MagazineMall.builder;

public class DecorarePodea implements IDecorarePodea {
private TipMaterialPodea tipPodea;
private  String denumire;

    public DecorarePodea(TipMaterialPodea tipPodea, String denumire) {
        super();
        this.tipPodea = tipPodea;
        this.denumire = denumire;
    }

    @Override
    public TipMaterialPodea getTipPodea() {
        return this.tipPodea;
    }

    @Override
    public String toString() {
        return "DecorarePodea{" + "tipPodea=" + tipPodea + ", denumire='" + denumire + '\'' + '}';
    }
}
