// Problem: Best Time to Buy and Sell Stock
// Description: Find the maximum profit from a single buy and sell
// Approach: Track lowest price and calculate profit dynamically
// Time Complexity: O(n)
// Space Complexity: O(1)

class StockProfitCalculator {

    public int calculateMaxProfit(int[] priceList) {

        int lowestSoFar = priceList[0];
        int bestProfit = 0;

        for (int i = 1; i < priceList.length; i++) {

            int currentPrice = priceList[i];

            // Calculate profit if sold today
            int profitToday = currentPrice - lowestSoFar;

            if (profitToday > bestProfit) {
                bestProfit = profitToday;
            }

            // Update lowest price seen so far
            if (currentPrice < lowestSoFar) {
                lowestSoFar = currentPrice;
            }
        }

        return bestProfit;
    }
}
