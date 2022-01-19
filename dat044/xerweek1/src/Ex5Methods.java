import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Implement methods to make program produce correct output (normally print true)
 *
 * See:
 * - ex4methods
 */
public class Ex5Methods {

    public static void main(String[] args) {
        new Ex5Methods().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // All, except last,  should print true
        // Uncomment one at the time
        out.println(sumTo(5) == 15);     // 1 + 2 + ... + 5 = 15
        out.println(sumTo(23) == 276);
        out.println(factorial(3) == 6);    // 3 * 2 * 1 = 6
        out.println(factorial(5) == 120);
        out.println(digitSum(1111) == 4);   // 1 + 1 + 1 + 1 = 4
        out.println(digitSum(12345) == 15);

        String winner = "Olle";
        // A special case, should print: "Winner is Olle" (or whatever name)
        //winnerMsg(winner);
    }

    // ------ Write methods below this  -----------
    static int sumTo (int number){
        int sum = 0;

        for (int i=0; i<=number; i++){
            sum += i;
        }
        return sum;
    }

    static int factorial(int number){
        int sum = 1;

        for (int i=number ; i>=1 ; i--){
            sum*=i;
        }
        return sum;
    }

    static int digitSum(int number){
        int sum = 0;
        int length = String.valueOf(number).length();

        String temp = Integer.toString(number);
        int[] siffra = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            siffra[i] = temp.charAt(i) - '0';
            sum += siffra[i];
        }
        return sum;
    }
}
