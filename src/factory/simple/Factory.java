package factory.simple;

public class Factory {
    public PachetTuristic  pachetTuristic(TipPachete tip) throws Exception{
        switch (tip){
            case CuCazare : return new CuCazare();
            case AllIncluse:return new AllInclus();
            case CuTransport: return new CuTransport();
            default: throw new Exception("nu este valabil");
        }
    }
}
