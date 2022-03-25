package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (0 <= number && number <=2) {
            System.out.println("baby");
        } else if (number < 14) {
            System.out.println("child");
        }else if (number < 20) {
            System.out.println("teenager");
        }else if (number < 66) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
