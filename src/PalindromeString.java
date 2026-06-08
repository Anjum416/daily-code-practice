public class PalindromeString{
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int right=s.length()-1;
        int left=0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                right--;
                left++;
            }
        }
        return true;
    }
    public static void main(String[] args){
        PalindromeString ps=new PalindromeString();
        String s1=" race car :";
        String s2="vikata* kavi";
        String s3="hdnnfjbjab";
        System.out.println(ps.isPalindrome(s1));
        System.out.println(ps.isPalindrome(s2));
        System.out.println(ps.isPalindrome(s3));
    }
}
