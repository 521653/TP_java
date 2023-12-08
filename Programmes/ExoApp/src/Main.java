public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Etudiant etudiant =new Etudiant("Mbaye",3);
        etudiant.saisir();
        etudiant.affiche();
        System.out.println("\n la moyenne est : "+etudiant.moyenne());
        etudiant.verifierEtud();
    }
}