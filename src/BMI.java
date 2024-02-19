import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BMI-beregner");

        System.out.println("Indtast vægt i kg");
        double weight = input.nextDouble();

        System.out.println("Indtast højde i meter");
        double height = input.nextDouble();
        double bmi = weight/(height*height);



        System.out.println("Dit BMI er: " + bmi);

        System.out.println("BMI under 18,5 er undervægtigt");
        System.out.println("BMI mellem 18,5 og 25 er normalvægtigt");
        System.out.println("BMI mellem 25 og 30 er overvægtigt");
        System.out.println("BMI på over 30 er svært overvægtigt");


        if (bmi < 18.4){
            System.out.println("Dit BMI på" + (bmi) + " indikerer at du er undervægtig");}

        else if  (bmi < 24.9) {
            System.out.println("Dit BMI på " + (bmi) + " indikerer at du er normalvægtig");
        }
        else if (bmi < 29.9) {
            System.out.println("Dit BMI på " + (bmi) + " indikerer at du er overvægtig");
        }
        else if (bmi > 30){
            System.out.println("Dit BMI på " + (bmi) + " indikerer at du er svært overvægtig");}


        System.out.println(
                "Husk at BMI kun er vejledende og  du er ikke nødvendigvis sund/usund udfra dit BMI");





    }
}
