package Classes;

public class Produit {
    private int numRef;
    private String nom;
    private double prixVente;
    private int quantite;

    public Produit() {
    }

    public Produit(int numRef, String nom, double prixVente, int quantite) {
        this.numRef = numRef;
        this.nom = nom;
        this.prixVente = prixVente;
        this.quantite = quantite;
    }

    public int getNumRef() {
        return numRef;
    }

    public void setNumRef(int numRef) {
        this.numRef = numRef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public Produit reduir(int n){
        if (quantite >= n)
            return new Produit(numRef,nom,prixVente,quantite-n);
        else
            return new Produit(numRef,nom,prixVente,quantite);
    }
    public Produit augmenter(int n){
        return new Produit(numRef,nom,prixVente,quantite+n);
    }
    public void afficher(){
        System.out.println("Le numero de reference du produit est :"+numRef);
        System.out.println("Le nom du produit est :"+nom);
        System.out.println("Le prix de vente du produit est :"+prixVente);
        System.out.println("Sa quantite en stock est :"+quantite);
        System.out.println("--------------------------------");
    }
}
