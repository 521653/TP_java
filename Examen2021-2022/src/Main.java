import MesClasses.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Achat> liste = new ArrayList<>();
        Produit p1 = new Produit(1,"clavier",10000,"informatique");
        Produit p2 = new Produit(2,"lampe",1000,"electronique");
        Produit p3 = new Produit(3,"swicht",25000,"informayique");
        Achat a1 = new Achat(1,p1,10);
        Achat a2 = new Achat(2,p2,100);
        Achat a3 = new Achat(3,p3,1000);
        liste.add(a1);
        liste.add(a2);
        liste.add(a3);

        Facture facture = new Facture(LocalDate.of(2022,5,4),liste);
        System.out.println(facture.toString());
    }
}