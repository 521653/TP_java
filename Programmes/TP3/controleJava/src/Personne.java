public class Personne {
    private int id;
    private String nom;
    private String dn;

    public Personne(int id, String nom, String dn) {
        this.id = id;
        this.nom = nom;
        this.dn = dn;
    }

    public String getNom() {
        return nom;
    }

    public String getDn() {
        return dn;
    }
    public String toString(){
        return "identifiant "+id+" nom "+nom+" date naiss "+ dn;
    }

}
