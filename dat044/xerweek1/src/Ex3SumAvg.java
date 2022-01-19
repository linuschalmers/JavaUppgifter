import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - ex2ifwhile
 * - IW5LoopAndAHalf in particular.
 *
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here

        // -- Input (and bookkeeping) --

        int antal = 0;
        double number = 0;
        double total = 0;
        double Average;

        // -- Process --

        while (number!=-1){
            number = sc.nextInt();
            total += number;
            antal += 1;
        }

        // -- Output --

        out.print("Sum = " + (total+1) + " Avg = " + (total+1)/antal);
    }
}
