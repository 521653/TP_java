import Classes.Produit;
import Classes.Stock;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit(12,"style",1500,12);
        Produit p2 = new Produit(12,"azoor",2000,6);
        Produit p3 = new Produit(16,"champagne",15000,10);
        Produit p4 = new Produit(14,"wishky",20000,8);
        p1.afficher();
        p1 = p1.reduir(10);
        p1.afficher();
        Stock stock = new Stock(5);
        stock.ajouter(p1);
        stock.ajouter(p2);
        stock.ajouter(p3);
        stock.afficherStock();
        stock.supprimer(p2);
        System.out.println("--------------------------------");
        if (stock.rechercheNom(p2))
            System.out.println("le produit existe ");
        else
            System.out.println("le produit n'existe pas ");
        if (stock.rechercheRef(p3))
            System.out.println("le produit existe ");
        else
            System.out.println("le produit n'existe pas ");
    }
}