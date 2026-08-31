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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;
        int firstCritical = -1;
        int prevCritical = -1;
        int currentIndex = 1;
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while (curr != null && curr.next != null) {
            // Check for local maxima or local minima
            if ((curr.val > prev.val && curr.val > curr.next.val) || 
                (curr.val < prev.val && curr.val < curr.next.val)) {
                
                if (firstCritical == -1) {
                    firstCritical = currentIndex;
                } else {
                    minDistance = Math.min(minDistance, currentIndex - prevCritical);
                    maxDistance = currentIndex - firstCritical;
                }
                prevCritical = currentIndex;
            }
            
            prev = curr;
            curr = curr.next;
            currentIndex++;
        }
        
        if (minDistance == Integer.MAX_VALUE) {
            return new int[] {-1, -1};
        }
        
        return new int[] {minDistance, maxDistance};
    }
}
