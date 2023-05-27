package Classes;

public class CompteCourant extends Compte{
    private  double coutOperation = 500;

    public CompteCourant(Client proprietaire, double coutOperation) {
        super(proprietaire);
        this.coutOperation = coutOperation;
    }

    public CompteCourant(Client proprietaire, double solde, double coutOperation) {
        super(proprietaire, solde);
        this.coutOperation = coutOperation;
    }

    public void depot(double montant){
        solde += montant - coutOperation;
    }
    public void retrait(double montant){
        double f = montant + coutOperation;
        if (solde >= f)
            solde -= f;
        else
            System.out.println("Votre solde est inssuffisant pour faire un retrait");
    }
    public String toString(){
        return super.toString()+", Cout d'operation :"+coutOperation;
    }
}
