package parking.business;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Scanner;

import parking.exception.NumeroPlaceException;
import parking.exception.PlaceDisponibleException;
import parking.exception.PlaceLibreException;
import parking.exception.PlaceOccupeeException;
import parking.exception.PlusAucunePlaceException;
import parking.exception.VehiculePresentException;


public class Parking {

	//Liste des prix en fonction du véhicule (Collection d'objets "HashMap")
	private HashMap<String, Integer> constantePrixVehicule = new HashMap<String, Integer>();

	//Liste des places du parking (Collection d'objets "ArrayList")
	private ArrayList<Place> places = new ArrayList<Place>();

	//Liste des véhicules présents dans le parking (Collection d'objets "ArrayList")
	private ArrayList<Vehicule> vehiculesPresents = new ArrayList<Vehicule>();

	//Attributs généraux de la classe
	private String nom,adresse;
	private int placesTransporteurs, nbParticuliers;


	/**
     * Constructeur de la classe "Parking".
     */
	public Parking(String nom,String adresse, int nbParticuliers, int nbTransporteurs) {
		this.nom = nom;
		this.adresse = adresse;
		this.placesTransporteurs = nbTransporteurs;
		this.nbParticuliers = nbParticuliers;
		this.constantePrixVehicule.put("camion", 6);
		this.constantePrixVehicule.put("voiture", 3);

		int capacite = nbParticuliers + nbTransporteurs;

		//Création des places de parking "Particulier"
		for(int i = 1; i <= nbTransporteurs+1; i++)
			places.add(new PlaceTransporteur(i, null));

		//Création des places de parking "Transporteur"
		for(int i = nbTransporteurs+2; i <= capacite+1; i++)
			places.add(new PlaceParticulier(i, null));
		System.out.println("La capacité du parking est : "+capacite);
	}

	public Parking(){}

	public String getNom() {
		return nom;
	}

	public int getPlacesTransporteurs() {
		return placesTransporteurs;
	}

