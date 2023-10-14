// PROGRAMME DE TESTE 
public class GestionComptesBancaires {
    public static void main(String[] args) {
        // Création des clients
        Client client1 = new Client(1, "MOHAMED NDOYE ", "1234567890");
        Client client2 = new Client(2, "MUSTAPHA DIOP", "9876543210");
        Client client3 = new Client(3, "AYMEROU DIA ", "5555555555");

        // Création des comptes
        Compte compte1 = new Compte(client1);
        CompteEpargne compteEpargne = new CompteEpargne(client2, 2.5);
        CompteCourant compteCourant = new CompteCourant(client3);
        compteCourant.setCoutOperation(1000.0); // Modification du coût des opérations pour le compte courant

        // Opérations sur les comptes
        compte1.deposer(1000.0);
        compte1.retirer(500.0);

        compteEpargne.deposer(2000.0);
        compteEpargne.calculInteret();

        compteCourant.deposer(5000.0);
        compteCourant.retirer(2000.0);

        // Affichage des comptes
        System.out.println(compte1);
        System.out.println(compteEpargne);
        System.out.println(compteCourant);
    }
}
