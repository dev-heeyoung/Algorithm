# Question
Next Greater Element I

# Source
https://leetcode.com/problems/next-greater-element-i/

# Solution
 - Create stack and map.
 - Iterate over the *nums2* array from the left to right. Just push every element *nums2[i]* on the stack if the *nums2[i]* is less than the previous element. It happens because the *nums2[i]* is encountered so far is coming in descending order.
 - If *num2[i]* is greater than the previous element(=the element on the top of the stack), put the previous element as a key and the current element *nums2[i]* as a value into the map.
 - Repeat the above step until the stack is empty or the element on the top of the stack is greater than *nums2[i]*.
 - Iterate over the *nums1* array from the left to right. If the map has element *nums1[i]* as a key, set *nums1[i]* to the value for the key. Otherwise, set -1.
 - Return *nums1* after iteration.