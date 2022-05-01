# Question
Merge Two Sorted Lists

# Source
https://leetcode.com/problems/merge-two-sorted-lists/

# Solution
## Solution 1) Recursion
-Time complextiy: O(n+m)
-case1) list1 is empty: No merge to perform
-case2) list2 is empty: No merge to perform
-case3) The head of list1 is smaller than the head of list2: Call the function recursively with list1.next and list2, and set them to the next for the head of list1.
-case4) The head of list2 is smaller than the head of list1: Call the function recursively with list1 and list2.next, and set them to the next for the head of list2.
-The recursion will eventually terminate because of case1/case2.

## Solution 2) Iteration
-Time complexity: O(n+m)
-Create new node *returnHead* to return the head of the merged list at the end.
-Node *tmpHead* is to move pointer to connect all the nodes in a one sorted list.
-Use while loop to make merge sorted list until list1 or list2 became empty: If the head of list1 is smaller than the head of list2, connect list1 to the *ReturnHead* and set the list1 to the next of list1, otherwise connect list2 to the *returnHead* and set the list2 to the next of list2.
-After the loop, connect the remaining nodes in list1/list2 to the merged list.
-Return the next of *returnHead*.