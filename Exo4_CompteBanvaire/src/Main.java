import Classes.Client;
import Classes.Compte;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(1,"Mbaye","Mamadou","77 013 32 68");
        Client c2 = new Client(100,"Fall","Ibou","77 123 14 15");
        c1.afficher();
        System.out.println("----------------------------");
        Compte account1 = new Compte(c1);
        account1.crediter(2000);
        account1.visualiser();
        System.out.println("----------------------------");
        account1.debiter(5000);
        account1.visualiser();
        Compte account2 = new Compte(c2);
        account2.crediter(15000);
        account2.virement(account1,5000);
        System.out.println("----------------------------");
        account2.visualiser();
        System.out.println("----------------------------");
        System.out.println("le nombre de compte creer est de :"+Compte.Nbcompte());
    }
}