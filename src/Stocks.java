public class Stocks{
    public static void main(String[] args) {
        System.out.println(profit(new int[]{100,180,260,310,40,535,695}));
    }
    public static int profit(int a[])
    {
        int buy=a[0];
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<buy) {
                profit +=( a[i - 1] - buy);
                if(i!=a.length-1){
                    buy=a[i];
                }
            }
            if(i==a.length-1)
            {
                profit+=(a[i]-buy);
            }
        }
        return profit;
    }
}