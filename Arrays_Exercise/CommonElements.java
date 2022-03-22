package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();

        String[] first = one.split(" ");
        String[] second = two.split(" ");

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i].equals(first[j])) {
                    System.out.print(second[i].toString() + " ");
                }
            }
        }
    }
}
