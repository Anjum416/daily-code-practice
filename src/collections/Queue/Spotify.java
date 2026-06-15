package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Spotify {
    public static void main(String[] args) {
        Queue<String> p = new LinkedList<>();
        p.add("Dandelions");
        p.add("Happier than ever");
        p.add("style");
        p.add("Cheap thrills");
        p.add("Safari");
        p.add("Summer time sadness");
        p.add("Wildest dream");
        p.add("affilia");
        p.add("Forever Young");
        p.add("Night Changes");
        Scanner sc=new Scanner (System.in);
        int choice;
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                if(!p.isEmpty()){
                    System.out.println("add a new song:");
                    String ns=sc.nextLine();
                    p.add(ns);
                    System.out.println(ns+" song added");

                }
                else{
                    System.out.println("playlist is empty");
                }
                break;
            case 2:
                if(!p.isEmpty()){
                String rs = p.poll();
                System.out.println("Removed: " + rs);
        } else {
            System.out.println("Playlist is empty!");
        }
        break;

        case 3:
            if (!p.isEmpty()) {
            System.out.println("Currently Playing: " + p.peek());
        } else {
            System.out.println("Playlist is empty!");
        }
        break;
            case 4:
                System.out.println(p);
                break;
            default:
                System.out.println("Invalid entry");

                }
        System.out.println(p);
        }

}
