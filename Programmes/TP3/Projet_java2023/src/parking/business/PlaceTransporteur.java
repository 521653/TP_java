package parking.business;

import java.sql.Time;

/**
 * "PlaceTransporteur" est une classe fille de "Place".
 */
public class PlaceTransporteur extends Place{

	//Attributs généraux de la classe
	private String type;
	
	/**
     * Constructeur de la classe "PlaceTransporteur".

     *            Le numéro de place du parking. 

     *            Le véhicule associé à la place. 
     */
	public PlaceTransporteur(int numeroPlace, Vehicule vehicule) {
		super(numeroPlace, vehicule);
		type = "transporteur";
	}
	
	/**
     * Demander le type de la place de parking.

     * Retourne Le type de la place de parking.
     */
	public String getType() {
		return type;
	}
	
	/**
     * Demander le véhicule associé à la place.

     * Retourne Le véhicule associé à la place.
     */
	public Vehicule getVehicule() {
		return vehicule;
	}
	
	/**
     * Vérifier si la place est libre.

     * Retourne "true" si aucun véhicule ne se trouve sur la place.
     */
	public boolean estLibre() {
		return vehicule == null;
	}
	
	/**
     * Vérifier si la place est réservée.

     * Retourne la valeur du booléen "reservation" (true ou fasle).
     */
	public boolean estReservee() {
		return reservation == true;
	}
	
	/**
     * Modifier l'état de réservation de la place.

     *            L'état de réservation (true ou false).         
     */
	public void setReservation(boolean reservation) {
		this.reservation = reservation;
	}
	
	/**
     * Attribue un véhicule à une place et démarre le timer.

     *            Le véhicule a attribuer. 
     */
	 public void attribuerVehicule(Vehicule vehicule) {
		 this.vehicule = vehicule;
		 this.debutStationnement = new Time(System.currentTimeMillis());
	 }
	
	/**
     * Libérer une place de parking.

     *            Le coût à la minute du véhicule.
     */
	public void libererPlace(int cout) throws InterruptedException {
		if (Thread.interrupted())
			throw new InterruptedException();
		Facture newFacture = new Facture(numeroPlace, cout, this.getDebutStationnement().getTime() ,this.getType(), this.getVehicule().getProprietaire());
		System.out.print(newFacture.toString());
		this.vehicule = null;
	}
}


