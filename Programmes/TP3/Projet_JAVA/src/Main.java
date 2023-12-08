import MesClasses.*;


import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Parking p = new Parking("Zig_dem","Escale");
        Voiture v = new Voiture();
        p.stationner(2);
        //p.retirer(2);
        p.afficheEtetParking();
    }



}