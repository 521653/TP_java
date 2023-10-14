public class Compte {
	 private int numero ; 
	 private Client proprietaire ;
	 protected double solde ;
	 private static int n = 1000 ;
	 public Compte ( Client proprietaire){
	 	n++;
	 	numero = n;
	 	this.proprietaire = proprietaire ;
	 	solde = 0;
	 }
	 public int getNumero(){ return numero; }
	 public double getSolde(){ return solde ;}
	 public Compte( Client proprietaire , double solde){
	 	n++;
	 	numero = n;
	 	this.proprietaire = proprietaire ;
	 	this.solde = solde ;
	 }
	 public void deposer ( Double montant ){
	 	solde += montant ; 
	 }
	 public void retirer ( double montant ){
	 	 if( montant <= solde )
	 	 	solde -= montant ;
	 	 else 
	 	 	System.out.println(" votrze solde est insuffisant ");
	 }
	 public String toString(){
	 	return "Numero: "+numero+", Solde: "+solde+", proprietaire: "+proprietaire.getNom();
	 }
}