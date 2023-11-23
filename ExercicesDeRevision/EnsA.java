import java.util.ArrayList;

public class EnsA {
    private ArrayList<Integer> liste = new ArrayList<Integer>();
    public EnsA(){
        liste = new ArrayList();
    }
    
    public EnsA(int a){
        liste.add(a);
    }

    public EnsA(EnsA e){
       liste.addAll(e.liste);
    }

    public int cardinal(){
        return liste.size();
    }

    public boolean isEmpty(){
        return liste.isEmpty();
    }

    public boolean singleton(){
        if(liste.size() == 1)
            return true;
        return false;
    }

    public String toString(){
        return liste.toString();
    }

    public boolean appartient(int a){
        return liste.contains(a);
    }

    public void add(int a){
        if(appartient(a) == false){
            liste.add(a);
        }

    }

    public void remove(int a){
        if(appartient(a) == true){
            liste.remove(a);
        }
    }

    public EnsA inter(EnsA a){
        EnsA ens = new EnsA();
        for (Integer integer : a.liste) {
            if (liste.contains(integer)) {
                ens.liste.add(integer);
            }
        }
        return ens;
    }

    public EnsA union(EnsA e){
        EnsA c = new EnsA();
         for(Integer i : e.liste){
            if(!liste.contains(i))
                liste.add(i);
        }
        //liste.addAll(e.liste);
        c.liste.addAll(liste);
        return c;
    }

    public EnsA diff(EnsA e){
        EnsA ens = new EnsA();
        for (Integer integer : e.liste) {
            if (!liste.contains(integer)) {
                ens.liste.add(integer);
            }
        }
        return ens;
    }

    public boolean inclus(EnsA e){
        if (e.liste.containsAll(liste)) 
            return true;
        return false;
    }

    public boolean equals(EnsA o){
        return liste.equals(o.liste);
    }
}
