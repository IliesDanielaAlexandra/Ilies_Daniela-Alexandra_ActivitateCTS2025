package AgeTour.Adapter.program;

import AgeTour.Adapter.classes.PachetCazare;
import AgeTour.Adapter.classes.PachetMasinaInchiriata;
import AgeTour.Adapter.classes.PachetTuristic;
import AgeTour.Adapter.inchirieremasini.Masina;
import AgeTour.Adapter.inchirieremasini.MasinaInchiriata;

public class program {
    private static void printeazaRezervare(PachetTuristic pachetTuristic){
        System.out.println("Pentru client: ");
        pachetTuristic.descriere();
        System.out.println("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }


    public static void main(String[] args) {
        PachetTuristic pachetCazare=new PachetCazare();
        printeazaRezervare(pachetCazare);

        System.out.println("");
        System.out.println("");
        System.out.println("Se doreste utilizarea librariei pentru masini inchiriate!");

        System.out.println();
        System.out.println("Utilizarea in modul clasic:");

        Masina masina=new Masina("Opel", 1300);
        MasinaInchiriata masinaInchiriata= new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu se foloseste metoda de printare.");
        System.out.print("Pentru client: ");
        System.out.println(masinaInchiriata.toString());

        System.out.print("Pentru Operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.print("");
        System.out.print("Se utilizeaza adaptorul: ");
        Masina masina1= new Masina( "Renault", 1400);

        System.out.print("");
        System.out.println("Acum pachetul este creat direct cu masina dorita");
        PachetMasinaInchiriata pachetMasinaInchiriata=new PachetMasinaInchiriata(masina1);
        System.out.println();
        System.out.println("Se foloseste metoda de printare");
        printeazaRezervare(pachetMasinaInchiriata);






    }
}
