# Question
Last Stone Weight

# Source
https://leetcode.com/problems/last-stone-weight/

# Solution
- Time Complexity: O(nlog(n))
- Heap-Based Simulation : Max-Priority Queue
- Create Max-Priority Queue
- Store all the elements from *stones* array into the PriorityQueue *pq*
- Poll out the two largest elements from queue, smash them together, and put the result value into the queue. Repeat this step until the size of the queue become 1
- Return the left element in the queue
