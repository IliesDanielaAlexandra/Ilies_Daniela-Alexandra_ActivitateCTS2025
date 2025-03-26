package Spital.A3;

import Spital.A2.PersonalSpital;

public class ProgramMain {
    public static void main(String[] args) throws Exception {

        ITipPersonalSpital personalMedical = new Medic();
        System.out.println(personalMedical.descriere());



        ITipPersonalSpital personalNonMedical = new Brancardier();
        System.out.println(personalNonMedical.descriere());


    }
}
