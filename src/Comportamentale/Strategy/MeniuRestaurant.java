package Comportamentale.Strategy;

import java.util.ArrayList;

public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> listaMeniuri=new ArrayList();
    private IPeocesabil strategieAlegere;

    public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
        this.listaMeniuri.add(ofertaMeniu);
    }
    public void setStrategieAlegere(IPeocesabil strategieAlegere){
        this.strategieAlegere=strategieAlegere;
    }

    public OfertaMeniu alegeOferta(){
        if(strategieAlegere!= null){
            return  strategieAlegere.alegeMeniu(listaMeniuri);

        }
        else
            throw new UnsupportedOperationException();

    }

}
