public class Logement {
    private static int num= 0;
    private double prix;
    private int nbrP;
    private Personne locataire;

    public Logement(double prix, int nbrP) {
        num++;
        this.prix = prix;
        this.nbrP = nbrP;
    }
    public String toString(){
        return " num "+num+" prix "+prix+" pieces "+nbrP+" locataire "+ locataire.toString();
    }
    public boolean estPlusCher(Logement logement){
        if (prix > logement.prix)
            return true;
        return false;
    }
    public boolean estOccup(){
        if (locataire != null)
            return true;
        return false;
    }
    public void louer(Personne p){
        if (!estOccup())
            this.locataire = p;
        else
            System.out.println("le logement est occupé");
    }
    public void louer(Personne p,double prix){
        if (!estOccup()){
            this.locataire = p;
            this.prix =prix;
        } else
            System.out.println("le logement est occupé");
    }
}
