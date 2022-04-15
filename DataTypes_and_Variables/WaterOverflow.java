package DataTypes_and_Variables;

import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 255;
        int sum = 0;
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            int line = Integer.parseInt(scanner.nextLine());
            if ((line+sum) <= max) {
                sum += line;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
