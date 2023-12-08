package MesClasses;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Parking {
    private String nomParking;
    private final int CAPACITE = 100;
   private Voiture listeVoiture[];
    private  String adresseParking;

    public Parking(String nom, String adresse) {
        this.nomParking = nom;
        this.adresseParking = adresse;
        listeVoiture =new Voiture[CAPACITE];
    }

    /*public int rechercheVoiture(String mat) {
        int i=0;
        int t=-1;
        while(i<listeVoiture.size()){
            if(listeVoiture.get(i).getMat().equals(mat)) {

                t=i;
                break;


            }
            else {
                t=-1;
                i++;
            }
        }


        return t;

    }        */
    public void stationner(int n) {
        Scanner sc=new Scanner(System.in);
        Voiture v=new Voiture();

        if (n < 0 || n>100) {
            System.out.println("le numero n'existe pas dans le parking !");
        } else if (listeVoiture[n] != null) {
            System.out.println("la place est occupé par une voiture de numéro d'immatriculation : "+listeVoiture[n].getMat());
        }else
            {
                System.out.println("Donner le numero d'immatriculation");
                String num = sc.next();
                v.setMat(num);
                Integer place = null;
                do {
                    System.out.println("Donner le nombre de place");
                    if (!sc.hasNextInt()) {
                        sc.next();
                        System.out.println(" Saisir une valeur valide ");
                        continue;
                    }
                    place = sc.nextInt();
                } while (place == null);
                v.setNbPlace(place);

                System.out.println("Donner la marque");
                String marq = sc.next();
                v.setMarque(marq);
                System.out.println("Donner le modele");
                String model = sc.next();
                v.setModele(model);

                String carburant;
                int i = 0;
                do {
                    System.out.println("Donner le type de carburant");
                    if (i > 1)
                        System.out.println("les types sont gasoil essence ou electrique");
                    carburant = sc.next();
                    if (carburant.equalsIgnoreCase("essence") || carburant.equalsIgnoreCase("gasoil") || carburant.equalsIgnoreCase("Electrique")) {
                        v.setTypeDeCarburant(carburant);
                        i++;
                        break;
                    }
                } while (!carburant.equalsIgnoreCase("essence") || !carburant.equalsIgnoreCase("gasoil") || !carburant.equalsIgnoreCase("Electrique"));
                String etat;
                System.out.println("Donner le kilometrage");
                String kil = sc.next();
                v.setKilometrage(kil);

                System.out.println("Donner la date de mise en circulation jj/mois/annee");
                int jj = sc.nextInt();
                int mois = sc.nextInt();
                int annee = sc.nextInt();
                LocalDate date = LocalDate.of(annee, mois, jj);
                v.setDateMiseCircul(date);

                String c;
                System.out.println("Donner la couleur de la voiture ");
                c = sc.nextLine();

                listeVoiture[n] = v;
            }
        }



    public String getNomParking() {
        return nomParking;
    }

    public void setNomParking(String nomParking) {
        this.nomParking = nomParking;
    }

    public String getAdresseParking() {
        return adresseParking;
    }

    public void setAdresseParking(String adresseParking) {
        this.adresseParking = adresseParking;
    }
    public void retirer(int n){
        if (n < 0 || n>100) {
            System.out.println("le numero n'existe pas dans le parking !");
        } else if (listeVoiture[n] == null) {
            System.out.println("la place est vide !");
        }else {
            listeVoiture[n]=null;
            System.out.println("la voiture est retirer avec succes!");
        }
    }
    public void afficheEtetParking(){
        int cmp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < listeVoiture.length; i++) {
            if (listeVoiture[i] == null) {
                cmp++;
                list.add(i+1);
            }else
                System.out.println("la place "+(i+1)+" est occupée par la voiture : "+listeVoiture[i].toString());
        }
        System.out.println("le nombre de places libres est : "+cmp);
        System.out.println("la liste des places libres est : "+list);

    }
}
