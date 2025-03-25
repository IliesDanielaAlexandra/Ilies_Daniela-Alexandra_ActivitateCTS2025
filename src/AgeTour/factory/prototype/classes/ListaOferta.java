package AgeTour.factory.prototype.classes;

import java.util.ArrayList;
import java.util.List;

public class ListaOferta implements IListaOferta{

    public List<String> listaDestinatii=new ArrayList<>();
    public  String cumparator;

    public ListaOferta(List<String> listaDestinatii, String cumparator) {
        this.listaDestinatii = listaDestinatii;
        this.cumparator = cumparator;
    }

    public ListaOferta() {
    }

    @Override
    public IListaOferta clone() {
        IListaOferta clona =new ListaOferta();

        return clone();
    }
}
