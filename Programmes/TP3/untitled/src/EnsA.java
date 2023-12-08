import java.util.ArrayList;

public class EnsA {
    private ArrayList<Integer> liste;
    public EnsA(){
        liste = new ArrayList<>();
    }
    public EnsA(int a){
        this.liste.add(a);
    }
    public EnsA(EnsA e){
        this.liste.addAll(e.liste);
    }
    public int cardinal(){
        return liste.size();
    }
    public boolean isEmpty(){
        if (cardinal() == 0)
            return true;
        return false;
    }
    public boolean singleton(){
        if (cardinal() == 1)
            return true;
        return false;
    }
    public String toString(){
        return "l'ensemble est : "+liste;
    }
    public boolean appartient(int a){
        return liste.contains(a);
    }
    public void add(int a){
        if(!appartient(a))
            liste.add(a);
    }

}
