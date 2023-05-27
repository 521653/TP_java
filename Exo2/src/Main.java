import Classes.Produit;
import Classes.ProduitEnSolde;

public class Main {
    public static void main(String[] args) {
        Produit[] tabProd = new Produit[5];
        tabProd[0] = new Produit(14,"Map",40002, "informatique");
        tabProd[1] = new Produit(15,"application",15000,"informatique");
        tabProd[2] = new Produit(78,"cable",1000, "electronique");
        tabProd[3] = new ProduitEnSolde(12,"logiciel",250000, "informatique",0.15);
        tabProd[4] = new ProduitEnSolde(96,"prise",200031, "electronique",0.20);
       /* for (int i = 0; i < tabProd.length ; i++) {
            System.out.println(tabProd[i]);
        }*/
        for (Produit p:
             tabProd) {
                System.out.println(p);
        }
        System.out.println(tabProd[3].getPrix());
        if(tabProd[0].equals(tabProd[2]))
            System.out.println("les deux produit sont identique");
        else
            System.out.println("les deux produit ne sont pas identique");
    }
}