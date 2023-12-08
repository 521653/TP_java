package MesClasses;

import java.time.LocalDate;

public class Formateur extends Employe{
    private  final static  double REMUNERATION = 10000;
    private int nbsup;

    public Formateur() {
        super();
    }

    public Formateur(String nom, LocalDate dateNaiss, LocalDate dateEmb, double salaire, int nbsup) {
        super(nom, dateNaiss, dateEmb, salaire);
        this.nbsup = nbsup;
    }
    public double salaireNet(){
        return super.salaireNet()+(REMUNERATION*nbsup);
    }
}
