package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrInput = input.split("\\s+");
        int[] numbers = new int[arrInput.length];

        int leftSide = 0;
        int rightSide = 0;
        int beginRight = 0;
        int result = 0;
        boolean isMatch = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrInput[i]);
        }

        if (numbers.length == 1) {
            System.out.println(0);
            isMatch = true;
        } else if (numbers.length == 2) {
            isMatch = false;
        } else {
            for (int left = 0; left < numbers.length - 2; left++) {

                leftSide += numbers[left];
                beginRight = left + 2;
                result++;

                for (int right = beginRight; right < numbers.length; right++) {
                    rightSide += numbers[right];
                }

                if (leftSide == rightSide) {
                    System.out.println(result);
                    isMatch = true;
                    break;
                } else {
                    rightSide = 0;
                }
            }
        }
        if (!isMatch) {
            System.out.println("no");
        }
    }
}

/******************************************************************************************/
/*
        import java.util.Arrays;
        import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] numbersS = line.split("\\s+");
        int[] numbers = Arrays.stream(numbersS).mapToInt(Integer::parseInt).toArray();

        int[] leftSums = new int[numbers.length];
        int[] rightSums = new int[numbers.length];
        int index = -1;

        leftSums[0] = 0;
        rightSums[0] = 0;
        for (int i = 1; i < numbers.length; i++) {
            rightSums[0] += numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i - 1 >= 0) {
                leftSums[i] = leftSums[i - 1] + numbers[i - 1];
                rightSums[i] = rightSums[i - 1] - numbers[i];
            }
            if (leftSums[i] == rightSums[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("no");
        } else {
            System.out.println(index);
        }
    }
}
*/
