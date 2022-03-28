package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalAmount = 0;

        for (int i = 0; i < ordersCount; i++) {
            double orderPrice = 0;

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            orderPrice = pricePerCapsule * days * capsuleCount;
            totalAmount += orderPrice;

            System.out.printf("The price for the coffee is: $%.02f%n", orderPrice);
        }
        System.out.printf("Total: $%.02f", totalAmount);
    }
}
