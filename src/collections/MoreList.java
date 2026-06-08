package collections;
import java.util.ArrayList;
import java.util.Arrays;

public class MoreList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Harry Potter");
        list.add("Albus Dumbledore");
        list.add("Hagrid");
        list.add("VoldeMort");
        list.add("Hermione");
        list.add("Dobby");
        list.add("Ron");

        Object[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}