// CLASS COMPTE COURANT 
class CompteCourant extends Compte {
    private double coutOperation;

    public CompteCourant(Client proprietaire) {
        super(proprietaire);
        this.coutOperation = 500.0;
    }

    public void setCoutOperation(double coutOperation) {
        this.coutOperation = coutOperation;
    }

    @Override
    public void deposer(double montant) {
        super.deposer(montant - coutOperation);
    }

    @Override
    public void retirer(double montant) {
        super.retirer(montant + coutOperation);
    }

    @Override
    public String toString() {
        return "CompteCourant [numero=" + getNumero() + ", proprietaire=" + getProprietaire() + ", solde=" + getSolde() + "]";
    }
}