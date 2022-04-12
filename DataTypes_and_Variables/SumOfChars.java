package DataTypes_and_Variables;

import java.util.Scanner;

public class SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            char a = scanner.next().charAt(0);
            sum += a;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
