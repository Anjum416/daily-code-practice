package FileHandling;

import java.io.*;

public class Byte2Byte {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting my file");
        String path="C:\\Users\\HP\\IdeaProjects\\Ethnotech java\\src\\FileHandling\\text.txt";
        File f1=new File(path);
        File f2=new File("C:\\Users\\HP\\IdeaProjects\\Ethnotech java\\src\\FileHandling\\text2.txt");
        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos2=new FileOutputStream(f2);
        int ch;
        while((ch=fis1.read())!=-1) {
            System.out.println((char) ch);
            fos2.write(ch);
        }
        fis1.close();
        fos2.close();

        }
    }
