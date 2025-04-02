package Spital.A5Adapter.Spital.Classes;

public class RetetaMedicament implements  Medicament{
    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Medicament achizitionat!");
        prezintaReteta();

    }

    @Override
    public void prezintaReteta() {
        System.out.println("Verificare reteta!");

    }
}
