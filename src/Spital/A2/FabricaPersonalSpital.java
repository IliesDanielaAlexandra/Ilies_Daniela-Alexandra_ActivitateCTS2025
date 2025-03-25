package Spital.A2;

public class FabricaPersonalSpital {
    public  PersonalSpital personalSpital (TipPersonalSpital tipPersonal) throws Exception {
        switch (tipPersonal){
            case Medic : return new Medic();
            case Asistent: return  new Asistent();
            case Brancardier:return new Brancardier();
            default: throw new Exception("nu este valid!");
        }
    }
}
