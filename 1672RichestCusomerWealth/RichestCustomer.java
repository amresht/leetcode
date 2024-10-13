/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
		int maxWealthSoFar  = 0;
		
		for (int[] customer : accounts) {
			int currentCustWealth = 0;
			
			for (int bank : customer) {
				currentCustWealth += bank;
			}
			
			maxWealthSoFar = Math.max(maxWealthSoFar, currentCustWealth);
		
		}
		return maxWealthSoFar;
    }
}