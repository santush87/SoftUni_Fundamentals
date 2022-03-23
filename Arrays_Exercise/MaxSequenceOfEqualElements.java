package Arrays_Exercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int maxNum = 0;
        int maxCount = 0;
        int num = 0;
        int count = 1;

        for (int i = 0; i < numbers.length -1; i++) {

            if (numbers[i] == numbers[i+1]) {
                count++;
                num = numbers[i];
            } else {
                count = 1;
                num = 0;
            }
            if (maxCount < count) {
                maxCount = count;
                maxNum = num;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxNum + " ");
        }
    }
}
