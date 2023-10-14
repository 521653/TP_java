public class TesteProg {
	public static void main(String [] args ){
		// cretion des clients 
		 Client c1 = new Client ( 1 , "Dia" , 772586632);
		 Client c2 = new Client ( 2 , "Diakhate" , 776586632);
		 Client c3 = new Client ( 3 , "Diaw" , 772586752);
		 // Creation des comptes 
		 Compte cpt1 = new Compte( c1 );
		 CompteEpargne cpt2 = new CompteEpargne(c2 , 500000 , 0.3);
		 CompteCourant cpt3 = new CompteCourant(c3 , 350000, 400);
		 System.out.println(cpt1);
		 System.out.println(cpt2);
		 System.out.println(cpt3);
		 cpt2.deposer(325.2);
		 double interet = cpt2.calculInteret();
		 System.out.println(cpt2);
		 System.out.println(" l'interet vaut : "+interet);
		 cpt3.retirer(20000);
		 System.out.println(cpt3);
	}
}