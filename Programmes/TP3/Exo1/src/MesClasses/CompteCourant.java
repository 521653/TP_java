package MesClasses;

public class CompteCourant extends Compte{
    private double coutOp;

    public CompteCourant(Client proprietaire) {
        super(proprietaire);
        coutOp = 500;
    }
    public CompteCourant(Client proprietaire, double solde,double coutOp ){
        super(proprietaire, solde);
        this.coutOp = coutOp;
    }
    public void depots(double montant){
        solde = montant-coutOp;
    }

    @Override
    public void retrait(double montant) {
        super.retrait(montant);
        solde -=coutOp;
    }
}
