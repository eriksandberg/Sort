/**
 * User: Erik
 * Date: 2018-04-15
 * Class containing methods to generate arrays
 */

import java.util.ArrayList;
import java.util.Random;

public final class Generator {

    private Generator() {}

    static int[] randArray(int length) {
        Random rand = new Random();
        int[] array = new int[length];

        int r = rand.nextInt(100);
        for (int i = 0; i < array.length; ++i) {
            array[i] = r;
            r = rand.nextInt(100);
        }

        return array;
    }

    static int[] incrArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }

        return array;
    }
}