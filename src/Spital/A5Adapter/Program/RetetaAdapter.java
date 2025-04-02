package Spital.A5Adapter.Program;

import Spital.A5Adapter.Farmacie.Medicamente;
import Spital.A5Adapter.Spital.Classes.Medicament;

public class RetetaAdapter implements Medicamente {
   private Medicament medicamentSpita;

   public RetetaAdapter(Medicament medicamentSpita){
       this.medicamentSpita=medicamentSpita;

   }


    @Override
    public void cumparaMedicament() {
       medicamentSpita.achizitioneazaMedicament();

    }
}
