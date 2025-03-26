package Spital.A3;

public class FabricaTipPersonalSpital {
    public ITipPersonalSpital tipPersonalSpital(CategoriePersonalSpital tip) throws Exception {
        switch (tip){
            case PersonalMedical :return new PersonalMedical() {
            };
            case PersonalNon_Medical:return new PersonalNon_Medical() {
            };
            default: throw new  Exception ("nu este tip personal Spital!");
        }

    }
}
