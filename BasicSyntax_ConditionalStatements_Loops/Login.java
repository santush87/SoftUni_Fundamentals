package BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        for (int i = 0; i < 4; i++) {
            String pass = scanner.nextLine();
            String res = "";
            for (int j = pass.length()-1; j >= 0; j--) {
                res += pass.charAt(j);
            }
            if (i == 3 && !username.equals(res)){
                System.out.printf("User %s blocked!%n", username);
                break;
            }

            if (username.equals(res)){
                System.out.printf("User %s logged in.%n", username);
                i = 4;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
