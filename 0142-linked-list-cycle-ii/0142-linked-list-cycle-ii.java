/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow , fast ;
        slow = fast = head ;
        while(fast!= null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                ListNode E = head ;
                while(E != slow){
                    E= E.next;
                    slow= slow.next;
                }
                return E ;
            }
        }
        return null ;
        
    }
}