package parking.business;

import java.time.LocalDate;

/**
 * "Voiture" est une classe fille de "Vehicule".
 */
public class Voiture extends Vehicule {

    private String type;

    /**
     * Constructeur de la classe "Voiture" (classe fille de "Vehicule").
     */
    public Voiture(String proprietaire, int nbrePlace, String num_immat, String marque, String modele, String typeCarburant,
                   String couleur, double kilometrage, LocalDate dateDeMiseEnCirculation) {
        super(proprietaire, nbrePlace, num_immat, marque, modele, typeCarburant, couleur, kilometrage, dateDeMiseEnCirculation);
        type = "Voiture";
    }

    public Voiture() {
        super();
        type = "Voiture";
    }

    /**
     * Récupérer le type d'une voiture.
     */
    public String getType() {
        return type;
    }

    /**
     * Récupérer les informations d'une voiture.
     */
    public String toString() {
        return "\n Type de vehicule : " + type + "\n Proprietaire : " + proprietaire + "\n Immatriculation : " + num_immat + "\n "
                + "Marque : " + marque + "\n Modele : " + modele + "\n kilometrage : " + kilometrage + "\n Date de mise en circulation : " + dateDeMiseEnCirculation;
    }
}
