// Problem: Delete Node in Linked List
// Given only the node to delete

class DeleteNode {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void delete(ListNode node) {

        if (node == null || node.next == null) return;

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
