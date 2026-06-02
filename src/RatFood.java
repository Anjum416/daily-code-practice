class RatFood {
    public static void main(String[] args) {
        int r = 7, unit = 2;
        int totalfood = r * unit;
        int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};
        int count = 0, totalamount = 0;
        for (int i = 0; i < arr.length; i++) {
            totalamount += arr[i];
            count++;
            if (totalamount >= totalfood) {
                System.out.println(count);
                break;
            }
        }
    }
}