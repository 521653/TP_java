public class Livre extends Document{
    private String auteur;
    private int nbPages;

    public Livre(String titre,String auteur,int nbPages){
        super(titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    public Livre(String titre,int numero,String auteur,int nbPages){
        super(titre,numero);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur(){
        return auteur;
    }

    public int getNbPages(){
        return nbPages;
    }
    
    public String toString(){
        return super.toString()+"\nL'auteur est :"+auteur+"\nLe nombre de pages est :"+nbPages;
    }

}