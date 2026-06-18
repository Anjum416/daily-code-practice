package FileHandling;
import java.io.*;

public class Read {
    public static void main(String args[]) throws IOException {
        String path="C:\\Users\\HP\\IdeaProjects\\Ethnotech java\\src\\FileHandling\\text.txt";
        File f =new File(path);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int ch;
        int c=0;
        while((ch=br.read())!=-1){
            System.out.print((char)(ch));
            c++;
        }
        //char a = (char) br.read();
        System.out.println(c);

    }

}
