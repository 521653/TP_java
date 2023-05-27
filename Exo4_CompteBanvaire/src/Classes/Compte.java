package Classes;

public class Compte {
    private static int num;
    private Client proprietaire;
    private double solde;
    private static int cmp=0;

    public Compte() {
    }

    public Compte(Client proprietaire) {
        cmp++;
        this.proprietaire = proprietaire;
        solde = 0;
        num= cmp;
    }
    private boolean issuffissant(double montant){
        if (solde >= montant){
            return true;
        }
        return false;
    }
    public void crediter(double montant){
        solde += montant;
    }
    public void debiter(double montant){
        if (issuffissant(montant))
            solde -= montant;
        else
            System.out.println("votre solde est insuffisant");
    }
    public void virement(Compte c,double montant){
        if (issuffissant(montant)){
            solde -= montant;
            c.solde += montant;
            System.out.println("le nouveau nouveau du compte est :"+solde);
        }
        else
            System.out.println("le sode du compte est insuffisant pour faire un virement.");
    }
    public static int Nbcompte(){
        return cmp;
    }
    public void visualiser(){
        System.out.print("le proprietaire est :");
        proprietaire.afficher();
        System.out.println("le montant actuel est :"+solde);
        System.out.println("le numero du compte est :"+num);
    }
}
