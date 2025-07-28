public class StockBuySell{

    public static int profit(int prices[]){

        int Maxprofit = 0;
        int BestBuy = prices[0];

        for(int i = 1 ; i<prices.length ; i++){
            if(prices[i]>BestBuy){
                Maxprofit = Math.max(Maxprofit, prices[i] - BestBuy);
            }
        BestBuy = Math.min(BestBuy, prices[i]);
        }
        

        return Maxprofit;
    }

    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};

        System.out.println(profit(price));
    }
}