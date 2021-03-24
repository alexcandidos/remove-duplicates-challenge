import java.util.*;

public class RemoveDuplicates {

    public static void fillList(ArrayList<String> list){

        for(int i=0; i<100000; i++) {
            if (i % 2 == 0) {
                // half of the items in this loop will be unique elements
                list.add(String.format("email_%d@domain.com", i));
            } else {
                //half of the items in this loop will be repeated elements
                list.add("repeated_email@domain.com");
            }
        }
    }

    public static void removeDuplicates(ArrayList<String> list){

        LinkedHashSet<String> myList = new LinkedHashSet<>(list);

        list.clear();
        list.addAll(myList);

    }

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();

        fillList(list);

        System.out.println("Original email list:");
        System.out.println(list.toString());

        removeDuplicates(list);

        System.out.println("\nCleaned (no duplicates) email list:");
        System.out.println(list.toString());

    }
}
