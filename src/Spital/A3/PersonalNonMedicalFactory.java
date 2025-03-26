package Spital.A3;

public class PersonalNonMedicalFactory {

    public static ITipPersonalSpital createPersonalNonMedical(DenumirePesonalSpital denumire) throws Exception {
        switch (denumire) {
            case Brancardier : return new Brancardier();
            case Secretar: return new Secretar();
            case Registrator: return new Registrator();
            default:
                throw new Exception("Nu este personal non-medical valid!");
        }
    }
}

