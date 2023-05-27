package Classe;

public class Complexe {
    double a;
    double b;
    public Complexe(){
    }
    public Complexe(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void afficher(){
        if (a != 0 && b != 0){
            if (a > 0 && b > 0){
                if (b == 0)
                    System.out.println(a+"+i");
                else
                    System.out.println(a+"+"+b+"i");
            }else if (b < 0)
                if (b== -1)
                    System.out.println(a+"- i");
                else
                    System.out.println(a+" "+b+"i");
        }
        else if (b == 0)
            System.out.println(a);
        else
            System.out.println(b+"i");

    }
    public Complexe somme(Complexe c){
        return new Complexe(c.a+a,c.b+b);
    }
    public Complexe produit(Complexe c){
        return new Complexe(a*c.a-b*c.b,a*c.b+b*c.a);
    }
    public Complexe somRe(double x){
        return new Complexe(a+x,b);
    }
    public Complexe prodRel(double x){
        return new Complexe(a*x,b*x);
    }
}
