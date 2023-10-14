public class Teste {
    public static void main(String[] args) {
        Produit[] tab = new Produit[5];
        tab[0] = new Produit("id1", "Ordinateur portable", 160000., "Informatique");
        tab[1] = new Produit("id2", "Imprimante", 14000., "Informatique");
        tab[2] = new ProduitEnSolde("id3", "Télévision", 50000., "Électronique", 20.);
        tab[3] = new ProduitEnSolde("id4", "téléphone", 80000., "Électronique", 15.);
        tab[4] = new Produit("id5", "Disque dur externe", 30000., "Informatique");

        for (Produit prod: tab) {
            System.out.println(prod);
            /* for ( int i = 0 ; i < 5 ; i++){
                System.out.println(tab[i]);
               }
             */
        }
    }
}