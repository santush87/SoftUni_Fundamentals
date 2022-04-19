package DataTypes_and_Variables_More_Exercise;

import java.util.Scanner;

public class DataTypeFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.printf("%s is %d type", input);
            input = scanner.nextLine();
        }
    }
}
