import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor mange timer hele timer er der gået?");

        int timer = input.nextInt();

        System.out.println("Det er" + " " + timer*60*60 + " sekunder");





        System.out.println("Hvor minutter er der gået?");

        int minutter = input.nextInt();

        System.out.println("Det er: " + " " + minutter*60 + " sekunder");


        System.out.println("Hvor sekunder er der gået?");

        int sekunder = input.nextInt();

        System.out.println("Det er: " + " " + sekunder + " sekunder");

        System.out.println("Der er gået: " + (86400-(timer*60*60)+(minutter*60)+sekunder) + " sekunder siden midnat i alt" );

    }

}
