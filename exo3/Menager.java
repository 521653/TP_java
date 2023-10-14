public class Menager extends Employe {
	private int nbjours ;
	private int nbClient;
	private static final double BONUS_CLIENT = 50000;
    private static final double BONUS_VOYAGE = 10000;

    public Menager( int num, String nom, double salaire, int nbjours, int nbClient ){
    	super( num , nom , salaire );
    	this.nbjours = nbjours;
    	this.nbClient = nbClient ;
    	System.out.println ( " , C 'est un Menager ");
    }
     public Menager (int num, String nom, double salaire, double taux , int nbjours, int nbClient){
     	super( num , nom , salaire , taux  );
     	this.nbjours = nbjours;
    	this.nbClient = nbClient;
    	System.out.println ( " , C 'est un Menager ");
     }
     public double revenuAnnuel(){
     	return super.revenuAnnuel() +  BONUS_CLIENT * nbClient + BONUS_VOYAGE * nbjours;
     }
     public String toString(){
     	return super.toString()+"\n\t Avoyage "+nbjours+"jours et à apporter "+nbClient+" nouveau client "; 
     }
}