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
		System.out.print("Donner le nom du proprietaire du vehucile : ");
		proprietaire = sc.next();

		System.out.print("Donner le numero d'immatriculation : ");
		num_immat = sc.next();

		Integer place = null;
		do {
			System.out.print("Donner le nombre de place : ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println(" Saisir une valeur valide ");
				continue;
			}
			place = sc.nextInt();
		} while (place == null);
		nbrePlace = place;

		System.out.print("Donner la marque : ");
		marque = sc.next();
		System.out.print("Donner le modele : ");
		modele = sc.next();

		String carburant;
		int i = 0;
		do {
			System.out.print("Donner le type de carburant : ");
			if (i > 1)
				System.out.println("les types sont gasoil essence ou electrique");
			carburant = sc.next();
			if (carburant.equalsIgnoreCase("essence") || carburant.equalsIgnoreCase("gasoil") || carburant.equalsIgnoreCase("Electrique")) {
				typeCarburant=carburant;
				i++;
				break;
			}
		} while (!carburant.equalsIgnoreCase("essence") || !carburant.equalsIgnoreCase("gasoil") || !carburant.equalsIgnoreCase("Electrique"));
		Double kilo = null;
		do {
			System.out.print("Donner le kilometrage : ");
			if (!sc.hasNextDouble()) {
				sc.next();
				System.out.println(" Saisir une valeur valide ");
				continue;
			}
			kilo = sc.nextDouble();
		} while (kilo == null);

		kilometrage = kilo;

		System.out.println("Donner la date de mise en circulation jj/mois/annee");
		Integer jour = null;
		do {
			System.out.print("Donner le jour : ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println(" Saisir une valeur valide ");
				continue;
			}
			jour = sc.nextInt();
		} while (jour == null);
		int jj = jour;
		Integer m = null;
		do {
			System.out.print("Donner le mois : ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println(" Saisir une valeur valide ");
				continue;
			}
			m = sc.nextInt();
		} while (m == null);
		int mois = m;
		Integer an = null;
		do {
			System.out.print("Donner l'année : ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println(" Saisir une valeur valide ");
				continue;
			}
			an = sc.nextInt();
		} while (an == null);
		int annee = an;
		dateDeMiseEnCirculation = LocalDate.of(annee, mois, jj);

		String c;
		System.out.print("Donner la couleur de la voiture : ");
		couleur = sc.next();
	}

	@Override
	public String toString() {
		return
				"proprietaire='" + proprietaire + '\n' +
						" Numéro d'immatriculation : " + num_immat + '\n' +
						" Marque : " + marque + '\n' +
						" Modele : " + modele + '\n' +
						" Type de carburant : " + typeCarburant + '\n' +
						" Couleur : " + couleur + '\n' +
						" Kilometrage : " + kilometrage +"\n"+
						" Date de mise en circulation : " + dateDeMiseEnCirculation +"\n"+
						" Nombre de place : " + nbrePlace ;
	}
}