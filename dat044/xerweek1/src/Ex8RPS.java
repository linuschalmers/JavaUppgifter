import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * The Rock, paper, scissor game.
 * See https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors
 *
 * This is exercising smallest step programming (no methods needed)
 * Write the full program in program()
 *
 * Rules:
 *
 *       -----------  Beats -------------
 *       |                              |
 *       V                              |
 *      Rock (1) --> Scissors (2) --> Paper (3)
 *
 */
public class Ex8RPS {

    public static void main(String[] args) {
        new Ex8RPS().program();
    }

    final Random rand = new Random();
    final Scanner sc = new Scanner(in);

    void program() {

        int maxRounds = 5;
        int human;          // Outcome for player
        int computer;       // Outcome for computer
        int result;         // Result for this round
        int round = 0;      // Number of rounds
        int total = 0;      // Final result after all rounds

        while (round < maxRounds) {  // Game loop
            // -------- Input --------------
            out.println("Welcome to Rock, Paper and Scissors");

            int datorVal = rand.nextInt(2) + 1;
            out.println(datorVal);

            int val1 = sc.nextInt();
            switch(val1) {
                case 1:
                    if (datorVal==2){
                        out.println("Dator wins!");
                        total--;
                    } else if(datorVal==3){
                        out.println("You win!");
                        total++;
                    } else{
                        out.println("Its a draw!");
                    }
                    break;
                case 2:
                    if (datorVal==3){
                        out.println("Dator wins!");
                        total--;
                    } else if(datorVal==1){
                        out.println("You win!");
                        total++;
                    } else{
                        out.println("Its a draw!");
                    }
                    break;
                case 3:
                    if (datorVal==1){
                        out.println("Dator wins!");
                        total--;
                    } else if(datorVal==2){
                        out.println("You win!");
                        total++;
                    } else{
                        out.println("Its a draw!");
                    }
                    break;

            }

            // ----- Process -----------------
            // There are other ways to compare (but it shouldn't be too long)


            // ---------- Output --------------

            round++;
        }

        out.println("Game over! ");
        if (total == 0) {
            out.println("Draw");
        } else if (total > 0) {
            out.println("Human won.");
        } else {
            out.println("Computer won.");
        }
    }
}
