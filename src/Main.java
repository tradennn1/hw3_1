import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        double[] numbers = {2.5, 5.1, -3.5, 6.8, -2.2, -9.2, 7.9, 1.2, -6.8, 3.3, 6.6, -8.8, 4.4, 9.9, -6.4};
        int numberCount = 0;
        double allNumber = 0.0;
        boolean proverka = false;
        for (double i : numbers) {
            if (i < 0) {
                proverka = true;
            } else if (i > 0 && proverka) {
                numberCount++;
                allNumber += i;
                System.out.println(i);
            }
        }
        System.out.println("Спедний ариф.число = " + allNumber / numberCount);


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }

    }
}




