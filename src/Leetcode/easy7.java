/*Given a linked list, determine if it has a cycle in it.
Follow up:
Can you solve it without using extra space?*/
package Leetcode;

public class easy7 {
	public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head, slow = head;
        do {
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);

        return true;
    }

}
