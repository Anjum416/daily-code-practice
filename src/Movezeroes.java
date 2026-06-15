
import java.util.Arrays;
class Movezeroes {
    public void moveZeroes(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Movezeroes mz=new Movezeroes();
        int[] arr1={4,5,0,1,9,0,5,0};
        int[] arr2={0,0,9,0,1,0};
        mz.moveZeroes(arr1);
        mz.moveZeroes(arr2);
    }
}

