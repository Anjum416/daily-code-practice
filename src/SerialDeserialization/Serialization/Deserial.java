package SerialDeserialization.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\HP\\IdeaProjects\\Ethnotech java\\src\\SerialDeserialization\\s1.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Serial s= (Serial) ois.readObject();
        s.display();
        ois.close();
        fis.close();

    }
}
