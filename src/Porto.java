import java.util.Scanner;

public class Porto {
    public static void main(String[] args) {
        start();
    }

        public static void start() {

        Scanner input = new Scanner(System.in);

        int pris = 0;

        System.out.println("Hvor mange gram er dit brev?");


        double gram = input.nextDouble();

        if (gram < 250) {

            pris = 25;
        } else if (gram < 500) {
            pris = 50;

        } else if (gram < 2000) {
            pris = 75;
        } else if (gram > 2000) {

            System.out.println("Dit brev er for tungt - send en pakke");

        }
        if (gram < 2000) {

            System.out.println(pris + " kr");
        }
        start();

    }
}
