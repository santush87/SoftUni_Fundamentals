package DataTypes_and_Variables;

import java.util.Scanner;

public class PrintPartOfASCIITable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= last ; i++) {
            char a = (char) i;
            System.out.print(a + " ");
        }
    }
}
