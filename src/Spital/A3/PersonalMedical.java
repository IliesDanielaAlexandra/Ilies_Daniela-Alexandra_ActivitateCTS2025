package Spital.A3;

public abstract class PersonalMedical implements ITipPersonalSpital {

    @Override
    public String descriere() {

        return "Este personal Medical";
    }

    @Override
    public String descrieretip() {

        return "Tip personal: ";
    }

}
