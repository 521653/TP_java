package MesClasses;

import java.time.LocalDate;

public class Voiture {
    private String mat;
    private int nbPlace;
    private String marque;
    private String modele;
    private LocalDate dateMiseCircul;
    private String typeDeCarburant;
    private String couleur;
    private String kilometrage;

    public Voiture() {
    }

    public Voiture(String mat, int nbPlace, String marque, String modele, LocalDate dateMiseCircul, String typeDeCarburant, String couleur,String kilometrage) {
        this.mat = mat;
        this.nbPlace = nbPlace;
        this.marque = marque;
        this.modele = modele;
        this.dateMiseCircul = dateMiseCircul;
        this.typeDeCarburant = typeDeCarburant;
        this.couleur = couleur;
        this.kilometrage =kilometrage;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setDateMiseCircul(LocalDate dateMiseCircul) {
        this.dateMiseCircul = dateMiseCircul;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMat() {
        return mat;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public LocalDate getDateMiseCircul() {
        return dateMiseCircul;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public String toString() {
        return "\n------------------Les information de la voiture------------------ \n" +
                "immatriculation :" + mat + '\n' +
                "Nombre de place :" + nbPlace +
                "Marque : " + marque + '\n' +
                "Modele : " + modele + '\n' +
                "Date de mise en circulation : " + dateMiseCircul + '\n' +
                "Type de carburant : " + typeDeCarburant + '\n' +
                "couleur : " + couleur ;
    }
}
