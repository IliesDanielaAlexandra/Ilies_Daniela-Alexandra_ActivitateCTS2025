package Spital.A3;

public class Asistent   extends PersonalMedical{

    @Override
    public String descriere() {
        return super.descriere() + " - Asistent";
    }
}
