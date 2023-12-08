package parking.business;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Vehicule est une classe abstraite, mère des classes "Voiture" et "Camion".

 */
public abstract class Vehicule {

	protected String proprietaire, num_immat, marque, modele,typeCarburant,couleur;
    protected double kilometrage;
	protected LocalDate dateDeMiseEnCirculation;
	protected int nbrePlace;

	/**
     * Constructeur de la classe "Vehicule".

     *            Le propriétaire du véhicule.

     *            Le numéro d'immatriculation du véhicule.

     *            La marque du véhicule.

     *            Le modèle du véhicule.

     *            Le kilometrage du véhicule.

     */
	public Vehicule(String proprietaire,int nbrePlace, String num_immat, String marque, String modele,String typeCarburant,String couleur,double kilometrage,LocalDate dateDeMiseEnCirculation) {
		this.proprietaire = proprietaire;
		this.nbrePlace = nbrePlace;
		this.num_immat = num_immat;
		this.marque = marque;
		this.modele = modele;
		this.typeCarburant =typeCarburant;
		this.couleur = couleur;
		this.kilometrage = kilometrage;
		this.dateDeMiseEnCirculation = dateDeMiseEnCirculation;
	}
	public Vehicule(){}

	/**
     * Récupérer le numéro d'immatriculation de véhicule (camion ou voiture).
     * 
     */
	public String getNumImmat() {
		return this.num_immat;
	}

	/**
     * Récupérer le propriétaire d'un véhicule (camion ou voiture).
     * 
     */
	public String getProprietaire() {
		return this.proprietaire;
	}

	/**
     * Récupérer le type de véhicule (méthode implémentée dans les classes filles).
     * 

     */
	abstract String getType();

	public void saisirVehicule(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom du proprietaire du vehucile :");
		proprietaire = sc.next();

		System.out.println("Donner le numero d'immatriculation");
		num_immat = sc.next();

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
		nbrePlace = place;

		System.out.println("Donner la marque");
		marque = sc.next();
		System.out.println("Donner le modele");
		modele = sc.next();

		String carburant;
		int i = 0;
		do {
			System.out.println("Donner le type de carburant");
			if (i > 1)
				System.out.println("les types sont gasoil essence ou electrique");
			carburant = sc.next();
			if (carburant.equalsIgnoreCase("essence") || carburant.equalsIgnoreCase("gasoil") || carburant.equalsIgnoreCase("Electrique")) {
				typeCarburant=carburant;
				i++;
				break;
			}
		} while (!carburant.equalsIgnoreCase("essence") || !carburant.equalsIgnoreCase("gasoil") || !carburant.equalsIgnoreCase("Electrique"));

		System.out.println("Donner le kilometrage");
		kilometrage = sc.nextDouble();

		System.out.println("Donner la date de mise en circulation jj/mois/annee");
		int jj = sc.nextInt();
		int mois = sc.nextInt();
		int annee = sc.nextInt();
		dateDeMiseEnCirculation = LocalDate.of(annee, mois, jj);

		String c;
		System.out.println("Donner la couleur de la voiture ");
		couleur = sc.next();
	}

	@Override
	public String toString() {
		return
				"proprietaire='" + proprietaire + '\n' +
				", num_immat='" + num_immat + '\n' +
				", marque='" + marque + '\n' +
				", modele='" + modele + '\n' +
				", typeCarburant='" + typeCarburant + '\n' +
				", couleur='" + couleur + '\n' +
				", kilometrage=" + kilometrage +"\n"+
				", dateDeMiseEnCirculation=" + dateDeMiseEnCirculation +"\n"+
				", nbrePlace=" + nbrePlace ;
	}
}