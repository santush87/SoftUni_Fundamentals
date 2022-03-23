package Arrays_Exercise;

import java.util.Scanner;

public class TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /***** String[] ******/
        String[] input = scanner.nextLine().split(" ");

        /***** int[] с дължината на String[]-я ******/
        int[] res = new int[input.length];

        /****** String[] към int[] ******/
        for (int i = 0; i < input.length; i++) {
            res[i] = Integer.parseInt(input[i]);
        }

        /**** Първи LOOP, който следи ЛЯВАТА страна ********/
        for (int i = 0; i < res.length-1; i++) {

            /**** За проверка дали в края резултата ще е верен. Ако-Да, ще се стане TRUE,
             * ако-не, ще се обърне на FALSE.
             * При всяко ново завъртане ще започва като FALSE ******/
            boolean isTrue = false;
            //int, който ми пази моментната стойност, с която се работи!
            int num = res[i];

            /**** Втори LOOP, който следи ДЯСНАТА страна ********/
            for (int j = i+1; j <= res.length -1; j++) {

                /** Ако ДЯСНАТА страна е по-голяма, директно се прекъсва и isTrue става false
                 * и се минава на следващата стойност от ЛЯВАТА СТРАНА  **/
                if (res[i] <= res[j]) {
                    isTrue = false;
                    break;
                } else {
                    /** Ако никъде ДЯСНАТА не е била по-голяма,
                     * то тогава isTrue става true **/
                    isTrue = true;
                }
            }

            /** След като isTrue е вярно, значи можем да го отпечатаме**/
            if (isTrue) {
                System.out.print(num + " ");
            }
        }
        /*** Последното число винаги се отпечатва, защото след него няма по-голямо****/
        System.out.print(res[res.length-1]);
    }
}
