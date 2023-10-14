// CLASSE COMPTE EPARGNE 
class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(Client proprietaire, double tauxInteret) {
        super(proprietaire);
        this.tauxInteret = tauxInteret;
    }

    public void calculInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);
    }

    @Override
    public String toString() {
        return "CompteEpargne [numero=" + getNumero() + ", proprietaire=" + getProprietaire() + ", solde=" + getSolde() + "]";
    }
}