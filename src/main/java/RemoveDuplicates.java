import java.util.*;

public class RemoveDuplicates {

    /**
     * Fills a list with half of the repeated elements
     *
     * @param list     The list to be filled
     * @param listSize The list size
     */
    public static void fillList(ArrayList<String> list, int listSize) {

        for (int i = 0; i < listSize; i++) {

            if (i % 2 == 0) {
                // half of the items in this loop will be unique elements
                list.add(String.format("email_%d@domain.com", i));
            } else {
                //half of the items in this loop will be repeated elements
                list.add("repeated_email@domain.com");
            }
        }
    }

    /**
     * @param list The list to be cleared
     */
    public static void removeDuplicates(ArrayList<String> list) {
        /**
         * LinkedHashSet contains unique elements allows us to maintain the insertion order of the elements
         * It allows us to maintain the insertion order of the elements
         */
        LinkedHashSet<String> myList = new LinkedHashSet<>(list);

        list.clear();

        list.addAll(myList);

    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        int listSize = 100_000;

        fillList(list, listSize);

        System.out.println("Original email list:");

        System.out.println(list.toString());

        /**
         * We can use System.nanoTime() to measure elapsed time with nanosecond precision.
         * It returns the current value of the running JVM’s high-resolution time source, in nanoseconds.
         */
        long startTime = System.nanoTime();

        removeDuplicates(list);

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;

        System.out.println("\nCleared (no duplicates) email list:");

        System.out.println(list.toString());

        System.out.println(String.format("\nElapsed Time in seconds: %g", elapsedTimeInSecond));

    }
}
