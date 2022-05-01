# Question
Merge k Sorted Lists

# Source
https://leetcode.com/problems/merge-k-sorted-lists/

# Solution
 -Time complexity: O(Nlog k) *k is the number of linked lists.
 -Space complexity: O(n) for creating a new linked list and O(k) for priority queue.
 -Create a PriorityQueue in ascending order.
 -Add nodes in the lists to the PriorityQueue.
 -Create new ListNode *head* for the merged sorted list and the ListNode *node* is set to *head*. 
 -1) Poll a ListNode from the Priority Queue and connect it to the merged list.
 -2) Set the *tail* to the next of *tail*.
 -3) add the next of *tail* to the queue.
 -Repeat 1)-3) until queue becomes empty.
 -Return the next of *head*.  