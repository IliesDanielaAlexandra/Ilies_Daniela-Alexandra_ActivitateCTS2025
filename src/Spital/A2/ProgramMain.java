package Spital.A2;

public class ProgramMain {
    public static void main(String[] args) throws Exception {
       FabricaPersonalSpital fabricaPersonalSpital=new FabricaPersonalSpital();
       PersonalSpital p1= fabricaPersonalSpital.personalSpital(TipPersonalSpital.Medic);
       p1.descriere();

       PersonalSpital p2= fabricaPersonalSpital.personalSpital(TipPersonalSpital.Brancardier);
       p2.descriere();

       PersonalSpital p3= fabricaPersonalSpital.personalSpital(TipPersonalSpital.Asistent);
       p3.descriere();

       PersonalSpital p4=fabricaPersonalSpital.personalSpital(TipPersonalSpital.Pacient);
    }
}
