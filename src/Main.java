/**
 * User: Erik
 * Date: 2018-04-12
 */

public final class Main {

    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();
        algorithms.setVerbose(true);
        algorithms.setTiming(true);

        //Generator generator = new Generator();

        int[] array = Generator.randArray(50); // 50 is the length of the array
        int[] array2 = array.clone();

        algorithms.bubbleSortStd(array);
        System.out.println("");
        algorithms.bubbleSortOpt(array2);
        System.out.println("");

        int[] array4 = Generator.incrArray(10); // Don't put this at > 20
        algorithms.bogoSort(array4);
        System.out.println("");

        MyPrefix[] prefixArray = Generator.prefixArray(10);
        algorithms.insertionSort(prefixArray);
    }
}