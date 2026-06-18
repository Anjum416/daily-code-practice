package SerialDeserialization.Serialization;

import java.io.Serializable;

public class Serial implements Serializable {
   int id;
   String name;
   public Serial(int id,String name){
       this.id=id;
       this.name=name;

    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
