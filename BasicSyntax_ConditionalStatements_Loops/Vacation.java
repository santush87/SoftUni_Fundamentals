package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        switch (day) {
            case "Friday":
                switch (group) {
                    case "Students":
                        if (count < 30) {
                            totalPrice = count * 8.45;
                        } else {
                            totalPrice = count * 8.45;
                            totalPrice -= totalPrice * 0.15;
                        }
                        break;
                    case "Business":
                        if (count < 100) {
                            totalPrice = count * 10.90;
                        } else {
                            totalPrice = (count - 10) * 10.90;
                        }
                        break;
                    case "Regular":
                        if (10 <= count && count <= 20) {
                            totalPrice = count * 15.0;
                            totalPrice -= totalPrice * 0.05;
                        } else {
                            totalPrice = count * 15.0;
                        }
                        break;
                }
                break;


            case "Saturday":
                switch (group) {
                    case "Students":
                        if (count < 30) {
                            totalPrice = count * 9.80;
                        } else {
                            totalPrice = count * 9.80;
                            totalPrice -= totalPrice * 0.15;
                        }
                        break;

                    case "Business":
                        if (count < 100) {
                            totalPrice = count * 15.60;
                        } else {
                            totalPrice = (count - 10) * 15.60;
                        }
                        break;

                    case "Regular":
                        if (10 <= count && count <= 20) {
                            totalPrice = count * 20.0;
                            totalPrice -= totalPrice * 0.05;
                        } else {
                            totalPrice = count * 20.0;
                        }
                        break;
                }
                break;


            case "Sunday":
                switch (group) {
                    case "Students":
                        if (count < 30) {
                            totalPrice = count * 10.46;
                        } else {
                            totalPrice = count * 10.46;
                            totalPrice -= totalPrice * 0.15;
                        }
                        break;

                    case "Business":
                        if (count < 100) {
                            totalPrice = count * 16.0;
                        } else {
                            totalPrice = (count - 10) * 16.0;
                        }
                        break;

                    case "Regular":
                        if (10 <= count && count <= 20) {
                            totalPrice = count * 22.50;
                            totalPrice -= totalPrice * 0.05;
                        } else {
                            totalPrice = count * 22.50;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.02f", totalPrice);
    }
}
