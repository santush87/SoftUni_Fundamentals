package Arrays_Exercise;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int expSum = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1+i; j < numbers.length; j++) {
                if (expSum == (numbers[i] + numbers[j])){
                    System.out.println(numbers[i] +" " + numbers[j]);
                }
            }
        }
    }
}
