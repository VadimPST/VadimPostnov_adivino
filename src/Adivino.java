import java.util.Scanner;

    public class Adivino {

        public static void main(String[] args) {
            int n = 0,cont = 0;

            int x = (int)Math.floor((Math.random()*(10-50+1)+50));//valor entre 10 y 50 ambos inclusive
            //System.out.print(x);
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("\nIntroduce el valor de X: ");
                n = sc.nextInt();
                if (n > x) {
                    System.out.print("Te pasaste Amigo");
                } else if (n < x){
                    System.out.print("Casi cerca ...");
                }
                cont++;
            } while (n != x);
            System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
            sc.close();
        }
    }
