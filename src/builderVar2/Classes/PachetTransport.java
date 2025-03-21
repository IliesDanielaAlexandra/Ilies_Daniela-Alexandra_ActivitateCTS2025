package builderVar2.Classes;

public class PachetTransport {
    private boolean areWiffi;
    private  boolean areTv;
    private boolean areAccesAnimale;
    private  boolean areLocFumat;
    private  boolean areAC;


    public PachetTransport(boolean areWiffi, boolean areTv, boolean areAccesAnimale, boolean areLocFumat, boolean areAC) {
        this.areWiffi = areWiffi;
        this.areTv = areTv;
        this.areAccesAnimale = areAccesAnimale;
        this.areLocFumat = areLocFumat;
        this.areAC = areAC;

    }
    public void setAreWiffi(boolean areWiffi) {
        this.areWiffi = areWiffi;
    }

    public void setAreTv(boolean areTv) {
        this.areTv = areTv;
    }

    public void setAreAccesAnimale(boolean areAccesAnimale) {
        this.areAccesAnimale = areAccesAnimale;
    }

    public void setAreLocFumat(boolean areLocFumat) {
        this.areLocFumat = areLocFumat;
    }

    public void setAreAC(boolean areAC) {
        this.areAC = areAC;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "areWiffi=" + areWiffi +
                ", areTv=" + areTv +
                ", areAccesAnimale=" + areAccesAnimale +
                ", areLocFumat=" + areLocFumat +
                ", areAC=" + areAC +
                '}';
    }


}
