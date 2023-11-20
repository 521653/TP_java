package MesClasses;

import java.time.LocalDate;
import java.util.ArrayList;

public class Facture {
    private static int numFact = 0;
    private LocalDate date;
    private ArrayList<Achat> listeAchat;
    public Facture(){}
    public Facture(LocalDate date, ArrayList<Achat> listeAchat){
        this.date = date;
        this.listeAchat = listeAchat;
    }
    public boolean verifier(Achat a){
        int i;
        for ( i = 0; i < listeAchat.size(); i++) {
            if (listeAchat.get(i).equals(a)){
                break;
            }
        }
        if (i < listeAchat.size())
            return true;
        else
            return false;

    }
    public void ajouter(Achat a){

        if (verifier(a))
            System.out.println("l'achat existe dans la liste !");
        else
            listeAchat.add(a);
    }
    public void supprimer(Achat a){
        if (verifier(a))
            listeAchat.remove(a);
        else
            System.out.println("l'achat n'existe pas dans la liste !");
    }
    public double montantFacture(){
        double s =0;
        for (Achat val : listeAchat)
            s+= val.montantAchat();
        return s;
    }
    public String toString(){
    return "numero : "+numFact+"\nliste de achats : "+listeAchat.toString()+"\nmontant total de la facture : "+montantFacture();
    }
}
