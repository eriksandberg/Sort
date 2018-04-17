/**
 * User: Erik
 * Date: 2018-04-17
 * Class implementing insertion sort on generic objects
 */

public class InsertionSort /*implements SortingAlgorithm*/ {

    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 1; i < array.length; ++i) {
            T current = array[i];
            int n = i - 1;  // previous int
            while ( (n >= 0) && (array[n].compareTo(current) > 0) ) {    // While in bounds and previous is larger than current
                array[n + 1] = array[n];
                n--;
            }
            array[n + 1] = current;
        }
        return array;
    }

    public String getName() {
        String name = "Insertionsort";
        return name;
    }
}
