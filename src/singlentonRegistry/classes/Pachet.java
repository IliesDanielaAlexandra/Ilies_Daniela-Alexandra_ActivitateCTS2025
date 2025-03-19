package singlentonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

public class Pachet {

    private String destinatie;
    private float pret;

    private static Map<String,Pachet> colectiePachete=new HashMap<>();


    private Pachet(String destinatie, float pret) {
        this.destinatie = destinatie;
        this.pret = pret;
    }

    public static synchronized Pachet getInstance(String destinatie,float pret){
        if(!colectiePachete.containsKey(destinatie)){
            Pachet pachet=new Pachet(destinatie,pret);
            colectiePachete.put(destinatie,pachet);
        }
        return colectiePachete.get(destinatie);
    }


    @Override
    public String toString() {
        return "Pachet{" +
                "destinatie='" + destinatie + '\'' +
                ", pret=" + pret +
                '}';
    }
}
