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
    public void reorderList(ListNode head) {
        if(head.next == null){
            return;
        }

        int length = 0;
        ListNode tempHead = head;
        while(tempHead != null){
            length++;
            tempHead = tempHead.next;
        }

        tempHead = head;
        for(int i = 0 ; i < length / 2; i++){
            tempHead = tempHead.next;
        }

        ListNode tempNext;
        ListNode prev = null;

        while(tempHead != null){
            tempNext = tempHead.next;
            tempHead.next = prev;
            prev = tempHead;
            tempHead = tempNext;
        }

        


        ListNode tempLast = prev;
        tempHead = head;


        while(tempHead != null){
            tempNext = tempHead.next;
            tempHead.next = tempLast;
            tempHead = tempNext;
            if(tempLast != null){
                tempNext = tempLast.next;
                tempLast.next = tempHead;
                tempLast = tempNext;
            }
        }
        
    }
}
