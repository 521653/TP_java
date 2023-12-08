package MesClasses;

import java.time.LocalDate;
import java.time.Period;

public class Employe {
    private static int mat = 0;
    private String nom;
    private LocalDate dateNaiss;
    private LocalDate dateEmb;
    private double salaire;
    public Employe(){}
    public Employe(String nom, LocalDate dateNaiss,LocalDate dateEmb,double salaire){
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.dateEmb = dateEmb;
    }
    public double getIR(){
        double revenuAnnuel = salaire*12;
        if (revenuAnnuel> 0 && revenuAnnuel <= 630000)
            return 0;
        else if (revenuAnnuel> 630000 && revenuAnnuel <= 1500000) {
            return 0.2;
        } else if (revenuAnnuel > 1500000 && revenuAnnuel <=4000000) {
            return 0.3;
        } else if (revenuAnnuel > 4000000 && revenuAnnuel <= 8000000) {
            return 0.35;
        } else if (revenuAnnuel > 8000000 && revenuAnnuel <= 13500000) {
            return 0.37;
        }else
            return 0.4;
    }
    public double salaireNet(){
        return salaire*(1-getIR());
    }
    public int getAge(){
        LocalDate tay = LocalDate.now();
        Period p= Period.between(dateNaiss,tay);
        return p.getYears();
    }
    public int getAnciennete(){
        Period p =Period.between(LocalDate.now(),dateEmb);
        int years = p.getYears();
        return years;
    }
    public LocalDate dateRetraite(int ageRetraite){
        return dateNaiss.plusYears(ageRetraite);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", dateEmb=" + dateEmb +
                ", salaire=" + salaire +
                '}';
    }
    public boolean equals(Employe e){
        return (mat==e.mat);
    }
}
