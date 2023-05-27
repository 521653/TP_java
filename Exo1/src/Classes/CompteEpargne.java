package Classes;

public class CompteEpargne extends Compte{
    private double tauxInteret;

    public CompteEpargne(Client proprietaire, double tauxInteret) {
        super(proprietaire);
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne(Client proprietaire, double solde, double tauxInteret) {
        super(proprietaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public double calculInteret(){
        double i = getSolde() * tauxInteret;
        solde += i;
        return i;
    }
    public String toString(){
        return super.toString() +", le taux d'intéret :"+tauxInteret;
    }
}
