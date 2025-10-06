/*
        Best time to buy or sell 
 */

class solution {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
            } else if (prices[i] - minPrices > maxProfit) {
                maxProfit = prices[i] - minPrices;
            }
        }
        return maxProfit;
    }
}

public class leetCode_121 {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(sol.maxProfit(prices));

    }
}
