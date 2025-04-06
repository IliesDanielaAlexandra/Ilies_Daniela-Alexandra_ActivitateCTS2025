package AgeTour.Adapter.classes;

import AgeTour.Adapter.inchirieremasini.Masina;
import AgeTour.Adapter.inchirieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata  extends MasinaInchiriata implements PachetTuristic {
    public PachetMasinaInchiriata(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervaPachet() {
       super.inchiriazaMasina();

    }
}
