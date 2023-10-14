public class Programmeur extends Employe{
	private int nbProjets ;
    private static final double BONUS_PROJET = 20000;
    public Programmeur ( int num, String nom, double salaire, int nbProjets){
    	super( num , nom , salaire );
    	this. nbProjets = nbProjets;
    	System.out.println(", C'est un Programmeur");
    }
    public Programmeur ( int num, String nom, double salaire, double taux, int nbProjets){
    	super( num , nom , salaire , taux);
    	this. nbProjets = nbProjets;
    	System.out.println(", C'est un Programmeur");
    }
    public double revenuAnnuel() {
         return super.revenuAnnuel()+BONUS_PROJET * nbProjets;
    }
    public String toString(){
    	return super.toString()+"\n\t A realiser  "+ nbProjets + "Projets ";
    }

}