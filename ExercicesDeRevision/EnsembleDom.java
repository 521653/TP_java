public class EnsembleDom {
    private Domino []dom ;
    private final static int TAILLE = 28;
    private int nbrDom=0;

    public EnsembleDom(){
        dom = new Domino[TAILLE];
    }

    public void add(Domino domino){
        if (nbrDom < TAILLE) {
            dom[nbrDom]=domino;
            nbrDom++;
        }
    }

    public boolean isEmpty(){
        if(nbrDom == 0)
            return true;
        return false;
    }

    public Domino remove(){
        int k = nbrDom--;
        nbrDom = k--;
        return dom[k];
        
    }

    public Domino remove(int i){
        Domino d = dom[i];
        if (i < nbrDom) {
            for (int j = i; j < nbrDom; j++) {
                dom[j] = dom[j+1];
            }
            nbrDom--;
        }
        return d;
    }

    public void consTotal(){
        int k = 0;
            for (int i = 0; i <= 6; i++) {
                for (int j = i; j <= 6; j++) {
                    dom[k] = new Domino(i,j); 
                    k++;
                }
        }
        
    }

    public String toString(){
        String resultat = "" ;
        for (int i = 0; i < nbrDom; i++) {
            resultat += dom[i].toString()+" ";
        }
        return resultat;
    }

    public int taille(){
        return nbrDom;
    }

    public int getLeft(){
        return dom[0].getLeft();
    }

    public int getRight(){
        return dom[nbrDom-1].getRight();
    }

    public void melanger(){
        Domino temp;
        for (int i = 0; i < nbrDom; i++) {
            temp = dom[i];
            dom[i] = dom[i+1];
            dom[i+1] = temp;
        }
    }
}
