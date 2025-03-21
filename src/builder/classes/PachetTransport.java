package builder.classes;

public class PachetTransport {
    private boolean areWiffi;
    private  boolean animaleCompanie;
    private  boolean locFumat;
    private  boolean areAC;
    private  boolean areTV;


    public PachetTransport(boolean animaleCompanie, boolean areWiffi, boolean locFumat, boolean areAC, boolean areTV) {
        this.animaleCompanie = animaleCompanie;
        this.areWiffi = areWiffi;
        this.locFumat = locFumat;
        this.areAC = areAC;
        this.areTV = areTV;
    }


     public    void setAreWiffi(boolean areWiffi) {
        this.areWiffi = areWiffi;
    }

    public void setAnimaleCompanie(boolean animaleCompanie) {
        this.animaleCompanie = animaleCompanie;
    }

    public void setLocFumat(boolean locFumat) {
        this.locFumat = locFumat;
    }

    public void setAreAC(boolean areAC) {
        this.areAC = areAC;
    }

     public void setAreTV(boolean areTV) {
        this.areTV = areTV;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "areWiffi=" + areWiffi +
                ", animaleCompanie=" + animaleCompanie +
                ", locFumat=" + locFumat +
                ", areAC=" + areAC +
                ", areTV=" + areTV +
                '}';
    }
}
