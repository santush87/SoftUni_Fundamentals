package Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String[] names = new String[count];
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            int sum = 0;

            for (int j = 0; j < names[i].length(); j++) {
                char a = names[i].charAt(j);
                if (a == 'a' || a == 'A' ||
                        a == 'e' || a == 'E' ||
                        a == 'i' || a == 'I' ||
                        a == 'o' || a == 'O' ||
                        a == 'u' || a == 'U') {

                    sum += a*names[i].length();
                } else {
                    sum += a/names[i].length();
                }
            }

            result[i] = sum;
        }

        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
