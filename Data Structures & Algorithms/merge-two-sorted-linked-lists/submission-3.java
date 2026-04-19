/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }

        ListNode newList = new ListNode();
        ListNode ans = new ListNode(0, newList);
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                newList.val = list1.val;
                list1 = list1.next;
            }
            else{
                newList.val = list2.val;
                list2 = list2.next;
            }
            newList.next = new ListNode();
            newList = newList.next;
        }

        if(list1 == null){
            newList.val = list2.val;
            list2 = list2.next;
            while(list2 != null){
                newList.next = new ListNode();
                newList = newList.next;
                newList.val = list2.val;
                list2 = list2.next;
            }
        }
        else if(list2 == null){
            newList.val = list1.val;
            list1 = list1.next;
            while(list1 != null){
                newList.next = new ListNode();
                newList = newList.next;
                newList.val = list1.val;
                list1 = list1.next;
            }
        }

        
        return ans.next;
    }
}