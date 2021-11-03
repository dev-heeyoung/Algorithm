# Question
Best Time to Buy and Sell Stock

# Source
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

# Solution
I initialized min to the first element in the price array and max to 0. The variable 'min' means the lowest price and 'max' means the maximum difference (which will be the maximum profit) between two numbers in the given array. Using 'for loop', the min value is changed if there is a lower price. If the value is bigger than the min price, compare which is bigger between max(current max profit) and (prices[i] - currnet min price). Set the bigger value to a max variable. After for loop, returns max.