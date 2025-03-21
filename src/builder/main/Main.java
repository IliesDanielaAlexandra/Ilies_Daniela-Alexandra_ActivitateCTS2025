package builder.main;

import builder.classes.IPachetTransport;
import builder.classes.PachetTransportBuilder;

public class Main {
    public static void main(String[] args) {
        IPachetTransport pachetBuilder=new PachetTransportBuilder();
        var pachet=((PachetTransportBuilder)pachetBuilder).setAreAC(true).setAreWiffi(true).build();
        System.out.println(pachet);

        var pachet1= ((PachetTransportBuilder)pachetBuilder).build();
        System.out.println(pachet1);

        var pachet2= ((PachetTransportBuilder)pachetBuilder).setAreTV(true).setAreWiffi(true).setAnimaleCompanie(true).build();
        System.out.println(pachet2);

    }
}
