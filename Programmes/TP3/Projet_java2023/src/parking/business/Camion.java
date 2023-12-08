package parking.business;

import java.time.LocalDate;

/**
 * Camion est une classe fille de "Vehicule".
 */
public class Camion extends Vehicule{
	
	private String type;

	/**
     * Constructeur de la classe "Camion".
     * 
     *
     *            Le propriétaire du camion.
     *  
     *
     *            Le numéro d'immatriculation du camion.
     *
     *
     *            La marque du camion.
     *            
     *
     *            Le modèle du camion.
     *            
     *
     *            La hauteur du camion.
     *            
     *
     *            La longueur du camion.
     *            
     *
     *            La masse du camion.
     */
	public Camion(String proprietaire,int nbrePlace, String num_immat, String marque, String modele,String typeCarburant,String couleur,double kilometrage,LocalDate dateDeMiseEnCirculation) {
		super(proprietaire,nbrePlace, num_immat, marque, modele,typeCarburant,couleur,kilometrage,dateDeMiseEnCirculation);
		type = "camion";
	}
	public Camion(){
		super();
		type = "camion";
	}
	
	/**
     * Récupérer le type d'un camion.
     *
      Retourne Le type de véhicule (ici "camion").
     */
	public String getType() {
		return type;
	}
	
	/**
     * Récupérer les informations d'un camion.
     * 
     * Retourne Une chaîne de caractères contenant les infos d'un camion.
     */
	public String toString() {
		return "\n Type de vehicule : " + type + "\n Proprietaire : " + proprietaire + "\n Immatriculation : " + num_immat + "\n "
				+ "Marque : " + marque + "\n Modele : " + modele + "\n kilometrage : " +kilometrage+"\n Date de mise en circulation : "+dateDeMiseEnCirculation;
	}	
}
