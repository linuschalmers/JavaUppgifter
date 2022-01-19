import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Program to exercise arrays
 *
 * See:
 * - ex3arraysfor
 * - Check AF6AritmSeries
 */
public class Ex4Arrays {

    public static void main(String[] args) {
        new Ex4Arrays().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {

        int found = 0;
        int[] myNumbs = new int[] {0,0,0,0,0};
        myNumbs[0]= sc.nextInt();
        myNumbs[1]= sc.nextInt();
        myNumbs[2]= sc.nextInt();
        myNumbs[3]= sc.nextInt();
        myNumbs[4]= sc.nextInt();

        out.println("Array is " + Arrays.toString(myNumbs));

        for (int i = 0 ; i<5 ; i++ ){
            if (myNumbs[i]==1){
                out.println("Value 1 is at index " + i);
                found = 1;
            }
        }
        if (found==0){
            out.println("Value not found");
        }
    }
}
