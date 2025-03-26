package Spital.A3;

public abstract class PersonalNon_Medical implements ITipPersonalSpital{

    @Override
    public String descriere() {
        return "Este personal Non-Medical";
    }

    @Override
    public String descrieretip() {
        return "Tip personal: ";
    }
}
