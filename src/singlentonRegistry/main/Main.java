package singlentonRegistry.main;

import singlentonRegistry.classes.Pachet;

public class Main {
    public  static  void main(String[] args){
        Pachet pachet=Pachet.getInstance("Barcelona", 6000);
        System.out.println(pachet);

        Pachet pachet1=Pachet.getInstance("Barcelona", 500);
        System.out.println(pachet1);
    }
}
