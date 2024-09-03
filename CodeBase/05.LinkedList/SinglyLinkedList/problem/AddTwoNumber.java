package problem;

public class AddTwoNumber {

    /*
     * You are given two non-empty linked lists representing two non-negative
     * integers. The digits are stored in reverse order, and each of their nodes
     * contains a single digit. Add the two numbers and return the sum as a linked
     * list.
     * 
     * You may assume the two numbers do not contain any leading zero, except the
     * number 0 itself.
     * https://leetcode.com/problems/add-two-numbers/description/
     */

    // Input: l1 = [2,4,3], l2 = [5,6,4]
    // Output: [7,0,8]
    // Explanation: 342 + 465 = 807.

    // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    // Output: [8,9,9,9,0,0,0,1]

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.data : 0;
            int y = l2 != null ? l2.data : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        a3.next = null;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;

        display(addTwoNumbers(a1, b1));
    }

    private static void display(ListNode listNode) {
        if (listNode == null) {
            System.out.println("No data Found !");
            return;
        }
        ListNode temp = listNode;
        System.out.print("\n --> [");
        while (temp != null) {
            System.out.print(temp.next == null ? temp.data + "] --> null\n\n" : temp.data + ", ");
            temp = temp.next;
        }
    }

}
