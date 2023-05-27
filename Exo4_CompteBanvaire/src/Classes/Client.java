package Classes;

public class Client {
    private int numId;
    private String nom, prenom, tel;
    public Client(){
    }

    public Client(int numId, String nom, String prenom, String tel) {
        this.numId = numId;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public  void afficher(){
        System.out.println("Nom :"+nom);
        System.out.println("prenom :"+prenom);
        System.out.println("Nimero d'Identification :"+numId);
        System.out.println("Numero telephone :"+tel);
    }
}
