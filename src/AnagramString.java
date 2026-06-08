public class AnagramString {
    public boolean isAnagram(String s,String t){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        AnagramString as= new AnagramString();
        String t="anagram";
        String s="nagaram";
        System.out.println(as.isAnagram(s,t));
        System.out.println(as.isAnagram(t,s));
    }
}
