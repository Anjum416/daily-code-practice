import java.util.Arrays;
class PrefixSum{
    public static void main(String args[]){
        int arr[]={10,6,0,18,11,7,24,0,5};
        int temp;
        for(int i=5;i<arr.length-1;i++){
            temp=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr) +" ");
    }
}