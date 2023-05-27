import Classes.*;
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(1,"Mamadou Mbaye",770133268);
        Client c2 = new Client(2,"Pogne PM",704568523);
        Client c3 = new Client(3,"Ka KL",752361458);
        Compte cp1 = new Compte(c1);
        CompteEpargne cpe = new CompteEpargne(c2,500000,0.3);
        CompteCourant cpc = new CompteCourant(c3, 500000,400);
        System.out.println(cp1);
        System.out.println(cpe);
        System.out.println(cpc);
        cpe.depot(50000);
        double interet = cpe.calculInteret();
        System.out.println(cpe);
        System.out.println("L'interet vaux "+interet);
        cpc.retrait(200000);
        System.out.println(cpc);
    }
}