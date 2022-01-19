import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ex5classes
 */
public class Ex6ClassObjects {

    public static void main(String[] args) {
        new Ex6ClassObjects().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // -------- Input ------------
        out.println("What is the name of hero 1?");
        String heroName1 = sc.next();

        out.println("How strong is " + heroName1 + "?");
        int heroStrength1 = sc.nextInt();

        out.println("What is the name of hero 2?");
        String heroName2 = sc.next();

        out.println("How strong is " + heroName2 + "?");
        int heroStrength2 = sc.nextInt();

        // ------- Output --------------

        if(heroStrength1>heroStrength2){
            out.println(heroName1 + " is stronger.");
        }else if (heroStrength2>heroStrength1){
            out.println(heroName2 + " is stronger.");
        }else if (heroStrength1==heroStrength2){
            out.println("They are equally strong.");
        }

    }

    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
