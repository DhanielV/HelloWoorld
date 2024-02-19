public class opgaveMedForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            int result = 2 * i;
            System.out.println("2 gange " + i + " = " +result);
        }
        for (int i = 2; i <= 12; i+=2){

            System.out.println("Talrække 1: " + i);
        }
        for (int i = 15; i <=79; i+=4){
            System.out.println("Talrække 2: " + i);
        }
        for (int i = 30; i >= -20; i-=10){
            System.out.println("Talrække 3: " + i);
        }
        for(int i = -7; i <= 13; i+=4){
            System.out.println("Talrække 4: " + i);
        }
        for(int i = 97; i >= 82; i-=3){
            System.out.println("Talrække 5: " + i);
        }
    }
}
