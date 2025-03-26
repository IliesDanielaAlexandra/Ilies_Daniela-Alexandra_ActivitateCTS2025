package Spital.A3;

public  class Medic extends PersonalMedical {

    @Override
    public String descriere() {
        return super.descriere() + " - Medic";
    }
}
