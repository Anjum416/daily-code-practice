import java.util.*;
class Password{
    public static int CheckPassword(String str,int n)
    {
    if(n<4)
        return 0;
    if(Character.isDigit(str.charAt(0)))
    return 0;
    int cap=0;
    int num=0;
    for(int i=0;i<n;i++ ) {
        char ch = str.charAt(i);
        if (ch == ' ' || ch == '/')
            return 0;
        if (Character.isDigit(ch))
            num++;
        if (Character.isUpperCase(ch))
            cap++;
        if (cap > 0 && num > 0) {
            return 1;
        }
    }
    return 0;
    }
    public static void main(String arg[]){
        String str="Aer4*gdhs1";
        System.out.println(CheckPassword(str,str.length()));
    }
}