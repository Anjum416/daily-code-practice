package SerialDeserialization.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Mainn {
    public static void main(String[] args) throws IOException {
        Serial s=new Serial(1,"Anjum");
        s.display();
        String path="C:\\Users\\HP\\IdeaProjects\\Ethnotech java\\src\\SerialDeserialization\\s1.txt";
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}
