import java.util.Scanner;

public class opgaveWhileLoopogSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int SENTINEL = -1;


        int userInput = 0;

        System.out.println("Skriv 2 tal der skal lægges sammen. Skrive -1 for at stoppe");

        while (userInput != SENTINEL) {
            int sum = 0;
            System.out.println("Første tal");
            userInput = input.nextInt();


            if (userInput == SENTINEL)
                break;

            sum += userInput;
            System.out.println("Indtast næste");
            userInput = input.nextInt();
            sum += userInput;
            System.out.println("Summen er: " + sum);
            System.out.println("Prøv igen");


        }
    }
}
