import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {1.5, 3.4, 5.3, -2.5, 4.1, 6.1, -1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};
        double average = 0.0;
        int count = 0;
        boolean check = false;

        for (double i : fractionalNums) {
            if (i < 0) {
                check = true;
            } else if (i > 0 && check) {
                average += i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println(average / count);
    }
}