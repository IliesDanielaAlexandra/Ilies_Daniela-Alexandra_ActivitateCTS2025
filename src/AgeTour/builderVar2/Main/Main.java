package AgeTour.builderVar2.Main;

import AgeTour.builderVar2.Classes.PachetTransportConstructor;

public class Main {
    public static void main(String[] args) {
        PachetTransportConstructor constructor=new PachetTransportConstructor();
        var pachet1= constructor.setAreLocFumat(true).setAreAC(true).constructor();
        var pachet2= constructor.setAreAccesAnimale(true).setAreWiffi(true).constructor();

        System.out.println(pachet1);
        System.out.println(pachet2);
    }
}
