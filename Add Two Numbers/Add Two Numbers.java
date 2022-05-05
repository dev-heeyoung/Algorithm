class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int sum = 0;
        
        while(l1 != null || l2 != null) {
                      
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            tmp.next = new ListNode(sum % 10);
            sum = sum/10 == 1 ? 1 : 0;
            tmp = tmp.next;
        }
        
        if(sum == 1)
            tmp.next = new ListNode(1);

        return result.next;
    }
}