package Spital.A3;

public class PersonalMedicalFactory {

    public static ITipPersonalSpital createPersonalMedical(DenumirePesonalSpital denumire) throws Exception {
        switch (denumire) {
            case Medic: return new Medic();
            case Asistent:return new Asistent();
            default:
                throw new Exception("Nu este personal medical valid!");
        }
    }
}
