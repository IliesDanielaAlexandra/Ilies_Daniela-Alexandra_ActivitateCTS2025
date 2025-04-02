package PrototipModeleDiverse.Reclama.Program;

import PrototipModeleDiverse.Reclama.Classes.Benner;
import PrototipModeleDiverse.Reclama.Classes.IBenner;
import PrototipModeleDiverse.Reclama.Classes.IPanouReclama;

public class Program {

    public static void main(String[] args) {

        IPanouReclama banner1=new Benner("PRO-TV", 2,"Bucuresti" );
        IPanouReclama banner2=((IBenner)banner1).copiaza();

        System.out.println((banner1));
        System.out.println((banner2));

        IPanouReclama banner3= new Benner("C&A",10,"Cluj Napoca");
        IPanouReclama benner4=((IBenner)banner3).copiaza();
        System.out.println((banner3));
        System.out.println((benner4));


    }
}
