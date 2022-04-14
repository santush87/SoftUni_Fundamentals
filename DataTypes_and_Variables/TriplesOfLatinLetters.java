package DataTypes_and_Variables;

import java.util.Scanner;

public class TriplesOfLatinLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                    char a = (char) ('a'+i);
                    char b = (char) ('a'+j);
                    char c = (char) ('a'+k);
                    System.out.printf("%c%c%c%n", a,b,c);
                }
            }
        }
    }
}
