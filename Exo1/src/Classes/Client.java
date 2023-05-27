package Classes;

public class Client {
    private int id;
    private String nom;
    private int numTel;

    public Client() {
    }

    public Client(int id, String nom, int numTel) {
        this.id = id;
        this.nom = nom;
        this.numTel = numTel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

}
