package Spital.A4.Main;

import Spital.A4.Prototype.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta= new Reteta("CremaMaini", 3,"Aloe Vera",0.5);
        Reteta reteta1=(Reteta) reteta.copiere();
        System.out.println(reteta);
        System.out.println(reteta1);

    }
}
