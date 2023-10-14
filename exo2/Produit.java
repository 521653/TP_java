public class Produit {
    private String code;
    private String designation;
    private double prix;
    private String categorie;

    // Constructeurs
    public Produit() { }

    public Produit(String code, String designation, double prix, String categorie) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.categorie = categorie;
    }

    // Accesseurs
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    // Méthodes
    public String toString() {
        return code + "  ,  " + designation + "  ,  " + prix + "  ,   " + categorie;
    }

    public boolean equals(Produit autre) {
        return code.equals(autre.getCode()) && designation.equals(autre.getDesignation()) && categorie.equals(autre.getCategorie());
    }
}




