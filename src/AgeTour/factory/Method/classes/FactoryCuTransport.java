package AgeTour.factory.Method.classes;



public class FactoryCuTransport implements IFactoty {
    @Override
    public PachetTuristic creazaPachet() {
        return new CuTransport();
    }
}
