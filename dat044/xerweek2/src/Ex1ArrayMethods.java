import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.lang.StrictMath.round;
import static java.lang.System.*;

/*
 *  Methods with array params and/or return value. Implement methods.
 *
 *  See:
 *  ex2references
 *  ex3methods
 *  ex4algorithms
 *  - in particular A1BasicAlgs
 */
public class Ex1ArrayMethods {

    public static void main(String[] args) {
        new Ex1ArrayMethods().program();
    }

    final static Random rand = new Random();

    void program() {
        int[] arr = {1, 2, 2, 5, 3, 2, 4, 2, 7};  // Hard coded test data

        // Uncomment one at a time and implement

        // Count occurrences of some element in arr
        out.println(count(arr, 2) == 4);      // There are four 2's
        out.println(count(arr, 7) == 1);

        // Generate array with 100 elements with 25% distribution of -1's and 1's (remaining will be 0)
        arr = generateDistribution(100, 0.25, 0.25);
        out.println(Arrays.toString(arr));
        out.println(count(arr, 1) == 25);
        out.println(count(arr, -1) == 25);
        out.println(count(arr, 0) == 50);

        // Generate array with 14 elements with 40% 1's and 30% -1's
        arr = generateDistribution(14, 0.4, 0.3);
        out.println(Arrays.toString(arr));
        out.println(count(arr, 1) == 6);
        out.println(count(arr, -1) == 4);

        for (int i = 0; i < 10; i++) {
            // Random reordering of arr, have to check by inspecting output
            shuffle(arr);
            out.println(Arrays.toString(arr));  // Does it look random?
        }
    }


    // ---- Write methods below this ------------

    int count(int[] arr, int tal){
        int antal = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == tal){
                antal++;
            }
        }
        return antal;
    }

    int[] generateDistribution (int first, double second, double third){
        int[] arr = new int[first];
        for (int i = 0; i <first*second; i++){
            arr[i] = 1;
        }
        for (int j = (int) (Math.round(first*second)); j <(first*second+first*third); j++){
            arr[j] = -1;
        }
        return arr;
    }

    void shuffle(int[] arr){

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
    }

   // TODO
}
