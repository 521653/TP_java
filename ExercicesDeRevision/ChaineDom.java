import java.util.LinkedList;

public class ChaineDom {
    private LinkedList chaine = new LinkedList();
    
    public ChaineDom(Domino d){
        EnsembleDom ensembleDom = new EnsembleDom();
        ensembleDom.add(d);
        chaine.addAll(EnsembleDom());
    }
    public int left(){
        if(chaine.get(0) instanceof Domino)
            return ((Domino) chaine.get(0)).getLeft();
        return 0;
    }

    public int right(){
        if(chaine.get(chaine.size()) instanceof Domino)
            return ((Domino) chaine.get(0)).getRight();
        return 0;
    }

    public boolean jouable(Domino d){
        int j1= d.compareTo((Domino)chaine.get(0));
        int j2 = d.compareTo((Domino)chaine.get(chaine.size()));
        if(j1 == 0 && j2 == 0)
            return true;
        return false;
    }

    public void addLeft(Domino d){
        chaine.add(d);
    }

    public void addRight(Domino d){
        chaine.add(0,d);
    }

    public String toString(){
        return chaine.toString();
    }
    public static void main(String[] args) {
        Domino d1 = new Domino(2,3);
        ChaineDom cd = new ChaineDom(d1);
        Domino d2 = new Domino(3,6);
        Domino d3 = new Domino(2,5);
        System.out.println(cd.jouable(d2));
        System.out.println(cd.jouable(d3));
        cd.addRight(d2);
        cd.addLeft(d3);
        System.out.println(cd);
    }
}
