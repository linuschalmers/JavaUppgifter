import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;  // The out stream

public class Week1Lect2 {


    public static void main(String[] args) {new Week1Lect2().program();}

    final Random rand = new Random();
    final Scanner sc = new Scanner(in);

    void program() {

        int[] arr = {1,2,3,4,5};
        out.println(arr[0]);

        arr[0] = 5;
        arr[1] = arr[0];

        int[] arr2 = new int[10];
        arr[0] = sc.nextInt();
    out.println(arr2.length);

        int j = 1;
        out.println(arr[j+1]);

        for(int i = 0 ; i < 5; i++) {
            if (arr[i] > 3) {
                out.println(arr[i]);

            }
        }

    }
}