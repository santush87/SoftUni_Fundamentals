package DataTypes_and_Variables_More_Exercise;

import java.util.Scanner;

public class FloatingEquality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double precision = 0.000001;

        double result = Math.abs(a - b);

        if (precision >= result) {
            System.out.println("True");;
        } else {
            System.out.println("False");
        }
    }
}
