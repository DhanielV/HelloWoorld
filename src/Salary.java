import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

int payRate = 15;
int maxHours = 40;

        System.out.println("How many hours?");

        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){

            System.out.println("Invalid entry. your hours must be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
