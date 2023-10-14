public class Testeur extends Employe {
	private int nbEreurs;
    private static final double BONUS_ERREUR = 10000;
    public Testeur(int num, String nom, double salaire, int nbEreurs){
    	super( num , nom , salaire );
    	this.nbEreurs = nbEreurs;
    	System.out.println(", C'est un Testeur");
    }
     public Testeur(int num, String nom, double salaire, double taux, int nbEreurs){
    	super( num , nom , salaire , taux);
    	this.nbEreurs = nbEreurs;
    	System.out.println(", C'est un Testeur");
    }
    public double revenuAnnuel() {

        return super.revenuAnnuel()+BONUS_ERREUR*nbEreurs  ;
    }
    public String toString(){
    	return super.toString()+"\n\t A corriger "+ nbEreurs + "Ereurs";
    }

}