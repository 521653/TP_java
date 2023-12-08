package parking.business;

public class CreerPlaceTransporteur implements PlaceFactory{

	public PlaceTransporteur creerPlace(int numeroPlace) {
		return new PlaceTransporteur(numeroPlace, null);
	}
}