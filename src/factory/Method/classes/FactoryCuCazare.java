package factory.Method.classes;


public class FactoryCuCazare implements IFactoty{
    @Override
    public PachetTuristic creazaPachet() {
        return new CuCazare();
    }
}
