 // CLASS COMPTE 
 class Compte {
    private static int compteur = 0;
    private int numero;
    private Client proprietaire;
    private double solde;

    public Compte(Client proprietaire) {
        this.numero = ++compteur;
        this.proprietaire = proprietaire;
        this.solde = 0.0;
    }

    public Compte(Client proprietaire, double solde) {
        this.numero = ++compteur;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte [numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde + "]";
    }
}