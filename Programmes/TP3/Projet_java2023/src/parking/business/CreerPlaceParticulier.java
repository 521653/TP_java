package parking.business;

public class CreerPlaceParticulier implements PlaceFactory{

	public PlaceTransporteur creerPlace(int numeroPlace) {
		return new PlaceTransporteur(numeroPlace, null);
	}
}