package Arrays_Exercise;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int siquenceLenght = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int[] result = new int[siquenceLenght];
        int[] momentResult = new int[siquenceLenght];

        int count = 0;
        int maxCount = 0;
        int seqIndex = 1;
        int resSeqIndex = 1;

        int sum = 0;

        while (!input.equals("Clone them!")) {
            String[] arrInput = input.split("!+");

            for (int i = 0; i < siquenceLenght; i++) {
                momentResult[i] = Integer.parseInt(arrInput[i]);
            }

            for (int k : momentResult) {
                if (k == 1) {
                    count++;
                } else {
                    count = 0;
                }
                if (maxCount < count) {
                    maxCount = count;
                    resSeqIndex = seqIndex;
                    System.arraycopy(momentResult, 0, result, 0, result.length);
                }
            }

            input = scanner.nextLine();
            seqIndex++;
        }

        for (int j : result) {
            sum += j;
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",resSeqIndex, sum);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
