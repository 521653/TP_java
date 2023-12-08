package parking.business;

import parking.exception.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws InterruptedException, PlaceOccupeeException, VehiculePresentException, NumeroPlaceException, PlaceLibreException, PlusAucunePlaceException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nom du parking!");
        String nom = sc.nextLine();

        Integer nbpar = null;
        do {
            System.out.println("Donnes le nombres de places pour les particuliers ");
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println(" Saisir une valeur valide ");
                System.out.println("");
                continue;
            }
            nbpar = sc.nextInt();

        } while (nbpar == null);
        Integer nbtrans = null;
        do {
            System.out.println("Donnes le nombres de places pour les transporteurs ");
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println(" Saisir une valeur valide ");
                System.out.println("");
                continue;
            }
            nbtrans = sc.nextInt();

        } while (nbtrans == null);
        Parking p = new Parking(nom, nbpar, nbtrans);
        int choix = afficherMenu();
        while (choix < 10) {
            gestionMenu(choix, p);
            choix = afficherMenu();
        }
    }

    public static int afficherMenu() {
        System.out.println("********************************************************************");
        System.out.println("*****************************PARKING********************************");
        System.out.println("********************************************************************");
        System.out.println("1- Stationner un vehicule");
        System.out.println("2- Retirer un vehicule");
        System.out.println("3- Afficher l'etat du parking");
        System.out.println("4- Les informations du vehicule parker dans une place du parking");
        System.out.println("5- Rechercher un vehicule");
        System.out.println("6- Afficher les vehicule d'une marque donnée");
        System.out.println("7- Afficher les vehicule d'une date de mise en circulation donnée");
        System.out.println("8- Afficher les vehicule de kilometrage inférieure au seuil ");
        System.out.println("9- Reserver une place dans le parking");
        System.out.println("10- Quitter");


        Scanner sc = new Scanner(System.in);

        Integer choix = null;
        do {
            System.out.println("Veuillez faire votre choix ");
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println(" Saisir une valeur valide ");
                System.out.println("");
                continue;
            }
            choix = sc.nextInt();
        } while ((choix == null) || (choix < 0 || choix > 10));


        return choix;
    }

    public static void gestionMenu(int choix, Parking p) throws PlaceOccupeeException, VehiculePresentException, NumeroPlaceException, PlaceLibreException, InterruptedException, PlusAucunePlaceException {
        Scanner sc = new Scanner(System.in);

        switch (choix) {
            case 1:
                Integer numPlace = null;
                do {
                    System.out.println("Donner le numéro de la place ");
                    if (!sc.hasNextInt()) {
                        sc.next();
                        System.out.println(" Saisir une valeur valide ");
                        System.out.println("");
                        continue;
                    }
                    numPlace = sc.nextInt();

                } while (numPlace == null);
                System.out.println("Donner le type du vehule :");
                String type = sc.next();
                if (type.equalsIgnoreCase("voiture")) {
                    Vehicule voiture = new Voiture();
                    voiture.saisirVehicule();
                    p.stationner(voiture, numPlace);
                } else if (type.equalsIgnoreCase("camion")) {
                    Vehicule camion = new Camion();
                    camion.saisirVehicule();
                    p.stationner(camion, numPlace);
                } else System.out.println("Ce type de vehicule n'est pas pris en charge dans le parking");
                break;

            case 2:
                Integer n = null;
                do {
                    System.out.println("Donnes le numéro de la place pour retirer le vehicule.");
                    if (!sc.hasNextInt()) {
                        sc.next();
                        System.out.println(" Saisir une valeur valide ");
                        System.out.println("");
                        continue;
                    }
                    n = sc.nextInt();

                } while (n == null);
                p.retirer(n);
                break;

            case 3:
                p.etatParking();
                break;

            case 4:

            case 5:
                System.out.println("Donner le numero d'immatriculation de la voiture à chercher :");
                String mat = sc.next();
                if (p.recherche(mat) != -1)
                    System.out.println("Le vehicule est dans le parking à la place n." + p.recherche(mat));
                System.out.println("Le numéro d'immatriculation " + mat + " ne correspond à aucun vehicule");
                break;

            case 6:
                System.out.println("Donnez une marque de Voiture :");
                String marq = sc.next();
                p.afficheMarque(marq);
                break;

            case 7:
                System.out.println("Donner une date de mise en circulation jj/mois/annèe :");
                int j = sc.nextInt();
                int mois = sc.nextInt();
                int annee = sc.nextInt();
                LocalDate date = LocalDate.of(annee, mois, j);
                p.afficheDateMC(date);
                break;

            case 8:
                System.out.println("Donner votre kilometrage seuil :");
                double k = sc.nextDouble();
                p.afficheKilo(k);
                break;


            case 9:
                System.out.println("Donner le type du vehule :");
                String typeVeh = sc.next();
                if (typeVeh.equalsIgnoreCase("Voiture")) {
                    Vehicule v = new Voiture();
                    v.saisirVehicule();
                    System.out.println("la place reserveé est :" + p.reserverPlace(v).getNum());
                } else if (typeVeh.equalsIgnoreCase("Camion")) {
                    Vehicule c = new Camion();
                    c.saisirVehicule();
                    System.out.println("la place reserveé est :" + p.reserverPlace(c).getNum());
                } else System.out.println("Ce type de vehicule n'est pas pris en charge dans le parking");

                break;


            default:
                throw new IllegalStateException("Valeurs incorrect: " + choix);
        }
    }


}
