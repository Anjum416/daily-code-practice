package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    int roll;
    String name;

    Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
    public class IdName {
        public static void main(String[] args) {
            ArrayList<Students> list = new ArrayList<Students>();
            list.add(new Students(10, "Amul"));
            list.add(new Students(30, "Cherry munda"));
            list.add(new Students(13, "Anjum"));
            list.add(new Students(12, "Anjali"));
            list.add(new Students(8, "Akhila"));
            Comparator<Students> com = new Comparator<Students>(){
            public int compare (Students a, Students b){
                if (a.roll > b.roll) {
                    return 1;
                }
                return -1;

            }
        };

    Collections.sort(list,com);
    for(Students s:list){
        System.out.println(s.name +" : "+s.roll);
    }

    }
}
