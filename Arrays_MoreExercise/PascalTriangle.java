package Arrays_MoreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int result = 1;

        for (int line = 0; line < number; line++) {
            for (int i = 0; i <= line ; i++) {
                if (i == 0 || i == line){
                   result = 1;
                } else {
                    result = result * (line - i + 1)/i;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