	public int getNbParticuliers() {
		return nbParticuliers;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPlacesTransporteurs(int placesTransporteurs) {
		this.placesTransporteurs = placesTransporteurs;
	}

	public void setNbParticuliers(int nbParticuliers) {
		this.nbParticuliers = nbParticuliers;
	}

	/**
     * Vérifier si un véhicule est dans le parking ou pas.

     *            Un véhicule à vérifier.
     *            
     * Retourne Une valeur de type "true" ou "false"
     */
	public boolean vehiculeExiste(Vehicule vehicule) {
		return vehiculesPresents.contains(vehicule);
	}

	public void infoVehicule(){

	}

	/**
     * Garer un véhicule à une place donnée (si elle est libre).
     */
	public void stationner(Vehicule vehicule, int numeroPlace) throws PlaceOccupeeException, VehiculePresentException, NumeroPlaceException {
		try{
			if(!vehiculeExiste(vehicule)) {
				if(numeroPlace >= 1 && numeroPlace <= places.size()) {
					if(places.get(numeroPlace).estLibre() && !places.get(numeroPlace).estReservee()) {
						if(places.get(numeroPlace).getType() == "transporteur" && vehicule.getType() == "camion") {
							places.get(numeroPlace).attribuerVehicule(vehicule);
							vehiculesPresents.add(vehicule);
							System.out.println("Le véhicule (de type 'camion') a été garé à la place n." + numeroPlace + " "
									+ "(type: transporteur).");

						} else if(places.get(numeroPlace).getType() == "particulier" && vehicule.getType() == "voiture") {
							places.get(numeroPlace).attribuerVehicule(vehicule);
							vehiculesPresents.add(vehicule);
							System.out.println("Le véhicule (de type 'voiture') a été garé à la place n." + numeroPlace + " "
									+ "(type: particulier).");
						} else if(places.get(numeroPlace).getType() == "transporteur" && vehicule.getType() == "voiture") {
							places.get(numeroPlace).attribuerVehicule(vehicule);
							vehiculesPresents.add(vehicule);
							System.out.println("Le véhicule (de type 'voiture') a été garé à la place n." + numeroPlace + " "
									+ "(type    : transporteur).");
						} else
							throw new PlaceOccupeeException(numeroPlace);
					} else {
						if(vehicule.getType() == "voiture") {
							//Variable en charge de la place
							Place place;
							for(int i = 0; i < places.size(); i++) {
								place = places.get(i);
								if(place.estLibre() && !place.estReservee()) {
									place.attribuerVehicule(vehicule);
									vehiculesPresents.add(vehicule);
									System.out.println("La place n." + numeroPlace + " étant indisponible, "
											+ "le véhicule immatriculé '" + vehicule.getNumImmat() + "' (de type 'voiture') a été garé sur la place "
											+ "n." + place.getNum() + " (type: " + place.getType() + ").");
									return;
								}
							}
						} else {
							throw new PlaceOccupeeException(numeroPlace);
						}
					}

				} else {
					throw new NumeroPlaceException(numeroPlace);
				}
			} else {
				throw new VehiculePresentException();
			}
		}catch (Exception e){
			e.getMessage();
		}

	}


	/**
	 * Retirer un véhicule d'une place de parking.
	 */
	public void retirer(int numeroPlace) throws PlaceLibreException, NumeroPlaceException, InterruptedException {
		//Si le numéro de place est correct
		try{
			if(numeroPlace >= 0 && numeroPlace < places.size()) {
				//Si la place n'est pas libre
				if(!places.get(numeroPlace).estLibre()) {
					//Variable qui prend pour valeur le véhicule qui va être retiré
					Vehicule vehiculeretire = places.get(numeroPlace).getVehicule();

					//Enlever le véhicule de la liste des véhicules présents
					vehiculesPresents.remove(vehiculeretire);

					//Rendre la place libre
					places.get(numeroPlace).
							libererPlace(constantePrixVehicule.get(places.get(numeroPlace).getType()));

					System.out.println("la place n."+numeroPlace+" libre maintenant.");
				} else
					throw new PlaceLibreException(numeroPlace);
			} else
				throw new NumeroPlaceException(numeroPlace);
		}catch (Exception e){
			e.getMessage();
		}
	}

	/**
     * Récupérer le numéro de place occupée.
     */
	public int recherche(String num_immat) {
		//Variable en charge de la place
		Place place;

		//Parcours du parking
		for(int i = 0; i < places.size(); i++) {
			place = places.get(i);
			if(!place.estLibre()) {
				if(place.getVehicule().getNumImmat() == num_immat) {
					//Retourner le numéro de place
					return place.getNum();
				}
			}
		}
		return -1;
	}

	public void affichervoitureEcheant(int numplace)  {
		if((numplace > 0) && (numplace <= places.size())) {
			if (vehiculesPresents.get(numplace) != null)
				vehiculesPresents.get(numplace).toString();
			else
				System.out.println("y'a pas de voiture à la place n."+numplace);
		}else
			System.out.println("le numero n'existe pas dans le paking");
	}

	/**
     * Affiche l'état du parking
     */
	public void etatParking() {
		int cmp = 0;

		//Parcours du parking
		for(int i = 1; i < places.size(); i++) {
			if(places.get(i).estLibre() && !places.get(i).estReservee()) {
				cmp++;
				System.out.println("La place n." + i + " (" + places.get(i).getType() + ") est libre.");
			} else if(places.get(i).estReservee())
				System.out.println("La place n." + i + " (" + places.get(i).getType() + ") est réservée.");

			else
				System.out.println("La place n." + i + " (" + places.get(i).getType() + ") "
						+ "est occupée par le véhicule suivant : " + places.get(i).getVehicule().toString());
			System.out.println("");
		}
		System.out.println("NOMBRE TOTAL DE VEHICULES : " + vehiculesPresents.size());
		System.out.println("NOMBRE TOTAL DE PLACE LIBRES : "+cmp);
	}

	/**
     * Réserver une place de parking.
     */
	public Place reserverPlace(Vehicule vehicule) throws PlusAucunePlaceException {
		String typeVehicule = vehicule.getType();

		for (int i = 0; i < places.size(); i++) {
			if (typeVehicule == "voiture") {
				if (!places.get(i).estReservee() && places.get(i).estLibre()) {
					places.get(i).setReservation(true);
					return places.get(i);
				}
			} else {
				if (places.get(i).getType() == "transporteur") {
					places.get(i).setReservation(true);
					return places.get(i);
				}
			}
		}

		throw new PlusAucunePlaceException(vehicule);
	}

	/**
     * Rendre libre une place de parking réservée.
     */
	public void liberePlace(Place placeALiberer) throws PlaceDisponibleException {
		if(placeALiberer.estReservee())
			placeALiberer.setReservation(false);

		else
			throw new PlaceDisponibleException(placeALiberer.getNum());
	}


	public void afficheMarque(String marque){
		ArrayList<Vehicule> vehicules = new ArrayList<>();
		for (int i = 0; i < vehiculesPresents.size(); i++) {
			if (vehiculesPresents.get(i).marque.equals(marque))
				vehicules.add(vehiculesPresents.get(i));
		}
		if (vehicules.isEmpty())
			System.out.println("la marque "+marque+" correspond àaucun vehicule dans le parking");
		System.out.println("les vehicules dont le marque est :"+marque);
		for (int i = 0; i < vehicules.size(); i++) {
			System.out.println(vehicules.get(i).toString());
		}
	}

	public void afficheDateMC(LocalDate d){
		ArrayList<Vehicule> vDate = new ArrayList<>();
		for (int i = 0; i < vehiculesPresents.size(); i++) {
			if (vehiculesPresents.get(i).dateDeMiseEnCirculation.equals(d))
				vDate.add(vehiculesPresents.get(i));
		}
		if (vDate.isEmpty())
			System.out.println("Aucun vehicule à pour date de mise circulation :"+d.toString());
		System.out.println("les vehicules qui sont mise en circulation à la date de :"+d);
		for (int i = 0; i < vDate.size(); i++) {
			System.out.println(vDate.get(i).toString());
		}
	}

	public void afficheKilo(double kilomet){
		ArrayList<Vehicule> vKil = new ArrayList<>();
		for (int i = 0; i < vehiculesPresents.size(); i++) {
			if (vehiculesPresents.get(i).kilometrage < kilomet)
				vKil.add(vehiculesPresents.get(i));
		}
		if (vKil.isEmpty())
			System.out.println("il y'a aucun vehicule qui a un kilometrage inferieurau seuil.");
		System.out.println("les vehicules qui ont kilometrage inférieur au seuil qui est :"+kilomet);
		for (int i = 0; i < vKil.size(); i++) {
			System.out.println(vKil.get(i).toString());
		}
	}
	// creation parking
	public  Parking creerParking(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Donner le nom du parking : ");
		String nom = sc.nextLine();
		System.out.print("Donner l'adresse du parking :");
		String adresse = sc.nextLine();

		Integer nbpar = null;
		do {
			System.out.print("Donnes le nombres de places pour les particuliers : ");
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
			System.out.print("Donnes le nombres de places pour les transporteurs : ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println(" Saisir une valeur valide ");
				System.out.println("");
				continue;
			}
			nbtrans = sc.nextInt();

		} while (nbtrans == null);

		return new Parking(nom,adresse, nbpar, nbtrans);
	}
}

