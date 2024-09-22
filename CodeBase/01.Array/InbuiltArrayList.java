import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class InbuiltArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial list: " + list);

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding elements: " + list);

        list.add(1, "Orange");
        System.out.println("After inserting 'Orange' at index 1: " + list);

        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        list.set(0, "Grape");
        System.out.println("After replacing 'Apple' with 'Grape': " + list);

        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        list.remove("Orange");
        System.out.println("After removing 'Orange': " + list);

        boolean hasBanana = list.contains("Banana");
        System.out.println("Does the list contain 'Banana'? " + hasBanana);

        int size = list.size();
        System.out.println("Size of the list: " + size);

        System.out.println("Iterating over the list:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Iterating using an iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Adding all elements from another collection
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Peach", "Plum"));
        list.addAll(newList);
        System.out.println("After adding all elements from newList: " + list);

        //Removing all elements from another collection
        list.removeAll(newList);
        System.out.println("After removing all elements from newList: " + list);

        //Retaining only elements in another collection
        list.add("Plum");
        list.retainAll(newList);
        System.out.println("After retaining only elements from newList: " + list);

        //Converting the list to an array
        Object[] array = list.toArray();
        System.out.println("Array created from list: " + Arrays.toString(array));

        //Converting the list to a typed array
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("Typed array created from list: " + Arrays.toString(stringArray));

        //Sorting the list
        list.add("Banana");
        list.add("Apple");
        list.sort(Comparator.naturalOrder());
        System.out.println("After sorting: " + list);

        //Finding the index of an element
        int index = list.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);

        //Finding the last index of an element
        list.add("Banana");
        int lastIndex = list.lastIndexOf("Banana");
        System.out.println("Last index of 'Banana': " + lastIndex);

        //Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        //Creating a sublist
        List<String> subList = list.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);

        //Trimming the capacity of the list
        list.trimToSize();
        System.out.println("After trimming the list capacity: " + list);

        //Clearing the list
        list.clear();
        System.out.println("After clearing the list: " + list);

        //Checking size after clearing
        System.out.println("Size of the list after clearing: " + list.size());
    }


}




