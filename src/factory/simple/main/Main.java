package factory.simple.main;

import factory.simple.Factory;
import factory.simple.PachetTuristic;
import factory.simple.TipPachete;

public class Main {
    public static void main(String[] args) throws Exception {
        Factory factory=new Factory();
        PachetTuristic p1=factory.pachetTuristic(TipPachete.CuCazare);
        p1.descriere();
        PachetTuristic p2=factory.pachetTuristic(TipPachete.AllIncluse);
        p2.descriere();
        PachetTuristic p3= factory.pachetTuristic(TipPachete.CuTransport);
        p3.descriere();
    }
}
