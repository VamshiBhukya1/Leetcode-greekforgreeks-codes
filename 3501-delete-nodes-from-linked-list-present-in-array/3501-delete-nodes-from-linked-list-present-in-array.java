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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        
       HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        // Dummy node to handle head removals easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        // Traverse the list and remove unwanted nodes
        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next; // Skip node
            } else {
                curr = curr.next; // Move forward
            }
        }

        return dummy.next;
    }}