package AgeTour.singlenton.main;

import  AgeTour.singlenton.classes.Agentie;

public class Main {
    public  static  void  main(String[] args){
        Agentie agentie1=Agentie.getInstance("AniTour",15);
        System.out.println(agentie1);
    }
}
