# Question
How Many Apples Can You Put into the Basket

# Source
https://leetcode.com/problems/how-many-apples-can-you-put-into-the-basket/

# Solution
 - Sort the given int array *weight* because we have to return the maximum number of apples we can put in the basket.
 - Initialize int *sum* to 0. It is to record the current weight of the basket.
 - Declare int *i*. It is to count the number of apples we have put in the basket.
 - Iterate through the given array *weight* until *sum* reaches 5000.
 - Increase *sum* by the weight of the current apple.
 - Increase *i* by 1.
 - Return *i* after iteration.