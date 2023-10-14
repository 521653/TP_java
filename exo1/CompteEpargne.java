public class CompteEpargne extends Compte {
	 private double taux ;
	 public CompteEpargne ( Client proprietaire, double taux  ){
	 	super( proprietaire , taux );
	 }
	 public CompteEpargne ( Client proprietaire , double solde , double taux){
	 	super( proprietaire , solde);
	 	this.taux = taux ;
	 }
	 public double calculInteret(){
	 	double  i = taux*getSolde();
	 	solde += i;
	 	return i ;
	 }
	 public String toString(){
	 	return super.toString()+ ", Taux d'interet : "+ taux ;
	 }
}