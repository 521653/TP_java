public class CompteCourant extends Compte {
	private double cout ;
	public CompteCourant( Client proprietaire ){
		super( proprietaire );
		 cout = 500 ;
	}
	public CompteCourant( Client proprietaire, double cout ){
		this( proprietaire);
		this.cout = cout ;
	}
	public CompteCourant( Client proprietaire , double solde , double cout ){
		super( proprietaire, solde);
		this.cout = cout;
	}
	public void deposer ( double montant ){
		solde = solde + montant - cout ;
	}
	public void retirer (double montant ){
		double f =  montant + cout ;
		 if( solde >= f )
		 	solde = solde - f;
		 else 
		   System.out.println(" le solde de votre copte est issuffisant ");
	}
	public String toString(){
		return super.toString()+" cout "+cout  ;
	}
}