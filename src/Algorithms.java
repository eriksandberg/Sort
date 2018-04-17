/**
 * User: Erik
 * Date: 2018-04-12
 * Class containing calls to different sorting algorithms and some utility
 * The timing is in no way accurate, simply calculating the time past sorting seem to take about 900 ns
 */

public final class Algorithms {

    private boolean verbose = false;
    private boolean timing = false;
    private long time;

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public void setTiming(boolean timing) {
        this.timing = timing;
    }

    // Standard version
    public int[] bubbleSortStd(int[] array) {
        SortingAlgorithm algorithm = new BubbleSort();

        if (timing) {
            time = System.nanoTime();
            array = algorithm.sort(array);
            time = System.nanoTime() - time;
            System.out.println("Nano seconds elapsed: " + time);
        } else {
            array = algorithm.sort(array);
        }

        if (verbose) {
            System.out.println("Sorted with " + algorithm.getName());
            printArray(array, "Sorted array: ");
        }

        return array;
    }

    // Slightly optimized
    public int[] bubbleSortOpt(int[] array) {
        SortingAlgorithm algorithm = new BubbleSortOptimized();

        if (timing) {
            time = System.nanoTime();
            array = algorithm.sort(array);
            time = System.nanoTime() - time;
            System.out.println("Nano seconds elapsed: " + time);
        } else {
            array = algorithm.sort(array);
        }

        if (verbose) {
            System.out.println("Sorted with " + algorithm.getName());
            printArray(array, "Sorted array: ");
        }

        return array;
    }

    public int[] bogoSort(int[] array) throws UnreasonableLargeIntegerException {
        if (array.length > 20) {
            throw new UnreasonableLargeIntegerException("Unreasonable to expect bogosort to ever finish sorting array of length " + array.length);
        } else {
            SortingAlgorithm algorithm = new BogoSort();

            if (timing) {
                time = System.nanoTime();
                array = algorithm.sort(array);
                time = System.nanoTime() - time;
                System.out.println("Nano seconds elapsed: " + time);
            } else {
                array = algorithm.sort(array);
            }

            if (verbose) {
                System.out.println("Sorted with " + algorithm.getName());
                printArray(array, "Sorted array: ");
            }

            return array;
        }
    }

    private static void printArray(int[] array, String message) {
        System.out.print(message);
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; ++i) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}
