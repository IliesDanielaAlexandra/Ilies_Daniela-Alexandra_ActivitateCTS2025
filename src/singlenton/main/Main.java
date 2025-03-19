package singlenton.main;

import  singlenton.classes.Agentie;

public class Main {
    public  static  void  main(String[] args){
        Agentie agentie1=Agentie.getInstance("AniTour",15);
        System.out.println(agentie1);
    }
}
