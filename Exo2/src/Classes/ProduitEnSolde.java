package Classes;

public class ProduitEnSolde extends Produit{
    private double remise;

    public ProduitEnSolde() {
        super();
        remise= 0.1;
    }

    public ProduitEnSolde(int code, String des, double prix, String categorie, double remise) {
        super(code, des, prix, categorie);
        this.remise = remise;
    }

    @Override
    public double getPrix() {
        return super.getPrix()*(1-remise);
    }
    public String toString(){
        return super.toString()+", la remise :"+remise;
    }
}
