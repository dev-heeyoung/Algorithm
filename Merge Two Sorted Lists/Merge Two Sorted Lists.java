// Solution 1)
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

// Solution 2)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode returnHead = new ListNode(-1);
        ListNode tmpNode = returnHead;
        
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val){
                tmpNode.next = list1;
                list1 = list1.next;
            }else {
                tmpNode.next = list2;
                list2 = list2.next;
            }
            tmpNode = tmpNode.next;
        }
   
        tmpNode.next = list1 == null ? list2 : list1;
        
        return returnHead.next;
    }
}
