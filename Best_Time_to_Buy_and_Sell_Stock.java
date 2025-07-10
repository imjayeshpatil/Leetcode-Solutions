package com.Prime;

public class Best_Time_to_Buy_and_Sell_Stock {

	//Approach: Single Pass / One-Pass Greedy Approach

	public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price so far
            minSoFar = Math.min(minSoFar, prices[i]);

            // Calculate profit if selling at current price
            int profit = prices[i] - minSoFar;

            // Update maxProfit if current profit is greater
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] prices = {5, 2, 6, 1, 4};  // You can change this input for testing
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
