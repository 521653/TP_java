package Classes;

public class Produit {
    private int code;
    private  String des;
    /*public enum Categorie{
        INFORMATIQUE,
        ELECTRONIQUE
    }
    private Categorie categorie;*/
    private String categorie;
    private double prix;

    public Produit() {
    }

    public Produit(int code, String des, double prix, String categorie) {
        this.code = code;
        this.des = des;
        this.prix = prix;
        if (categorie.equals("informatique")||categorie.equals("electronique")){
            this.categorie = categorie;
        }else
            System.out.println("mettez la bonne catégorie");
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        if (categorie.equals("informatique")||categorie.equals("electronique")){
            this.categorie = categorie;
        }else
            System.out.println("mettez la bonne catégorie");
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String toString(){
        return "le code :"+code+", la désignation : "+des+", le prix :"+prix+", la catégorie :"+categorie;
    }
    public boolean equals(Produit p){
        return (code == p.code)&&(categorie == p.categorie)&&(des == p.des);
    }

}
