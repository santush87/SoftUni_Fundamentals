package Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());

        String[] result = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            result[i] = input[(steps+i) % input.length];
        }

        for (String string : result) {
            System.out.print(string + "\\s+");
        }
    }
}
