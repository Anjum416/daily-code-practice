public class kadanes {
    public static void main(String args[]){
        int arr[]={2, -5, 1, 7, -3, 4, -6};
        int currentsum=0;
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum=Math.max(arr[i],arr[i]+currentsum);
            maxsum=Math.max(currentsum,maxsum);
        }
        System.out.println(maxsum);
    }
}
