public class MergeTwoSortedLists {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode result = null;
            ListNode temp = null;
            if (l1 == null && l2 == null)
                return null;
            if (l1 == null && l2 != null)
                return l2;
            if (l1 != null && l2 == null)
                return l1;
            while (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    if (result == null){
                        result = new ListNode(l1.val);
                        temp = result;
                    }
                    else{
                        result.next = new ListNode(l1.val);
                        result = result.next;
                    }
                    l1 = l1.next;
                }else {
                    if (result == null){
                        result = new ListNode(l2.val);
                        temp = result;
                    }
                    else{
                        result.next = new ListNode(l2.val);
                        result = result.next;
                    }
                    l2 = l2.next;
                }
            }
            while (l1 != null){
                result.next = new ListNode(l1.val);
                result = result.next;
                l1 = l1.next;
            }
            while (l2 != null){
                result.next = new ListNode(l2.val);
                result = result.next;
                l2 = l2.next;
            }
            return temp;
        }
    }
}
