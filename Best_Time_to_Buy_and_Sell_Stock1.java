package com.Prime;

public class Best_Time_to_Buy_and_Sell_Stock1 {
	//Brute Force Approach
	// Time & Space Complexity
	/*
	 * Time Complexity: O(n) for aux creation + O(n) for final loop → still O(n) But
	 * this simulates an O(n²) brute-force logic by precalculating right max.
	 */

	public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[] aux = new int[n];
        int maxRight = prices[n - 1];

        // Fill the aux array from right to left
        for (int i = n - 1; i >= 0; i--) {
            maxRight = Math.max(maxRight, prices[i]);
            aux[i] = maxRight;
        }

        // Find max profit using aux array
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int profit = aux[i] - prices[i];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {5, 2, 6, 1, 4}; 
        System.out.println("Maximum Profit: " + maxProfit(prices));  // Output should be 7
    }
}
