package Classes;

public class Compte {
    private int numCLient;
    private Client proprietaire;
    protected double solde= 0;
    private static int cpt = 100;

    public Compte() {
    }

    public Compte(Client proprietaire) {
        cpt++;
        this.numCLient = cpt;
        this.proprietaire = proprietaire;
        solde = 0;
    }

    public Compte(Client proprietaire, double solde) {
        cpt++;
        numCLient = cpt;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public int getNumCLient() {
        return numCLient;
    }

    public double getSolde() {
        return solde;
    }
    public void depot(double montant){
        solde += montant;
    }
    public void retrait(double montant){
        if (solde >= montant)
            solde -= montant;
        else
            System.out.println("Votre solde est inssuffisant pour faire un retrait");
    }
    public String toString(){
        return "Numero :"+numCLient+", proprietaire :"+proprietaire.getNom()+", Solde :"+solde;
    }

}
