package MesClasses;

public class ProduitEnSolde extends Produit{
    private double prime;
    public ProduitEnSolde(int code, String des, double prix, String cat){
        super(code, des, prix, cat);
        prime = 0.1;
    }
    public ProduitEnSolde(int code,String des, double prix,String cat, double prime){
        super(code,des,prix,cat);
        this.prime = prime;
    }
    public  double getPrix(){
        return super.getPrix()-(prime*super.getPrix());
    }
    public String toString(){
        return super.toString()+", Prime : "+prime;
    }

}
