package EX1MagazineMall;

import EX1MagazineMall.builder.*;

public class Program {

    public static void main(String[] args) {

        BuildMagazin buildMagazin=new BuildMagazin("Mega", 2,150);
        Magazin m1=buildMagazin.build();
        System.out.println(m1);

        IDecorarePodea d= new DecorarePodea(TipMaterialPodea.artizanal, "Marmura");
        Magazin m2=buildMagazin.build();

        System.out.println(m2);

    }
}
