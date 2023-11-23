public class Multiple5_7{
    public static void main(String [] args){
        for (int i = 1; i <= 100; i++) {
            if ((i%5 == 0)&&(i%7 == 0)) {
                System.out.println("fizzbuzz");
            } else {
                if (i%5 == 0) {
                    System.out.print(" fizz ");
                }else if (i%7 == 0) {
                    System.out.print(" buzz ");
                }else
                    System.out.print(i+" ");
            }
        }
    }
}