public class ProduitEnSolde extends Produit {
    private double remise;

    // Constructeurs
    public ProduitEnSolde() {
        this.remise= 10.;
    }

    public ProduitEnSolde(String code, String designation, double prix, String categorie, double remise) {
        super( code , designation, prix, categorie);
        this.remise = remise;
    }

    // Accesseurs
    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public double getPrix() {
        return super.getPrix() * (1 - remise / 100);
    }

    // Méthodes
    public String toString() {
        return super.toString() + "  ,  " + remise;
    }
}