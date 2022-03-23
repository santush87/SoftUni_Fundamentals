package Arrays_Exercise;

import java.util.Scanner;

public class Zig_ZagArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] moment = input.split(" ");

            if (i % 2 == 0) {
                first[i] = moment[0];
                second[i] = moment[1];
            } else {
                second[i] = moment[0];
                first[i] = moment[1];
            }
        }

        for (String arr : first) {
            System.out.print(arr.toString() + " ");
        }

        System.out.println();

        for (String arr : second) {
            System.out.print(arr.toString() + " ");
        }
    }
}
