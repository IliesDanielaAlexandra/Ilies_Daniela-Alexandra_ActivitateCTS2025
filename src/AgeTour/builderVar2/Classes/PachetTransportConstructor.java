package AgeTour.builderVar2.Classes;

public class PachetTransportConstructor implements IPachetTransport{
    private boolean areWiffi=false;
    private  boolean areTv=false;
    private boolean areAccesAnimale=false;
    private  boolean areLocFumat=false;
    private  boolean areAC=false;

    public PachetTransportConstructor() {
    }

    @Override
    public PachetTransport constructor() {
        return new PachetTransport(this.areWiffi,this.areTv,this.areAccesAnimale,this.areLocFumat,this.areAC) ;
    }

    public PachetTransportConstructor setAreWiffi(boolean areWiffi) {
        this.areWiffi = areWiffi;
        return this;
    }

    public PachetTransportConstructor setAreTv(boolean areTv) {
        this.areTv = areTv;
        return this;

    }

    public PachetTransportConstructor setAreAccesAnimale(boolean areAccesAnimale) {
        this.areAccesAnimale = areAccesAnimale;
        return this;
    }

    public PachetTransportConstructor setAreLocFumat(boolean areLocFumat) {
        this.areLocFumat = areLocFumat;
        return this;
    }

    public PachetTransportConstructor setAreAC(boolean areAC) {
        this.areAC = areAC;
        return this;
    }
}
