package Spital.A1;

public class Program {

    public static void main(String[] args) {
        IPacient pacientNou=new PacientBuilder();
        System.out.println(pacientNou);
        var pacient1=((PacientBuilder)pacientNou).setExtraPapuciDeCamera(true).setExtraHalatInterior(true).build();
        System.out.println(pacient1);
        var pacient2=((PacientBuilder)pacientNou).setCuMicDejunInclus(true).setExtraPatRabatabil(true).build();
        System.out.println(pacient2);
    }
}
