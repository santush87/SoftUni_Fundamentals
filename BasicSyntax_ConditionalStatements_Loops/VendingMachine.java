package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = 0;
        double nuts = 2.0;
        double water = 0.70;
        double crisps = 1.50;
        double soda = 0.80;
        double coke = 1.0;

        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            if (input.equals("0.1") || input.equals("0.2") || input.equals("0.5") ||
                    input.equals("1") || input.equals("2")) {
                double price = Double.parseDouble(input);
                money += price;
                input = scanner.nextLine();
            } else {
                double price = Double.parseDouble(input);
                System.out.printf("Cannot accept %.02f%n", price);
                input = scanner.nextLine();
            }
        }

        if (input.equals("Start")){
            input = scanner.nextLine();

            while (!input.equals("End")) {
                switch (input) {
                    case "Nuts":
                        if (money >= nuts) {
                            System.out.printf("Purchased %s%n", input);
                            money -= 2;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        input = scanner.nextLine();
                        break;
                    case "Water":
                        if (money >= water) {
                            System.out.printf("Purchased %s%n", input);
                            money -= 0.7;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        input = scanner.nextLine();
                        break;
                    case "Crisps":
                        if (money >= crisps) {
                            System.out.printf("Purchased %s%n", input);
                            money -= 1.5;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        input = scanner.nextLine();
                        break;
                    case "Soda":
                        if (money >= soda) {
                            System.out.printf("Purchased %s%n", input);
                            money -= 0.8;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        input = scanner.nextLine();
                        break;
                    case "Coke":
                        if (money >= coke) {
                            System.out.printf("Purchased %s%n", input);
                            money -= 1;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        input = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Invalid product");
                        input = scanner.nextLine();
                        break;
                }
            }
            System.out.printf("Change: %.02f", money);
        }
    }
}
