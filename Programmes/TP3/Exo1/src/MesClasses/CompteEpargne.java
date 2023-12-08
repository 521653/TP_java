package MesClasses;

public class CompteEpargne extends Compte{
    private double ti;
    public CompteEpargne(Client proprietaire,double ti) {
        super(proprietaire);
        this.ti  =ti;
    }

    public CompteEpargne(Client proprietaire, double solde, double ti) {
        super(proprietaire, solde);
        this.ti = ti;
    }
    public double calculInteret(){
         return (getSolde()+(ti*getSolde()));
    }
}
