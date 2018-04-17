/**
 * User: Erik
 * Date: 2018-04-12
 * Class implementing standard and optimized bubble sort
 */

public class BubbleSort implements SortingAlgorithm {

    public int[] sort(int[] array) {
        for (int ignored : array) {
            for (int j = 0; j < array.length - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

    protected static void swap(int[] array, int first, int second) {
            int temp = array[second];
            array[second] = array[first];
            array[first] = temp;
        }

    public String getName() {
        String name = "Bubblesort";
        return name;
    }
}