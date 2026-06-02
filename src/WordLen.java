class WordLen{
    public static void main(String args[]){
        String str="i love to code in java Programming";
        String[] words=str.split("   ");
        String large=" ";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>large.length()){
                large=words[i];
            }

        }
        System.out.println(large);
    }
}