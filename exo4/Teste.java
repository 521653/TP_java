import java.time.LocalDate;
public class Teste{
	public static void main( String [] args ){
		Employe []tab = new Employe[3];
		tab[0]= new Employe("developpeur",LocalDate.of( 1997, 1, 2), LocalDate.of(2018 , 3 ,1 ), 155000);
		tab[1]= new Employe("mbaye",LocalDate.of(1998, 1, 2), LocalDate.of(2013 , 5 ,9 ), 800000);
		tab[2]= new Employe("diallo",LocalDate.of( 1995, 5, 2), LocalDate.of(2020 , 9 ,4 ), 580000);

       for( Employe e: tab){
       	System.out.println (e);
       }
	}
}