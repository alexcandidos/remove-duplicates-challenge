import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList();

        for(int i=0; i<100000; i++){
            if(i%2 == 0){
                names.add(String.format("email_%d@domain.com",i));
            }
            else {
                names.add("repeated_email@domain.com");
            }
        }

        System.out.println("Original email list:");
        System.out.println(names.toString());

        Set<String> myList = new LinkedHashSet<>(names);

        names.clear();
        names.addAll(myList);

        System.out.println("\nCleaned (no duplicates) email list:");
        System.out.println(names.toString());

    }
}
