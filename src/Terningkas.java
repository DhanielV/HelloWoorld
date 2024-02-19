import java.util.Random;


public class Terningkas {
    public static void main(String[] args) {


        Random random = new Random();

        int kast1 = random.nextInt(6) + 1;
        int kast2 = random.nextInt(6) + 1;
        int sum1 = kast1 + kast2;

        System.out.println("Slå to ens terninger.");
        System.out.println("Første slag er: " + kast1 + "+" + kast2 + "=" + sum1);



        while (kast1 != kast2) {
            System.out.println("Ikke ens");


                kast1 = random.nextInt(6) + 1;
                kast2 = random.nextInt(6) +1;

                int sum = kast1 + kast2;

                System.out.println("Nye slag er: " + kast1 + "+" + kast2 + "=" + sum);
            }

            System.out.println("Du har slået to ens. Tillykke!");

        }
    }

