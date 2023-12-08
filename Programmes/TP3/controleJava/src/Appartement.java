public class Appartement extends Logement {
    private int numIm;

    public Appartement(double prix, int nbrP,int numIm) {
        super(prix, nbrP);
        this.numIm = numIm;
    }
    public String ToString(){
        return super.toString()+" numIm "+numIm;
    }
}
