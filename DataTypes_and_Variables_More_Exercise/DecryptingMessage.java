package DataTypes_and_Variables_More_Exercise;

import java.util.Scanner;

public class DecryptingMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String result = "";

        for (int i = 0; i < lines; i++) {
            char letter = scanner.nextLine().charAt(0);
            char finalLetter = (char) (letter + key);
            result += finalLetter;
        }

        System.out.println(result);
    }
}
