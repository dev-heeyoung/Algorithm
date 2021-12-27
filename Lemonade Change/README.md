# Question
Lemonade Change

# Source
https://leetcode.com/problems/lemonade-change/

# Solution
 - Initialize int *five* and *ten* to zero. It is for counting $5 and $10 bills.
 - Iterate int array bills.
 - A customer brings a $5 bill: We take $5 because we don't need to give change.
 - A customer brings a $10 bill: We should give a $5 bill.
 - A customer brings a $20 bill: We should give one $5 and one $10 bill if we have a $10 bill. We can give three $5 bills if we don't have a $10 bill.
 - Return false if *five* or *ten* is negative.
 - Return true if *five* and *ten* are equal to or greater than 0 until the loop ends.