package AgeTour.factory.Method.classes;

public class FactotyAllInclus implements IFactoty {
    @Override
    public PachetTuristic creazaPachet() {
        return new AllInclus();
    }
}
