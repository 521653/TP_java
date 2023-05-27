package Classe;

public class Rationnel {
    int num;
    int den;

    public Rationnel() {
    }

    public Rationnel(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public Rationnel somme(Rationnel r){
        return  new Rationnel(r.num*den + r.den*num,den*r.den);
    }
    public Rationnel produit(Rationnel r){
        return  new Rationnel(r.num*den + r.den*num,den*r.den);
    }
    public Rationnel multiplier(Rationnel r){
        return new Rationnel(num*r.num,den*r.den);
    }
    public Rationnel diviser(Rationnel r){
        return new Rationnel(num*r.num,den*r.den);
    }
    public Rationnel somInt(int x){
        return new Rationnel(num+den*x,den);
    }
     public Rationnel prodInt(int x){
        return new Rationnel(num-den*x,den);
    }
    public Rationnel miltInt(int x){
        return new Rationnel(num*x,den);
    }
    public Rationnel divtInt(int x){
        return new Rationnel(num,den*x);
    }

    public boolean egal(Rationnel r){
        return (num*r.den == den*r.num);
    }
    public boolean inferieur(Rationnel r){
        return (num*r.den < den*r.num);
    }
    public void afficher(){
        if (num != 0 && den != 0){
            if (num > 0 && den > 0){
                System.out.println(num+"/"+den);
            }else if (den < 0)
                System.out.println((-1*num)+"/"+(-1*den));
            else
                System.out.println((-1*num)+"/"+(-1*den));
        }
        else if (num == 0)
            System.out.println(0);
        else
            System.out.println("impossible");
    }
}
