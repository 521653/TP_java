package MesClasses;

public class Achat {
    private int numAchat;
    private Produit p;
    private int qt;
    public Achat(int numAchat,Produit p, int qt){
        this.numAchat = numAchat;
        this.p = p;
        this.qt = qt;
    }
    public double montantAchat(){
        return p.getPrix()*qt;
    }
    public boolean equals(Achat a){
        return ((numAchat == a.numAchat)&&(p.equals(a.p)));
    }
    public String toString(){
        return "\ndesignation du produit : "+p.getDes()+
                "\nquantite : "+qt+
                "\nprix total : "+montantAchat();
    }
}
