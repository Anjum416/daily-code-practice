package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH {
    public static void main(String args[]) throws IOException {
        System.out.println("Starting my file");
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String path="C:\\Users\\HP\\IdeaProjects\\Ethnotech java\\src\\FileHandling\\text.txt";
        File f=new File(path);
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(" my output in a text file");
        bw.newLine();
        bw.write(inp);
        bw.close();
        fw.close();
    }
}