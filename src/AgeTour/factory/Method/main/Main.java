package AgeTour.factory.Method.main;

import AgeTour.factory.Method.classes.*;

public class Main {
    public static void metoda(IFactoty factory){
        PachetTuristic p1=factory.creazaPachet();
        p1.descriere();
    }

    public static void main(String[] args) {

        metoda(new FactoryCuCazare());
        metoda(new FactoryCuTransport());
        metoda(new FactotyAllInclus());
    }
}
