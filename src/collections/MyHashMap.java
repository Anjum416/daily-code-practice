package collections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("H1",1);
        map.put("H2",2);
        map.put("H3",3);
        map.put("H4",1);
        for(String key : map.keySet()){
            System.out.println(key + " : " +map.get(key));
        }
        for(Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println(map.putIfAbsent("House0",100));
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ": "+entry.getValue());
        }
        System.out.println(map.putIfAbsent("House0",100));
    }
}
