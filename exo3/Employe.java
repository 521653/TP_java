 import java.util.Scanner ;
 public class Employe {
	private int num ; 
	private String nom ;
	private double salaire ;
	private double taux ;
	private double prime ;
   // constructeur par defaut 
	public Employe(){}
   // constructeur 
   public Employe( int num, String nom, double salaire){
   	this.num = num ;
   	this.nom = nom ; 
   	this.salaire = salaire ;
   	taux = 1.0 ;
   	prime = 0.0;

   } 
   // un autre constructeur 
    public Employe( int num, String nom, double salaire, double taux){
    	this.num = num ;
    	this.nom = nom ; 
    	this.salaire = salaire ;
    	prime = 0.0 ;

    	 System.out.print(" un nouvel Employe :"+num+" , " +nom);
    	if ( taux < 0.1 )
    		this.taux = 0.1 ;
    	else if ( taux == 100)
    		this.taux = 1.0;
    	else 
    		this.taux = taux ;
    }
    public double revenuAnnuel() {
        return 12 * salaire * taux + prime;
    }
    public String toString(){
    	return num+" "+nom+"\n\t"+"TauxDOcupation:"+(taux+100)+"%.salaireAnnuel:"+ revenuAnnuel();
    }
    /* on a ajouter ca */
    public void demandePrime(){
    	Scanner clavier = new Scanner( System.in);
    	double montant , p ;
    	int i = 0;
    	do {
    		System.out.println(" Montant de la prime souhaitée ");
    		montant = clavier.nextDouble();
    		i++ ;
    		p = 0.2 * revenuAnnuel();
    		if(p < montant)
    			System.out.print(" trop cher !");
    	}while ( p < montant && i < 5 );
    	if( i < 5)
    		prime = montant;
    }

}