import java.util.Scanner;

public class Lykke {

    public static void main(String[] args) {
        start();
    }
    public static void start() {


        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();

        if (inputtedNum < 5) {
        System.out.println("Good luck");
       } else{
        System.out.println("Bad luck");
        }

        start();
    }




    }
