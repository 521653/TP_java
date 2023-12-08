package MesClasses;

public class Compte {
    private static int numCompte = 0;
    private Client proprietaire;
    protected double solde;

    public static int getNumCompte() {
        return numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public Compte(Client proprietaire) {
        this.proprietaire = proprietaire;
        solde = 0;
    }

    public Compte(Client proprietaire, double solde) {
        this.proprietaire = proprietaire;
        this.solde = solde;
    }
    public void depots(double montant){
        solde += montant;
    }
    public void retrait(double montant){
        if (montant <= solde)
            solde -= montant;
        else
            System.out.println("le solde est insuffisant pour effectuer un retrait");
    }
    public String toString(){
        return "numero : "+numCompte+
                "\n proprietaire : "+proprietaire+
                "\n solde : "+solde;
    }

}
