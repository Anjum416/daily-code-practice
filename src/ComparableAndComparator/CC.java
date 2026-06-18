package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CC {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(88);
        list.add(20);
        list.add(76);
        list.add(54);
        list.add(92);
        list.add(19);
//        Comparator<Integer> com = new Comparator<>() {
//            public int compare(Integer a, Integer b) {
//                if (a % 10 > b % 10){
//                    return 1;
//            }
//           return -1;
//        }
//    };
        Comparator<Integer> com=(a, b)-> a % 10 > b % 10 ? 1 :-1;
        Collections.sort(list,com);
        System.out.println(list);
}
}