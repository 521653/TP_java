 import java.time.LocalDate;
 import java.time.Period;
public class Employe {
	public static int n  = 1000;
	private int matricule;
	private String nom ;
	private LocalDate dn ;// date de naissance 
	private LocalDate da ;// date d'embauche 
	protected double salaire ;

	public Employe(){ n++ ; this.matricule = matricule ;}
	public Employe(String nom,LocalDate dn, LocalDate da, double salaire){
		n++;
		this.matricule = n;
		this.nom = nom ;
		this.dn = dn ;
		this.da = da ; 
		this.salaire = salaire;
	}
	public double getIR(){
		double r = salaire*12 ;
		if( r <= 630000.0 )
			return 0 ;
		else if ( r > 630000.0 && r <= 1500000.0)
			return 0.2 ;
		else if ( r > 1500001.0 && r <= 4000000.0)
			return 0.3 ;
		else if ( r > 4000001.0 && r <= 8000000.0)
			return 0.35 ;
		else if ( r >  8000001.0 && r <= 13500000.0)
			return 0.37 ;
		else 
			return 0.4 ;
	} 
  public double SalaireNet(){
  	return salaire * ( 1 - getIR());
  }
  public int getAge(){
  	 Period p = Period.between( dn , LocalDate.now());
  	 return p.getYears() ;
  }
  public int getAncienete(){
  	Period p = Period.between( da , LocalDate.now());
  	 return p.getYears() ;
  } 
  public LocalDate dateRetraite( int ar ){  // ar = age de retraite 
    return dn.plusYears( ar );
  }
  public String toString(){
  	return "Nom : "+nom+", Matricule :"+matricule+" ,Salaire : "+SalaireNet()+", Date de retraite : "+dateRetraite(60);
  }
  public boolean equals( Employe emp ){
  	return matricule == emp.matricule;
  }
} 