 import java.time.LocalDate;
 public class Formateur extends Employe {
 	private int hs; // heure superieure 
 	private static double remu = 10000 ;
 	public Formateur(){}
 	public Formateur( String nom,LocalDate dn, LocalDate da, double salaire ,int hs , double remu){
 		super( nom , dn ,da, salaire);
 		this.hs = hs ;
 		this.remu = remu ;
 	}
 	public Formateur(String nom,LocalDate dn, LocalDate da, double salaire, int hs ){
 		this( nom , dn , da, salaire , hs , 10000);
 	}
 	public  double salaireNet(){
 		return ( salaire + hs*remu)*(1-getIR());
 	}
 	public String toString(){
 		return super.toString()+", Heure Suplementaire :"+hs+",Remuneration :"+remu ;
 	}
 }