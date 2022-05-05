# Question
Add Two Numbers

# Source
https://leetcode.com/problems/add-two-numbers/

# Solution
- Time Complexity: O(max(m,n))  
- Create ListNode *result* which will be used to return the sum as a linked list.
- 1)If *l1* is not null, add the value to the *sum*.
- 2)If *l2* is not null, add the value to the *sum*.
- 3)Create a new node with the digit value of and set it to current node's next.
- 4)If the *sum* is bigger than 9, set the *sum* to 1. Otherwise, set it to 0.
- 5)Advance current node to next.
- Repeat 1)-5) until l1 and l2 both become null.
- After the loop, if the *sum* is bigger than 9, Create a new node with 1 and set it to current node's next.
- Return *Result* head's next node.