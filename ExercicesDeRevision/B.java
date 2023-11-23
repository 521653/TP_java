public class B {
    public static int nbB = 0;
    public String n;

    public B(String n) {
        this.n = n;
        nbB++;
    }

    public String toString() {
        return "[" + n + "]";
    }

    public static void nbCons() {
        System.out.println("nb type B :" + nbB);
    }

    public static void main(String[] args) {
        B[] listeB = new B[3];
        nbCons();
        listeB[0] = new B("albert");
        nbCons();
        listeB[1] = new B("boris");
        nbCons();
        for (int i = 0; i < B.nbB; i++)
            System.out.println(listeB[i]);
    }
}
