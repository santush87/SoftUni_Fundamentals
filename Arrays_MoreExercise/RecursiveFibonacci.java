package Arrays_MoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.nextLine());

        if (1 <= number && number <= 50){
            long[] fibonachi = new long[50];
            fibonachi[0] = 1;
            fibonachi[1] = 1;
            for (int i = 2; i < 50; i++) {
                fibonachi[i] = fibonachi[i - 2] + fibonachi[i - 1];
            }
            System.out.println(fibonachi[(int) (number-1)]);
        }
    }
}
