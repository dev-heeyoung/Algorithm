# Question
Reorder Data in Log Files

# Source
https://leetcode.com/problems/reorder-data-in-log-files/

# Solution
- Use Comparator to implement a logic for sorting
- Use indexOf to figure out the index of first character after identifier
- Case1) Two logs are digit-logs: consider it to equal so that it is sorted naturally
- Case2) The first log is digit-log and the second log is letter-log: return 1
- Case3) The first log is letter-log and the socond log is digit-log: return -1
- Case4) Two logs are letter-logs: Compare two strings with the built in sort feature
- Case5) Two letter-logs are same: Compare identifiers of two letter-logs with the built in sort feature
- Return the sorted String array
   