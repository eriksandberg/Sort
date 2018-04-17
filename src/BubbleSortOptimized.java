/**
 * User: Erik
 * Date: 2018-04-15
 * Class implementing optimized bubble sort
 */

public final class BubbleSortOptimized extends BubbleSort {

    public int[] sort(int[] array) {
        boolean issorted = false;
        int unsorted = array.length - 1;

        while (!issorted) {
            issorted = true;
            for (int i = 0; i < unsorted; ++i) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    issorted = false;
                }
            }
            unsorted--;
        }
        return array;
    }

    public String getName() {
        String name = "optimized Bubblesort";
        return name;
    }
}
