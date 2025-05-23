package Comportamentale.Strategy;

import java.util.ArrayList;

public class StrategieCarbohidratiMinim  implements  IPeocesabil{
    @Override
    public OfertaMeniu alegeMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCarbohidratiMinim=listaMeniuri.get(0);
        for(OfertaMeniu oferta: listaMeniuri){
            if(oferta.getNrCalori()< ofertaMeniuCarbohidratiMinim.getNrCalori())
                ofertaMeniuCarbohidratiMinim= oferta;
        }
        return ofertaMeniuCarbohidratiMinim;
    }
}
