public class opgaveMedArrays {
    public static void main(String[] args) {
        int[] arr = new int[8];

        arr[0] = 34;
        arr[7] = 117;

        for (int i = 0; i < 8; i++){
            System.out.println(arr[i]);
        }
        String[] strings = {"Hej", "med", "dig"};
        for(String str : strings) {
            System.out.print(str + " ");
            System.out.println();
        }

        double[] numbers = {3.4, 2.5, 1.2, 6.7};

        System.out.println(numbers[2]);
        System.out.println("Længde " + numbers.length);



    }
}
