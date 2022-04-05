package DataTypes_and_Variables;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String result = "";
        double finaling = 0;

        for (int i = 0; i < number; i++) {
            double resi = 0;

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            resi = Math.PI * radius*radius * height;

            if (resi > finaling) {
                result = model;
                finaling = resi;
            }
        }

        System.out.println(result);
    }
}
