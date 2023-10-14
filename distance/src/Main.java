import java.util.Scanner;

public class Main {
    static double calculdistance(int x1,int x2,int y1,int y2){
        return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
    }
    static void plusproche(int x,int y,int[][]coordhab){
        double min=calculdistance(x,y,coordhab[0][0],coordhab[0][1]);
        System.out.println("min="+min);
        int a=coordhab[0][0],o=coordhab[0][1];
        for (int i = 1; i < coordhab.length; i++) {
            double distance=calculdistance(x,y,coordhab[i][0],coordhab[i][1]);
            System.out.println("distance"+i+" ="+distance);
              if(distance<min) {
                  min = distance;
                  a = coordhab[i][0];
                  o = coordhab[i][1];
              }
        }
        System.out.println("la coordonnee la plus proche est ("+a+","+o+")");


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dooner le nombre de ligne");
        int n=scanner.nextInt();
        int [][]coordhab=new int[n][2];
        System.out.println("dooner les elements du tableau");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {

                coordhab[i][j] =scanner.nextInt();

            }

        }
        System.out.println("dooner X");
        int x=scanner.nextInt();
        System.out.println("dooner Y");
        int y=scanner.nextInt();
        plusproche(x,y,coordhab);



    }
}