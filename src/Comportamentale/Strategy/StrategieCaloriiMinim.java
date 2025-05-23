package Comportamentale.Strategy;

import java.util.ArrayList;

public class StrategieCaloriiMinim implements  IPeocesabil{
    @Override
    public OfertaMeniu alegeMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCaloriMinime=listaMeniuri.get(0);
        for (OfertaMeniu oferta: listaMeniuri){
            if(oferta.getNrCalori()<ofertaMeniuCaloriMinime.getNrCalori())
                ofertaMeniuCaloriMinime=oferta;

        }
        return ofertaMeniuCaloriMinime ;
    }
}
