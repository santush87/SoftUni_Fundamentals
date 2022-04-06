package DataTypes_and_Variables;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int result = numberOfPeople / capacity;
        if (numberOfPeople % capacity != 0) {
            result += 1;
        }
        System.out.println(result);
    }
}
