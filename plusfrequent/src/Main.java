
public class Main {
    public static void main(String[] args) {
        int tab[] = {2, 8, 6, 1, 8, 7, 2, 1, 8};
        int v = tab[0];
        int f = 0;
        int n= tab.length;
        for (int i = 0; i < n-1; i++) {
            int c = 1;

            for (int j = i + 1; j < n; j++) {
                if (tab[i] == tab[j]) {
                    c++;
                }
            }
                if (c > f) {
                    f = c;
                    v = i;
                }
        }
        System.out.println("le plus frequent est "+tab[v]+" on l'a "+f+" fois");

    }
}
