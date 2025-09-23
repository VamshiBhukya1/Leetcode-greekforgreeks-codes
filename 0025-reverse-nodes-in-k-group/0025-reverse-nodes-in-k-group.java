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
   ListNode findkthNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    // Reverse a linked list and return new head
    static ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // Reverse nodes in groups of k
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null) {
            ListNode kthNode = findkthNode(temp, k);

            // If less than k nodes remain, connect and break
            if (kthNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            // Reverse current group
            ListNode newHead = reverse(temp);

            // Adjust head for first group
            if (temp == head) {
                head = newHead;
            } else {
                prevLast.next = newHead;
            }

            // Move prevLast to end of this group (which is old temp)
            prevLast = temp;

            // Move to next group
            temp = nextNode;
        }

        return head;
    }
}