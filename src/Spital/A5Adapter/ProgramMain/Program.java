package Spital.A5Adapter.ProgramMain;

import Spital.A5Adapter.Farmacie.Medicamente;
import Spital.A5Adapter.Program.RetetaAdapter;
import Spital.A5Adapter.Spital.Classes.RetetaMedicament;

public class Program {
    public static void main(String[] args) {
        RetetaMedicament medicamentSpital=new RetetaMedicament();
        Medicamente medicamentFarmacie=new RetetaAdapter(medicamentSpital);
        medicamentFarmacie.cumparaMedicament();
        }
    }

