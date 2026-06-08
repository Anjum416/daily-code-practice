package collections;
import java.util.ArrayList;

public class LearnLists {
   public static void main(String args[]){
       ArrayList<String> list=new ArrayList<>(10);
      list.add("Harry Potter");
      list.add("Albus Dumbledore");
      list.add("Hagrid");
      list.add("VoldeMort");
      list.add("Hermione");
      list.add("Dobby");
      list.add("Ron");
      for(int i=0;i<list.size();i++){
          System.out.println(list.get(i));
      }
      for(String s:list){
          System.out.println(s);
      }
       System.out.println(list.remove(3));
       System.out.println(list.set(2,"Sirius Black"));
       System.out.println(list.contains("Sirius Black"));
       System.out.println(list);
   }
}
