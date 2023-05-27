package Classes;
public class Stock {
    private Produit[] tabProd;
    private int taille;
    private static int nbProd = 0;
    public Stock(int taille){
        this.taille = taille;
        tabProd = new Produit[taille];
    }

    public Produit[] getTabProd() {
        return tabProd;
    }

    public void setTabProd(Produit[] tabProd) {
        this.tabProd = tabProd;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getNbProd() {
        return nbProd;
    }

    public void setNbProd(int nbProd) {
        this.nbProd = nbProd;
    }

    public void ajouter(Produit p){
        if (nbProd < taille){
            tabProd[nbProd] =p;
            nbProd++;
        }
        else
            System.out.println("Stock est pleint ");
        }

    public void supprimer(Produit p){
        for (int i = 0; i < nbProd-1; i++) {
            if (tabProd[i]== p) {
                for (int j = i; j < nbProd; j++) {
                    tabProd[j] = tabProd[j + 1];
                }
            }
        }
        nbProd--;
    }
    public boolean rechercheRef(Produit p){
        for (int i = 0; i < nbProd; i++) {
            if (tabProd[i].getNumRef()==p.getNumRef())
                return true;
        }
        return false;
    }
    public boolean rechercheNom(Produit p){
        for (int i = 0; i < nbProd; i++) {
            if (tabProd[i].getNom()==p.getNom())
                return true;
        }
        return false;
    }
    public void afficherStock(){
        for (int i = 0; i < nbProd; i++) {
            tabProd[i].afficher();
        }
        System.out.println("La teille du stock est de :"+taille);
        System.out.println("Le nombre de produit du stock est de :"+nbProd);
    }
}
