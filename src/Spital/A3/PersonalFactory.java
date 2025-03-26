package Spital.A3;

public class PersonalFactory {


    public static ITipPersonalSpital createPersonal(CategoriePersonalSpital categorie, DenumirePesonalSpital denumire) throws Exception {
        switch (categorie) {
            case PersonalMedical:

                return PersonalMedicalFactory.createPersonalMedical(denumire);
            case PersonalNon_Medical:

                return PersonalNonMedicalFactory.createPersonalNonMedical(denumire);
            default:
                throw new Exception("Tip personal necunoscut!");
        }
    }
}