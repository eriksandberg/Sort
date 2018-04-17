/**
 * User: Erik
 * Date: 2018-04-15
 * Class containing methods to generate arrays
 */

import java.util.ArrayList;
import java.util.Random;

public final class Generator {

    private Generator() {}
    private static Random rand = new Random();

    public static int[] randArray(int length) {
        int[] array = new int[length];

        int r = rand.nextInt(100);
        for (int i = 0; i < array.length; ++i) {
            array[i] = r;
            r = rand.nextInt(100);
        }

        return array;
    }

    public static int[] incrArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }

        return array;
    }

    public static MyPrefix[] prefixArray(int length) {
        MyPrefix[] array = new MyPrefix[length];

        for (int i = 0; i < array.length; ++i) {
            array[i] = new MyPrefix(randomPrefix());
        }

        return array;
    }

    // seems like random enum in Java 1.7 is close to impossible...
    private static Prefix randomPrefix() {
        int r = rand.nextInt(6);
        switch (r) {
            case 0:
                return Prefix.FEMTO;
            case 1:
                return Prefix.PICO;
            case 2:
                return Prefix.NANO;
            case 3:
                return Prefix.MICRO;
            case 4:
                return Prefix.MILLI;
            case 5:
                return Prefix.CENTI;
            case 6:
                return Prefix.DECI;
        }
        return Prefix.UNKNOWN;
    }
}