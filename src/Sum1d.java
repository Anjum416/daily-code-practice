public class Sum1d {
    public static void main(String[] args) {
        int[] arr = {10, 6, 0, 18, 11, 7, 24, 0, 5};
        for(int i=0;i<=3;i++){
            System.out.print(arr[i] +" ");
        }
        for (int i = 5; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            System.out.print(arr[i] +" ");
        }
    }
}