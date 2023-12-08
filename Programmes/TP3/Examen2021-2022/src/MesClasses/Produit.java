package MesClasses;

public class Produit {
    private  int code;
    private String des;
    private double prix;
    private String cat ;
    public Produit(){}
    public Produit(int code,String des, double prix,String cat){
        this.code = code;
        this.des = des;
        this.prix = prix;
        if("informatique".equals(cat) || "electronique".equals(cat))
            this.cat = cat;
    }
    public String getCat(){
        return this.cat;
    }
    public void setCat(String Cat){
        this.cat = cat;
    }
    public double getPrix(){
        return this.prix;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public String getDes(){
        return this.des;
    }
    public void setDes(String des){
        this.des = des;
    }
    public String toString(){
        return "code : "+code+", designation : "+des+", prix : "+prix+", categorie : "+cat;
    }
    public boolean equals(Produit p){
        return ((code == p.code)&&(des.equals(p.des))&&(cat.equals(p.cat)));
    }
}
