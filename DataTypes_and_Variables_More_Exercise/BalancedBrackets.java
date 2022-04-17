package DataTypes_and_Variables_More_Exercise;

import java.util.Scanner;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int open = 0;
        int close = 0;

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char let = input.charAt(0);
                if (let == 40) {
                    open++;
                }
                if (let == 41) {
                    close++;
                }
            }
        }

        if (open == close) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
