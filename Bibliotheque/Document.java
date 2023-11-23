public class Document{
    private String titre;
    private int numero;
    private static int numeroSuivant = 0;

    public Document(String titre){
        this.titre = titre;
        this.numero = numeroSuivant;
        this.numeroSuivant++;
    }

    public String getTitre(){
        return titre;
    }

    public int getNumero(){
        return numero;
    }

    public Document(String nom, int numero){
        this.titre = titre;
        if(numero < Document.numeroSuivant)
            this.numero = numeroSuivant;
        numeroSuivant++;
    }
    public static void accesDocument(){
        
    }

    public String toString(){
        return "Le numero d'enregistrement du document est :"+numero+"\nSon titre est :"+titre;
    }

}