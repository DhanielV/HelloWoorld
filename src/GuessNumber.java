import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(10)+1;
        int usersGuess = -1;

        System.out.println("Gæt et tal mellem 1 og 10");

        while (numberToGuess != usersGuess){
                usersGuess = input.nextInt();

        if (numberToGuess > usersGuess) {
            System.out.println("Forkert! Tallet er større. Prøv igen");

        }else if (numberToGuess < usersGuess){
                System.out.println("Forkert! Tallet er mindre. Prøv igen");

            }
        }

        System.out.println("Tilykke du gættede tallet!");
        }


    }

