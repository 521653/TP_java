public class Dictionnaire extends Document{
    private String langue;
    private int nbTomes;

    public Dictionnaire(String titre, String langue, int nbTomes){
        super(titre);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }
    public Dictionnaire(String titre,int numero,String langue, int nbTomes){
        super(titre, numero);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String getLangue(){
        return langue;
    }

    public int getNbTomes(){
        return nbTomes;
    }

    public String toString(){
        return super.toString()+"\nLa langue est :"+langue+"\nLe nombre de tomes est :"+nbTomes;
    }
}