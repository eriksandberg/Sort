/**
 * User: Erik
 * Date: 2018-04-12
 * Class implementing bogus sort
 */

import java.util.Random;

public final class BogoSort implements SortingAlgorithm {

    private int iterations = 1;
    private boolean sorted = false;

    public int[] sort(int[] array) {
        while (!sorted) {
            iterations++;
            shuffle(array);
            if (isSorted(array)) {
                sorted = true;
            }
        }
        System.out.println("Bogosort iterations needed: " + iterations);
        return array;
    }

    private static void shuffle(int[] array) {
        Random rand = new Random();
        rand.nextInt();
        for (int i = 0; i != array.length; ++i) {
            swap(array, i, rand.nextInt(array.length));
        }
    }

    private static void swap(int[] array, int first, int second) {
            int temp = array[second];
            array[second] = array[first];
            array[first] = temp;
        }

    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] > array[i]) return false;
        }
        return true;
    }

    public String getName() {
        String name = "Bogosort";
        return name;
    }
}
