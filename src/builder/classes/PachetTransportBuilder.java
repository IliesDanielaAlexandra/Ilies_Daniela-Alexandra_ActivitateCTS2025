package builder.classes;

public class PachetTransportBuilder implements  IPachetTransport {

    private  PachetTransport pachetTransport= new PachetTransport(false,false,false,false, false)  ;

    public PachetTransportBuilder() {

    }


    public PachetTransportBuilder setAreWiffi(boolean areWiffi) {
        this.pachetTransport.setAreWiffi(areWiffi);
        return this;
    }

    public PachetTransportBuilder setAnimaleCompanie(boolean animaleCompanie) {
        this.pachetTransport.setAnimaleCompanie(animaleCompanie);
        return this;
    }

    public PachetTransportBuilder setLocFumat(boolean locFumat) {
        this.pachetTransport.setLocFumat(locFumat);
        return this;
    }

    public PachetTransportBuilder setAreAC(boolean areAC) {
        this.pachetTransport.setAreAC(areAC);
        return this;
    }

    public PachetTransportBuilder setAreTV(boolean areTV) {
        this.pachetTransport.setAreTV(areTV);
        return this;
    }


    @Override
    public PachetTransport build() {
        return pachetTransport;
    }
}
