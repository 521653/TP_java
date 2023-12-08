import java.util.Scanner;

public class Etudiant {
    private String nom;
    private static int matricule = 0;
    private int nbrNotes;
    private int []notes;

    public Etudiant(String nom, int nbrNotes) {
        this.nom = nom;
        this.nbrNotes = nbrNotes;
        this.notes = new int[nbrNotes];
        matricule++;
    }

    public String getNom() {
        return nom;
    }

    public static int getMatricule() {
        return matricule;
    }

    public int getNbrNotes() {
        return nbrNotes;
    }

    public int[] getNotes() {
        return notes;
    }
    public void saisir(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Donner l'element : "+(i+1)+" ");
            notes[i] = scanner.nextInt();
        }
    }
    public Double moyenne(){
        int s = 0;
        for (int i = 0; i < notes.length; i++) {
            s += notes[i];
        }
        return (double)(s/notes.length);
    }
    public void affiche(){
        System.out.println(matricule);
        System.out.println(nom);
        System.out.println("les notes de l'etudiant sont :");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i]+" ");
        }
    }
    public void verifierEtud(){
        if (moyenne() > 10)
            System.out.println("l'etudiant est admis");
        else
            System.out.println("l'etudiant n'est pas admis");
    }
}
