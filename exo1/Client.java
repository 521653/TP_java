public class Client {
	private int id ;
	private String nom ;
	private int numtel;
	// les getters et les setters 
	 public int getId(){ return id ; }
	 public String getNom() {return  nom ; }
	 public int getNumtel(){return  numtel ; }
     public void setId(int id){ this.id = id ; }
     public void setNom(String nom){ this.nom = nom ; }
     public void setNumtel( int numtel){ this.numtel = numtel ;  }
     // le constructeur 
     public Client ( int id , String nom , int  numtel ){
     	 this.id = id ;
     	 this.nom = nom ;
     	 this.numtel = numtel ;
     }


}