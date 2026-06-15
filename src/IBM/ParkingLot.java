package IBM;
import java.util.Arrays;
public class ParkingLot {
    public static void main(String args[]) {

        ParkingLot pl = new ParkingLot();
        int[] p1 = {0, 0, 0,1 };
        System.out.println(pl.parking(p1));
    }
        public static int parking(int[] arr){
            int max = 0;
            int prev = -1;                        //no car //park yet
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    if (prev == -1) {
                        max = i;
                    }
                    prev = i;
                    max = Math.max(max, (i - prev) / 2);
                }
                max = Math.max(max,(arr.length-1-prev));
            }
            return max;
        }
    }