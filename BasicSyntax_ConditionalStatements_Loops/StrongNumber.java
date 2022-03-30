package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int res = Integer.parseInt(input);

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int num = Integer.parseInt(input.charAt(i) +"");
            int fact = 1;

            for (int j = 1; j <= num; j++) {
                fact *= j;
            }
            sum += fact;
        }

        if (sum == res) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
