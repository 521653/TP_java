// CLASS CLIENT 
class Client {
    private int id;
    private String nom;
    private String numeroTelephone;

    public Client(int id, String nom, String numeroTelephone) {
        this.id = id;
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", numeroTelephone=" + numeroTelephone + "]";
    }
}